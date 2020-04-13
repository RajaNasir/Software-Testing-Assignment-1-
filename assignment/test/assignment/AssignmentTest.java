/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment;

import static assignment.Assignment.functionAdd;
import static assignment.Assignment.functionDivision;
import static assignment.Assignment.functionMultiply;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

@RunWith(Parameterized.class)
public class AssignmentTest {
    private int a;
    private int b;
    
    public AssignmentTest(int a, int b) {
        this.a=a;
        this.b=b;
    }

    @Parameterized.Parameters
    public static Collection parameters()
    {
       return Arrays.asList(new Object[][] {
           {1,5},
           {2,8},
           {18,10},
           {7,1},
       });
    }
    @BeforeMethod
    void details()
    {
         System.out.println("This is add multiply and subtract values according to your desire.");
    }
    /**
     * Test of functionAdd method, of class Assignment.
     */
    @Test
    public void testFunctionAdd()
    {
         boolean expected=true;
         boolean value=functionAdd(a,b);
         boolean value2=functionAdd(a,b);
         
         assertEquals(expected,value);
        assertNotEquals(expected,value2);
        
        assertTrue(value);
        assertFalse(value2);
        
        assertNotNull(value);
        assertNotNull(value2);
        
        assertNotSame(expected,value2);
        assertSame(expected,value);
        
        //fail();//we use this to check if it actually failed the test or not.
    }

    /**
     * Test of functionMultiply method, of class Assignment.
     */
    @Test
    public void testFunctionMultiply() {
        
         boolean expected=true;
         boolean value=functionMultiply(a,b);
         boolean value2=functionMultiply(a,b);
         
         assertEquals(expected,value);
        assertNotEquals(expected,value2);
        
        assertTrue(value);
        assertFalse(value2);
        
        assertNotNull(value);
        assertNotNull(value2);
        
        assertNotSame(expected,value2);
        assertSame(expected,value);
        
        //fail();//we use this to check if it actually failed the test or not.
    }

    /**
     * Test of functionDivision method, of class Assignment.
     */
    @Test
    public void testFunctionDivision() {
    }

    /**
     * Test of main method, of class Assignment.
     */
    @AfterMethod
    public void afterDetails()
    {
         System.out.println("The Values is as showed above.");
   
    }
}
