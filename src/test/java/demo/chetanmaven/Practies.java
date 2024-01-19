package demo.chetanmaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practies {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		
		
		
		driver.get("https://firstcry.com/");
		
//		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
	 System.out.println(driver.getTitle());
	 
//	 Thread.sleep(4000);
	 
	 System.out.println(driver.getCurrentUrl());
	 driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 System.out.println(driver.getTitle());
	 System.out.println(driver.getCurrentUrl());
	 Thread.sleep(4000);
driver.navigate().back();
Thread.sleep(3000);
driver.navigate().forward();
driver.navigate().refresh();
driver.close();
	}

}
