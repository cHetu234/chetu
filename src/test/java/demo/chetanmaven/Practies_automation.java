package demo.chetanmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practies_automation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	WebElement  a1=driver.findElement(By.xpath("//input[@id='username']"));
	a1.sendKeys("Amar");
	Thread.sleep(2000);
	WebElement a2=driver.findElement(By.xpath("//input[@id='password']"));
	a2.sendKeys("che123");
	
driver.findElement(By.xpath("//input[@id='Login']")).click();

Thread.sleep(2000);
driver.findElement(By.partialLinkText("Forgot You")).click();

    WebElement a3 =  driver.findElement(By.xpath("//input[@id='un']"));
    a3.click();
    a3.sendKeys("chetan");
    
WebElement a4 = driver.findElement(By.xpath("//input[@id='continue']"));	
      a4.click();
      
	
	
		
		
		


	}

}
