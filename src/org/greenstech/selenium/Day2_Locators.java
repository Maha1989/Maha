package org.greenstech.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_Locators {

	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\GreensTech\\Selenium\\Automation\\driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
	
	
		
		// Question 1 - Facebook
		
				driver.get("https://www.facebook.com/");
				
				//email id
				
				WebElement mail = driver.findElement(By.xpath("//input[@id='email']"));
				mail.sendKeys("maha_paneer@yahoo.com");
				
				//password
				
				WebElement pwd = driver.findElement(By.xpath("//input[@id='pass']"));
				pwd.sendKeys("Smile@123");
				
				// Login
						
				WebElement lgnbtn = driver.findElement(By.xpath("//label[@id='loginbutton']"));
				lgnbtn.click();
		
		
		//Question 2 - red bus
		
		driver.get("https://www.redbus.in/");
		
		WebElement frm = driver.findElement(By.xpath("//input[@id='dest']"));
		frm.sendKeys("Salem");
		
		
		WebElement to = driver.findElement(By.xpath("//input[@id='src']"));
		to.sendKeys("Chennai");
		
		//Question 3 - Google
		
		driver.get("https://www.google.com");
		
		WebElement search = driver.findElement(By.xpath("//input[@title='Search']"));
		search.sendKeys("GreensTechnology");
		
		
		
		//Question 4 - ICICI
		
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		
		//email id
		
		WebElement icicimail = driver.findElement(By.xpath("//input[@id='AuthenticationFG.USER_PRINCIPAL']"));
		icicimail.sendKeys("maha_paneer@yahoo.com");
		
		//password
		
		WebElement icicipwd = driver.findElement(By.xpath("//input[@id='AuthenticationFG.ACCESS_CODE']"));
		icicipwd.sendKeys("123423423");
						

		
		//Question 5 - HDFC
		
		driver.get("https://netbanking.hdfcbank.com");
		
		WebElement custid = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		custid.sendKeys("39906532");
		
		//input[@name='fldLoginUserId']
		//span[@class='pwd_field']
	
		//Question 6 
		
		driver.get("https://www.swiggy.com/");
		
		WebElement loc = driver.findElement(By.xpath("//input[@id='location']"));
		loc.sendKeys("Madipakkam");
		
		
		//Question 7 - snapdeal
		
		driver.get("https://www.snapdeal.com/login");
		
		WebElement login = driver.findElement(By.xpath("//input[@id='userName']"));
		login.sendKeys("9952393721");
		
		
		// Question 8 -instagram
		
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
		
		WebElement uname = driver.findElement(By.xpath("//input[@name='username']"));
		uname.sendKeys("abcdefg");
		
		WebElement pswd = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		pswd.sendKeys("1234");
		
		
		//Question 9 - irctc
		
		driver.get("https://www.irctc.co.in/");
		
		WebElement src = driver.findElement(By.xpath("//input[@placeholder='From*']"));
		src.sendKeys("abcdefg");
		
		WebElement dest = driver.findElement(By.xpath("//input[@placeholder='To*']"));
		dest.sendKeys("1234");
		
		
		
		//Question 10 
		
		driver.get("https://www.adactin.com/HotelApp/");
		
		WebElement user1 = driver.findElement(By.xpath("//input[@id='username']"));
		user1.sendKeys("abcdefg");
		
		WebElement pass1 = driver.findElement(By.xpath("//input[@id='password']"));
		pass1.sendKeys("1234");
		
		
		
		driver.quit();
		
	}
}
