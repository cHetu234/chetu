package demo.chetanmaven;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandalingRadiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(3000);
		WebElement radio1= driver.findElement(By.xpath("//input[@value='radio1']"));
		WebElement radio2=driver.findElement(By.xpath("//input[@value='radio2']"));
		WebElement radio3=driver.findElement(By.xpath("//input[@value='radio3']"));
		radio1.click()
		System.out.println(radio1.isSelected());
		System.out.println(radio1.isDisplayed());
		System.out.println(radio1.isEnabled());
		
		radio2.click();
		System.out.println(radio2.isSelected());
		System.out.println(radio2.isDisplayed());
		System.out.println(radio3.isEnabled());
		
		radio3.click();
		System.out.println(radio1.isSelected());
		System.out.println(radio3.isDisplayed());
		System.out.println(radio2.isEnabled());
		


	}

}
