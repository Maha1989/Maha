package org.greenstech.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D3Q6 {
	 public static void main(String[] args) {
		 
		 System.setProperty("webdriver.chrome.driver", "F:\\GreensTech\\Selenium\\Automation\\driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.redbus.in");
			
			driver.findElement(By.id("hc")).click();
			
			
			
			
		
	}
	
	

}
