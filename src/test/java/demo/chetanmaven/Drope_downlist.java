package demo.chetanmaven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Drope_downlist {

	@Test
	public void verifyDropdown() throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice");
	
	Thread.sleep(2000);
	  WebElement drope= driver.findElement(By.id("dropdown-class-example"));

	 
	  Select s =new Select(drope);
	  List<WebElement> test=s.getOptions();
	  for(WebElement e:test)
	  
	  {
		  System.out.println(e.getText());
	  }
	  {
		  System.out.println("list"+test.size());
	  }
//	  s.selectByIndex(1);
//	  Thread.sleep(2000);
	  
//	  s.deselectByValue(null);
	  
//	  s.deselectByVisibleText("Option3");
	}
		
		

	}


