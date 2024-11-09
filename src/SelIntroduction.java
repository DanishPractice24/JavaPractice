import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Invoking Browser
		// Chrome- ChromeDriver ->Methods
		//Firefox- FirefoxDriver ->Methods
		//safari SafariDriver->Methods
		//WEbDriver methods + class methods
		
		// Chromedriver.exe-> Chrome browser
		//step to invoke chrome driver
		//Selenium Manager
		
		// Microsoft edge
		System.setProperty("webdriver.edge.driver", "D:\\Browsers\\Edge\\msedgedriver.exe");
		WebDriver driver1 = new EdgeDriver();
		
		// Chrome
		System.setProperty("webdriver.chrome.driver", "D:\\Browsers\\Chrome\\chromedriver.exe");
		WebDriver driver2 = new ChromeDriver();
		
		driver1.get("https://rahulshettyacademy.com/");
		System.out.println(driver1.getTitle());
		System.out.println(driver1.getCurrentUrl());
		//driver.close();
		//driver.quit();
		driver2.get("https://rahulshettyacademy.com/");
		System.out.println(driver2.getTitle());
		System.out.println(driver2.getCurrentUrl());
		
		 
		

	}

}
 