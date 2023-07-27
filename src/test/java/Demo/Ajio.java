package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ajio {
  @Test
  public void ajiotest() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.ajio.com/");
	  driver.close();
	  Thread.sleep(3000);
	  System.out.println("Hi made Change ");
  }
}
