package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntra {
		 public void myntratest() throws InterruptedException {
			  WebDriver driver=new ChromeDriver();
			  driver.get("https://www.myntra.com/");
			  driver.close();
			  Thread.sleep(3000);

	}

}
