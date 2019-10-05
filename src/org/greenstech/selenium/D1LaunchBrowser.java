package org.greenstech.selenium;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class D1LaunchBrowser {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Browser name :");
		String browser = sc.next();
				
		if(browser.equalsIgnoreCase("chrome"))
		
		{
		//configure  chrome Driver
		
		System.setProperty("webdriver.chrome.driver", "F:\\GreensTech\\Selenium\\Automation\\driver\\chromedriver.exe");
		
		
		//Launch the  Browser
		
		WebDriver driver = new ChromeDriver();
		
		
		//To get URL
		
		driver.get("http://www.greenstechnologys.com/");
		driver.get("http://gmail.com/");
		driver.get(" http://www.flipkart.com/");		
		
		}
		
		else if(browser.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "F:\\GreensTech\\Selenium\\Automation\\driver\\IEDriverServer.exe");
			
			WebDriver driver = new InternetExplorerDriver();
			
			driver.get("http://www.greenstechnologys.com/");
			driver.get("http://demo.automationtesting.in/Register.html");		
		}
		
	
		else
		{
			
			System.setProperty("webdriver.gecko.driver", "F:\\GreensTech\\Selenium\\Automation\\driver\\geckodriver.exe");

			
			WebDriver driver = new FirefoxDriver();
			
			driver.get("https://netbanking.hdfcbank.com");
			
			WebElement custmrid = driver.findElement(By.xpath("//span[@class='pwd_field']"));
			custmrid.sendKeys("39906532");
			
			driver.get("http://www.greenstechnologys.com/");
			driver.get("https://www.facebook.com/");
			driver.get(" https://www.amazon.in");
			driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
			
		}
		
		
		
	}
	
	

}
