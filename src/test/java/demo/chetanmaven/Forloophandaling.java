package demo.chetanmaven;

import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Forloophandaling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	List<WebElement> e = driver.findElements(By.xpath("//input[@type='checkbox']"));
	List<WebElement> e1 = driver.findElements(By.xpath("//input[@name='radioButton']"));
	
	for (int i=0; i<e.size(); i++)
	{
		e.get(i).click();
	}
	
for(WebElement k:e1)
	{
	   k.click();
	}
		
	
	
		
		

				
	}

}
