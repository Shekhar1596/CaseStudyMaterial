package testngFeatures;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoAssertions {
  @Test
  public void Test1() {
	  System.out.println("Test 1 started");
	  Assert.assertTrue(20>18, "Error Msg- 20 is greater than 18");
	  System.out.println("Test 1 completed");
	  
  }
  
  @Test
  public void Test2() {
	  System.out.println("Test 2 started");
	  Assert.assertFalse(20>18, "Error Msg- 20 is greater than 18");
	  System.out.println("Test 2 completed");
  }
  
  @Test
  public void Test3() {
	  
	  Assert.assertTrue("Selenium".contains("ba"));
	  
  }
  
  @Test
  public void Test4() {
	  
	  Assert.assertSame("Selenium","Sele");
	  
  }
  
  @Test
  public void Test5() {
	  
	  Assert.assertNotSame("Selenium","Sele");
	  
  }
  
  @Test
  public void Test6() {
	  Object test = null;
	  Assert.assertNull(test);
	  
  }
  
  @Test
  public void Test7() {
	  Object test = null;
	  Assert.assertNotNull(test);
	  
  }
  
  @Test
  public void Test8() {
	  
	  Assert.fail("I wanted it to fails son");
	  
  } 
}
