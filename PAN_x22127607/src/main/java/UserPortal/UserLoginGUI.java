package UserPortal;

import javax.swing.*;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import userlogin.UserLoginGrpc;
import userlogin.UserLoginOuterClass.GetUserTasksRequest;
import userlogin.UserLoginOuterClass.GetUserTasksResponse;
import userlogin.UserLoginOuterClass.TaskResponse;

import java.awt.event.*;

public class UserLoginGUI {
  private JFrame frame;
  private JPanel panel;
  private JTextField userIdField;
  private JButton getUserTasksButton;
  private JTextArea tasksArea;
  private ManagedChannel channel;
  
  public UserLoginGUI() {
    createGUI();
    channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                                   .usePlaintext()
                                   .build();
  }
  
  private void createGUI() {
    frame = new JFrame("User Login");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
    
    userIdField = new JTextField(20);
    panel.add(new JLabel("User ID:"));
    panel.add(userIdField);
    
    getUserTasksButton = new JButton("Get User Tasks");
    getUserTasksButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        // Call the GetUserTasks service and display the response in the tasks area
        String userId = userIdField.getText();
        GetUserTasksResponse response = UserLoginGrpc.newBlockingStub(channel).getUserTasks(GetUserTasksRequest.newBuilder().setUserId(userId).build());
        for (TaskResponse task : response.getTasksList()) {
          tasksArea.append(task.getTaskName() + "\n");
        }
      }
    });
    panel.add(getUserTasksButton);
    
    tasksArea = new JTextArea(10, 20);
    JScrollPane scrollPane = new JScrollPane(tasksArea);
    panel.add(new JLabel("Tasks:"));
    panel.add(scrollPane);
    
    frame.getContentPane().add(panel);
    frame.pack();
    frame.setVisible(true);
  }
  
  public static void main(String[] args) {
    UserLoginGUI gui = new UserLoginGUI();
  }
}

