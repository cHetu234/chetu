package demo.chetanmaven;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
	WebElement username = driver.findElement(By.id("username"));
	username.click();
	username.sendKeys("chetan@123");
	
	WebElement password =driver.findElement(By.id("password"));
	
	password.click();
	password.sendKeys("fhetan@123");
	
	WebElement click =driver.findElement(By.id("Login"));
	Thread.sleep(2000);
	click.click();
	
	
	System.out.println(driver.getTitle());
	String expected_title="Login | Salesforce";
	String actual_title=driver.getTitle();
	assertEquals(expected_title,actual_title);
	System.out.println("the title is verified and correct");
	System.out.println("passed....");

//		driver.get("https://www.youtube.com/watch?v=b_hMbeKMC5U");
//		driver.manage().window().maximize();
//		WebElement xyz = driver.findElement(By.xpath("ytp-play-button ytp-button"));
//		
//		
//		xyz.click();
	
		

	}

}
