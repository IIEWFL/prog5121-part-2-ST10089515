/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
public class TaskEx1 {
    Dashbord db = new Dashbord();
   String name ;
        String desc ;
        String dev ;
        double dur ;
    public void methods(){
      name = JOptionPane.showInputDialog("Enter Task Name");
         desc = JOptionPane.showInputDialog("Enter Task Description");
         dev = JOptionPane.showInputDialog("Enter Developer Details");
         dur = Double.parseDouble(JOptionPane.showInputDialog("Enter Task Duration"));
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
     
    
    public boolean checkTaskDescription(String desc){
        
        if(desc.length()<=50){
        
         Pattern digit = Pattern.compile("[0-9]");
          Matcher hasDigit = digit.matcher(desc);
          
            JOptionPane.showMessageDialog(null,"Text successfully captured");
        
            return hasDigit.find();
        
        }
        else{
        JOptionPane.showMessageDialog(null,"Please enter a task description of less than 50 characters");
        
        }
    
    
    
    return false;
    }
    
    public String createTaskID(String ID){
    Dashbord bd = new Dashbord();
    
   int num1=0;
        
               

        
        char [] firstTwo = new char [2];
        int start = 0;
        int end = 2;
        name.getChars(start, end, firstTwo, 0);
        
        
        String dev = JOptionPane.showInputDialog("Enter Developer Details");

        String lastThree = dev.substring(dev.length()-3,dev.length());
        
        
        ID = (firstTwo+":"+num1+":"+lastThree);
        return ID;
   
    }
    
     public String printTaskDetails (String name,String desc,String dev, double dur){
    
        String detail="";
        TasksEx ex = new TasksEx ();
//        name = JOptionPane.showInputDialog("Enter Task Name");
//        desc = JOptionPane.showInputDialog("Enter Task Description");
//        dev = JOptionPane.showInputDialog("Enter Developer Details");
//        double dur = Double.parseDouble(JOptionPane.showInputDialog("Enter Task Duration"));
       
    char [] firstTwo = new char [2];
        int start = 0;
        int end = 2;
        name.getChars(start, end, firstTwo, 0);
        
        char letter1 = name.charAt(0);
        char letter2 = name.charAt(1);
        
//        for(int i =0; i<=db.num4; i++)
//        {
        TaskEx1 ex1 = new TaskEx1();
//            ArrayList<String> details = new ArrayList<String>();
//           TaskEx1 ex1 = new TaskEx1(); 
//            details.add(ex1.name);
//            details.add(ex1.desc);
//            details.add(ex1.dev);
//            
//         JOptionPane.showMessageDialog(null, "Tasks");
//         for(String s : details){
//         
//         JOptionPane.showMessageDialog(null, s);
//         
//         }
        
            ex1.methods();
         JOptionPane.showMessageDialog(null, ex1.printTaskDetails(ex1.name, ex1.desc, ex1.dev, ex1.dur));

        
        
       // String dev = txtDetails.getText();
        String lastThree = dev.substring(dev.length()-3,dev.length());
        int num1=0;
        
                  //JOptionPane.showMessageDialog(null,"Task Name:\t"+name+"\n"+"Task Description:\t"+desc+"\n"+"Developer Details:\t"+dev+"\n"+"Duration:\t"+dur+"\n"+"Task ID:\t"+letter1+letter2+":"+num1+":"+lastThree);
        num1++;
       // ex.createTaskID("");

        
        
        detail = "Task Name:\t"+name+"\n"+"Task Description:\t"+desc+"\n"+"Developer Details:\t"+dev+"\n"+"Duration:\t"+dur+"\n"+"Task ID:\t"+letter1+letter2+":"+num1+":"+lastThree;
        //}
    return detail;
    }

    
    
    
    
    
    
    
    
    
    
 public static void main(String args[]) {
 
 TaskEx1 ex = new TaskEx1();
 
 ex.methods();
 JOptionPane.showMessageDialog(null, ex.printTaskDetails(ex.name, ex.desc, ex.dev, ex.dur));
         
 
 }   
}

