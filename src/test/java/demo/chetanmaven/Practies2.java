package demo.chetanmaven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practies2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		
          List<WebElement> e=  driver.findElements(By.xpath("//input[@name='radioButton']"));
          Thread.sleep(2000);
          
          for(int i=0; i<e.size();i++)
          {
        	  e.get(i).click();
          }
List<WebElement> q=driver.findElements(By.xpath("//input[@type='checkbox']"));
Thread.sleep(2000);

for(int i=0; i<q.size(); i++)
{
	q.get(i).click();
}	



	}

}
