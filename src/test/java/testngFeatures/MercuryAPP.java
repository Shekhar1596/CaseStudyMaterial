package testngFeatures;

import org.testng.annotations.Test;

public class MercuryAPP {
  @Test(priority=1)
  public void openBrowser() {
	  System.out.println("Its openBrowser");
  }
  
  @Test(priority=2)
  public void openURL() {
	  System.out.println("Its openURL");
  }
  
  @Test(priority=3)
  public void Login() {
	  System.out.println("Its login");
  }
  
  @Test(priority=4,enabled=false)
  public void searchFlight() {
	  System.out.println("Its searchFlight");
  }
  
  @Test(priority=5)
  public void bookFlight() {
	  System.out.println("Its bookFlight");
  }
  
  @Test(priority=6)
  public void logout() {
	  System.out.println("Its logout");
  }
  
  @Test(priority=7)
  public void closeBrowser() {
	  System.out.println("Its closeBrowser");
  }
}
