package org.greenstech.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Modifiers {
	
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\GreensTech\\Selenium\\Automation\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement day = driver.findElement(By.id("day"));
		
		Select s = new Select(day);
		
		//To check whether the DD is multiple
		
		boolean m = s.isMultiple();
		System.out.println(m);
		
		//To get the count
		
		List<WebElement> op = s.getOptions();
		int size = op.size();
		System.out.println(size);
		
		//To select the options
		
		s.selectByIndex(0);
		
	//	s.selectByValue("1");
	//	s.selectByVisibleText("1");
		
		//To get all the options in the DD using getText
		
		List<WebElement> op1 = s.getOptions();
		for(int i=0;i<op1.size();i++) {
			WebElement txt1 = op1.get(i);
			
			String text1 = txt1.getText();
			System.out.println(text1);
		}
		
		
		//To get all the options in the DD using getAttribute
		
		List<WebElement> op2 = s.getOptions();
		for (WebElement x : op2) {
			String att = x.getAttribute("value");
			System.out.println(att);
			
		}
		
		
		
		
		
		
		
		


		
		
		
		

	}

}
