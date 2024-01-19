package demo.chetanmaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingOpestionsButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		WebElement opetion1=driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		opetion1.click();
		System.out.println(opetion1.isSelected());
		System.out.println(opetion1.isDisplayed());
		System.out.println(opetion1.isEnabled());

	}

}
