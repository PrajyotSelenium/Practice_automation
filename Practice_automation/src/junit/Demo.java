package junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Demo {
       @BeforeClass
       public static void beforeClass()
       {
    	   System.out.println("Before class method");
       }
       @AfterClass
       public static void afterClass()
       {
    	   System.out.println("After class method");
       }
       @Before
       public void before()
       {
    	   System.out.println("Before method");
       }
       @After
       public void after()
       {
    	   System.out.println("After method");
       }
       @Test
       public void test()
       {
    	   System.out.println("Test method");
       }
}
