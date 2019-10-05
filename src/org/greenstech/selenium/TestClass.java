package org.greenstech.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClass {
	
public static void main(String[] args) throws InterruptedException {
		
		
		//Configure the Driver
		
		System.setProperty("webdriver.gecko.driver", "F:\\GreensTech\\Selenium\\Automation\\driver\\geckodriver.exe");

	
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://netbanking.hdfcbank.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='input_password']")).sendKeys("39906531");
		
		//input[@name='fldLoginUserId'] 	 	
		//span[@class='pwd_field']
	
		
		//To get URL
		
		driver.get("https://www.facebook.com/");
		
		//To get title
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//To get Current Url
		
		String cu = driver.getCurrentUrl();
		System.out.println(cu);
		
		//To find the email id
		
		WebElement mail = driver.findElement(By.xpath("//input[@type='email']"));
		mail.sendKeys("abcde");
		
		//To find password
		WebElement pwd = driver.findElement(By.xpath("//input[@data-testid='royal_pass']"));
		pwd.sendKeys("123213");
		
		//Click Login
		WebElement lgn = driver.findElement(By.xpath("//input[@type='submit']"));
		
		
		//To Close browser
		driver.quit();
		
}
}
