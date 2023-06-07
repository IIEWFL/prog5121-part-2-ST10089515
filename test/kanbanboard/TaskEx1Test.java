/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package kanbanboard;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;



/**
 *
 * @author Dr. M.S Fanana
 */
public class TaskEx1Test {
    
    public TaskEx1Test() {
    }

    @Test
    public void testMethods() {
        System.out.println("methods");
        TaskEx1 instance = new TaskEx1();
        instance.methods();
        fail("The test case is a prototype.");
    }

    @Test
    public void testCheckTaskDescription() {
          TaskEx1 ts = new TaskEx1();
        boolean output = ts.checkTaskDescription("Create login to authenticate users");
        assertEquals(true, output);
    }

    @Test
    public void testCreateTaskID() {
         TaskEx1 ts = new TaskEx1 ();
        String expected = ts.createTaskID("Allan", "Fred");
        String actual = ts.createTaskID(expected, 0, expected);
        assertEquals(expected, actual);
       

    @Test
    public void testReturnTotalHours() {
       Task ts = new Task();
        int expected = ts.returnTotalHours(0, 0);
        int actual = ts.returnTotalHours(0, 0);
        assertEquals(expected, actual);
    }

    @Test
    public void testPrintTaskDetails() {
       TaskEx1 ts = new TaskEx1();
        String expected = ts.printTaskDetails("To-do", "Login feature", "AD:1:BYN", "Create login to authenticate users", "Mike", "Smith", 0, 0);
        String actual = ts.printTaskDetails(expected, expected, expected, expected, expected, expected, 0, 0);
        assertEquals(expected, actual);
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TaskEx1.main(args);
        fail("The test case is a prototype.");
    }
    
    }
}
