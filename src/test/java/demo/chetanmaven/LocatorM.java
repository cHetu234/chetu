package demo.chetanmaven;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorM {

	public static void main(String[] args) {
		// TODO Auto-generated method stubusername
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		WebElement un = driver.findElement(By.name("username"));
		un.click();
		un.sendKeys("Vikarm");
		
//		WebElement cde = driver.findElement(By.name("password"));
//		cde.click();
//		cde.sendKeys("vikram123");
//		
//		WebElement efg = driver.findElement(By.tagName("submit"));
//		efg.click();
//		
//		System.out.println(driver.getTitle());
//		String expected_title="OrangeHRM";
//		String actual_title=driver.getTitle();
//		assertEquals(expected_title,actual_title);
//		System.out.println("the title is verified and correct");
//		System.out.println("passed....");
		
		

	}

}
