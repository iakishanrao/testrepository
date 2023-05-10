package selenium_ex;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class OpenURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Browser\\chromedriver.exe");
	   ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
	    ChromeDriver driver = new ChromeDriver(options);
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

}
