package org.greenstech.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bjavascript {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\GreensTech\\Selenium\\Automation\\driver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		//Q1
		
				driver.get("https://www.facebook.com/");
				
			
	
              	WebElement email = driver.findElement(By.id("email"));
            
              	WebElement pwd = driver.findElement(By.id("pass"));
              	WebElement btn = driver.findElement(By.id("loginbutton"));
	
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].setAttribute('value','Saranya')", email);
	
	js.executeScript("arguments[0].setAttribute('value','1233')", pwd);
	
	//email value
	Object text1 = js.executeScript("return arguments[0].getAttribute('value')", email);
	
	String s = (String)text1;
	System.out.println(s);
	
	//pwd value
    Object text2 = js.executeScript("return arguments[0].getAttribute('value')", pwd);
	
	String s1 = (String)text2;
	System.out.println(s1);
	
	
	
	
	js.executeScript("arguments[0].click()",btn);
	
	}
	
	
	

}
