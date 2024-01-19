package demo.chetanmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		driver.findElement(By.partialLinkText("Forgot Your")).click();
		WebElement click = driver.findElement(By.partialLinkText("Use Custom"));
		System.out.println(click.isDisplayed());
		System.out.println(click.isEnabled());
		
		
	}

}
