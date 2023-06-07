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

