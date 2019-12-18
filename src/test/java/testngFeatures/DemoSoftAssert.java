package testngFeatures;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoSoftAssert {
  @Test
  public void f() {
	  System.out.println("Test 1 started");
	  SoftAssert sa = new SoftAssert();
	  System.out.println("Check 1st condition");
	  sa.assertEquals("Hello", "Hi");
	  System.out.println("Checking 1st condition");
	  sa.assertNotEquals(10, 10, "Erroe Msg - Both values are same");
	  sa.assertAll();
	  System.out.println("Test 1 completed");
  }
}
