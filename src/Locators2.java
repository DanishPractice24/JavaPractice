

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;


public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		String name = "Danish";
//		System.setProperty("webdriver.chrome.driver", "D:\\Browsers\\Chrome\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.edge.driver", "D:\\Browsers\\Edge\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = getPassword(driver); 
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password); 
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);	
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+ name + ",");
		
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
//		driver.close();
	}
	
	
	public static String getPassword(WebDriver driver) throws InterruptedException  {
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		//Place use temporary password 'rahulshettyacademy' to login.
		String[] passwordArray = passwordText.split("'");
//		String[] passwordArray2 = passwordText.split("'");
//		passwordArray2[0];
		String[] passwordArray1 = passwordText.split("'");
//		String[] passwordArray2 = passwordArray[1].split("'");
//		passwordArray2[0]
		String password = passwordArray1[1].split("'")[0];
		return password;
//		0th index - Please use temporary password
//		1st intex - reahulshettyacademy' to login.
		
//		0th index - rahulshettyacademy' to login.
//		1st index - to login
		
		
		
	}

}
