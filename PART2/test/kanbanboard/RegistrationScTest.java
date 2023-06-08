/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package kanbanboard;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 
 */
public class RegistrationScTest {
    
    RegistrationSc reg = new RegistrationSc();
    public RegistrationScTest() {
    }

    @Test
    public void testCheckUsername() {
        
       
        
        String username1 = "Kyl_1";
        String username2 = "kyle!!!!!!!";
        
      //  assertEquals(expexted,username);
RegistrationSc sc = new RegistrationSc();
//boolean name = sc.checkUsername(expexted);

      Assert.assertTrue(true==sc.checkUsername(username1));
      assertFalse(true==sc.checkUsername(username2));
       
    


        
        
    }

    @Test
    public void testSetData() throws Exception {
    }

    @Test
    public void testCheckPasswordComplexity() {
        RegistrationSc sc = new RegistrationSc();
        String password = "Ch&&sec@ke99!";
        
         Assert.assertTrue(true==sc.checkPasswordComplexity(password));
             

        
        
        
        
        
    }
    @Test
    
    public void testCheckPassowrdComplexity(){
    RegistrationSc sc = new RegistrationSc();
    String password2 = "password";
     Assert.assertFalse(true==sc.checkPasswordComplexity(password2));
    
    
    }

    @Test
    public void testGetFirstname() {
    }

    @Test
    public void testSetFirstname() {
    }

    @Test
    public void testGetNames() {
    }

    @Test
    public void testMain() {
    }
    
}
