package selenium_ex;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Addcustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Browser\\chromedriver.exe");
		   ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
		    ChromeDriver driver = new ChromeDriver(options);
		    driver.get("http://demo.guru99.com/telecom/addcustomer.php");
		    
		    //driver.findElement(By.id("done")).click();
		    driver.findElement(By.id("fname")).sendKeys("Ananta Kishan Rao");
		    driver.findElement(By.id("lname")).sendKeys("Irukulla");  
		    driver.findElement(By.name("emailid")).sendKeys("iakishanrao@gmail.com");
		    driver.findElement(By.xpath("//textarea[@name=\"addr\"]")).sendKeys("Padmaraonagar, Hyderabad");
		    driver.findElement(By.xpath("//*[@id=\"telephoneno\"]")).sendKeys("9849164726");
	}

}
