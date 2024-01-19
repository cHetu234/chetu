package demo.chetanmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.agent.builder.AgentBuilder.CircularityLock.Default;

public class LOCATEROS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement un=driver.findElement(By.xpath("//input[@name='username']"));
		un.sendKeys("Adminq");
		
		Thread.sleep(2000);
		
		WebElement pw = driver.findElement(By.xpath("//input[@name='password']"));
         pw.sendKeys("admin1213");
         
         Thread.sleep(2000);
         WebElement log = driver.findElement(By.xpath("//button[@type='submit']"));
         log.click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//p [@class=oxd-text oxd-text--p orangehrm-login-forgot-header)).click(); 
        	
//         String expected_title="OrangeHRM";
// 		String actual_title=driver.getTitle();
// 		System.out.println("the titel is verifed is correct");
// 		System.out.println("pass...");
 		
 		
         
	}

}
