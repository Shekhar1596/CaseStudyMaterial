package testngFeatures;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DemoDataProvider {
  @Test(dataProvider = "credentials")
  public void login(String username, String password) {
	  System.out.println("Username is: "+username);
	  System.out.println("Password is: "+password);
  }

  @DataProvider(name="credentials")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Lalitha", "Password123" },
      new Object[] { "Lone", "Wolf" },
      new Object[] { "Selenium", "Basic" },
    };
  }
}
