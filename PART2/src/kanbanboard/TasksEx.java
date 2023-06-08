/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kanbanboard;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Dr. M.S Fanana
 */
public class TasksEx extends javax.swing.JFrame {
     Dashbord db = new Dashbord();

    /**
     * Creates new form TasksEx
     */
    public TasksEx() {
        initComponents();
    }
/**
 ## CODE ATTRIBUTION 
#References generated from W3Schools httpswww.w3schools.comcscs_user_input.php

generated from WebGentle httpswww.youtube.comwatchv=vWN4Zmkd4hM

KevinTheTechLover httpswww.youtube.comwatchv=0n_-Jwb2Xkc

Gamaliel Menil httpswww.youtube.comwatchv=az8mHaJXpRE

generated from W3Schools httpswww.w3schools.comcscs_user_input.php

Arrays in java: Microsoft. (n.d.). Arrays in Jvaa. Retrieved April 28, 2023, from https://docs.microsoft.com/en-us/dotnet/csharp/programming-guide/arrays/

Console class in java: Microsoft. (n.d.). Console Class. Retrieved April 28, 2023, from https://docs.microsoft.com/en-us/dotnet/api/system.console?view=net-6.0

switch statement in java: Microsoft. (n.d.). switch statement (Java reference). Retrieved April 28, 2023, from https://docs.microsoft.com/en-us/dotnet/csharp/language-reference/keywords/switch string class in java: Microsoft. (n.d.). String Class. Retrieved April 28, 2023, from https://docs.microsoft.com/en-us/dotnet/api/system.string?view=net-6.0 double data type in java: Microsoft. (n.d.). Floating-Point Numeric Types. Retrieved April 28, 2023, from https://docs.microsoft.com/en-us/dotnet/csharp/language-reference/builtin-types/floating-point-numeric-types

Object-oriented programming (OOP) concepts: Wikipedia contributors. (2023, April 22). Object-oriented programming. In Wikipedia, The Free Encyclopedia. Retrieved April 28, 2023, from https://en.wikipedia.org/wiki/Object-oriented_programming

## How the programs works

This is a Java Swing class that represents the login screen of a Kanban board application. The user can enter their username and password and then click the "LOGIN" button to log in to the application. If the user doesn't have an account, they can click the "Don't Have an Account? Register here." button to be redirected to the registration screen.

The class contains several Swing components such as a JLabel, a JTextField, a JPasswordField, and two JButtons. The initComponents() method initializes these components and sets up their properties such as their text, font, and color.

The loginbtnMouseClicked() method is called when the user clicks on the "LOGIN" button. It reads the username and password entered by the user and then checks if they match the ones stored in a file. If the username and password are correct, it displays a message saying "Login Successful" and redirects the user to the Kanban board screen. If the username and password are incorrect, it displays an error message saying "Invalid Username or Password".

The registerbtnActionPerformed() method is called when the user clicks on the "Don't Have an Account? Register here." button. It redirects the user to the registration screen.
 **/
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        txtDetails = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDuration = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cbStatus = new javax.swing.JComboBox<>();
        btnCon = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,70));

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Task Name:");

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Task Description");

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Developer Details");

        txtDescription.setBackground(new java.awt.Color(0, 0, 0));
        txtDescription.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        txtDescription.setForeground(new java.awt.Color(255, 255, 255));
        txtDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescriptionActionPerformed(evt);
            }
        });

        txtDetails.setBackground(new java.awt.Color(0, 0, 0));
        txtDetails.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        txtDetails.setForeground(new java.awt.Color(255, 255, 255));

        txtName.setBackground(new java.awt.Color(0, 0, 0));
        txtName.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Task Duration");

        jLabel8.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Task Status");

        txtDuration.setBackground(new java.awt.Color(0, 0, 0));
        txtDuration.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        txtDuration.setForeground(new java.awt.Color(255, 255, 255));
        txtDuration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDurationActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("TASK DETAILS");

        cbStatus.setBackground(new java.awt.Color(0, 0, 204));
        cbStatus.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        cbStatus.setForeground(new java.awt.Color(255, 255, 255));
        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TO DO ", "DONE ", "DOING" }));
        cbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbStatusActionPerformed(evt);
            }
        });

        btnCon.setBackground(new java.awt.Color(0, 0, 204));
        btnCon.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        btnCon.setForeground(new java.awt.Color(255, 255, 255));
        btnCon.setText("CONTINUE");
        btnCon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConMouseClicked(evt);
            }
        });
        btnCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                        .addGap(190, 190, 190))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                            .addComponent(txtDetails)
                            .addComponent(txtName)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(btnCon, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btnCon)
                .addGap(109, 109, 109))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtDescription, txtDetails, txtDuration, txtName});

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 830, 490));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dr. M.S Fanana\\Videos\\111.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbStatusActionPerformed
   
     
    
    
     
     
     
     
     
//    public int Num (int Z){
//    
//        
//     //int num = Integer.parseInt(JOptionPane.showInputDialog("Enter number of tasks?"));
//
//   
//   ArrayList <Integer> numbers = new ArrayList <Integer>();
//   
//  // numbers.add(num);
//   
//   for(int a: numbers){
//            System.out.println(a);
//
//}
//   
//   return Z;
//}
              

    public boolean checkTaskDescription(String description){
        
        if(description.length()<=50){
        
         Pattern digit = Pattern.compile("[0-9]");
          Matcher hasDigit = digit.matcher(description);
          
            JOptionPane.showMessageDialog(this,"Text successfully captured");
        
            return hasDigit.find();
        
        }
        else{
        JOptionPane.showMessageDialog(this,"Please enter a task description of less than 50 characters");
        
        }
    
    
    
    return false;
    }
    
    
    private void txtDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescriptionActionPerformed

     
    
    public String createTaskID(String ID){
    Dashbord bd = new Dashbord();
    
   int num1=0;
        
                String name = JOptionPane.showInputDialog("Enter Task Name");

        
        char [] firstTwo = new char [2];
        int start = 0;
        int end = 2;
        name.getChars(start, end, firstTwo, 0);
        
        
        String dev = JOptionPane.showInputDialog("Enter Developer Details");

        String lastThree = dev.substring(dev.length()-3,dev.length());
        
        
        ID = (firstTwo+":"+num1+":"+lastThree);
        return ID;
   
    }
    
    
    
    private void txtDurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDurationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDurationActionPerformed

    
    
    private void btnConMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConMouseClicked

         TasksEx ex = new TasksEx();
         
         //ex.createTaskID(  String ID);
        String name = JOptionPane.showInputDialog("Enter Task Name");
        String desc = JOptionPane.showInputDialog("Enter Task Description");
        String dev = JOptionPane.showInputDialog("Enter Developer Details");
        double dur = Double.parseDouble(JOptionPane.showInputDialog("Enter Task Duration"));
        
      
          
   int num1=0;
   int ID =0;
        
   
   
      //  String name = txtName.getText();
        
        char [] firstTwo = new char [2];
        int start = 0;
        int end = 2;
        name.getChars(start, end, firstTwo, 0);
        
        char letter1 = name.charAt(0);
        char letter2 = name.charAt(1);
        
        
        
       // String dev = txtDetails.getText();
        String lastThree = dev.substring(dev.length()-3,dev.length());
        
        
        //ID = (firstTwo+":"+num1+":"+lastThree);
        
       
      JOptionPane.showMessageDialog(this,"Task Name:\t"+name+"\n"+"Task Description:\t"+desc+"\n"+"Developer Details:\t"+dev+"\n"+"Duration:\t"+dur+"\n"+"Task ID:\t"+letter1+letter2+":"+num1+":"+lastThree);
        




        // TODO add your handling code here:
    }//GEN-LAST:event_btnConMouseClicked
   public String printTaskDetails (String details){
    
        
        TasksEx ex = new TasksEx ();
        
        int td=50;
       String name = JOptionPane.showInputDialog("Enter Task Name");
        String desc = JOptionPane.showInputDialog("Enter Task Description");
        String dev = JOptionPane.showInputDialog("Enter Developer Details");
        double dur = Double.parseDouble(JOptionPane.showInputDialog("Enter Task Duration"));
    char [] firstTwo = new char [2];
        int start = 0;
        int end = 2;
        name.getChars(start, end, firstTwo, 0);
        
        char letter1 = name.charAt(0);
        char letter2 = name.charAt(1);
        
        for(int i =0; i<=db.num4; i++)
        {
        
        
        
       // String dev = txtDetails.getText();
        String lastThree = dev.substring(dev.length()-3,dev.length());
        int num1=0;
        
                  JOptionPane.showMessageDialog(this,"Task Name:\t"+name+"\n"+"Task Description:\t"+desc+"\n"+"Developer Details:\t"+dev+"\n"+"Duration:\t"+dur+"\n"+"Task ID:\t"+letter1+letter2+":"+num1+":"+lastThree);
        num1++;
       // ex.createTaskID("");

        }
        
    return details;
    }
    private void btnConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConActionPerformed

//        for(int i =0; i<= db.num3;i++){
//        
//            
//        
//        
//        }
//        
//        
       





        // TODO add your handling code here:
    }//GEN-LAST:event_btnConActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TasksEx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TasksEx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TasksEx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TasksEx.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TasksEx().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCon;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtDetails;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
