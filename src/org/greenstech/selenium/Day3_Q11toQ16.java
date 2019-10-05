package org.greenstech.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day3_Q11toQ16 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\GreensTech\\Selenium\\Automation\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Question 16
		
		driver.get("https://www.swiggy.com");
		driver.findElement(By.xpath("//a[@class='r2iyh']")).click();
		driver.findElement(By.id("mobile")).sendKeys("9952393721");
		driver.findElement(By.id("name")).sendKeys("Maha");
		driver.findElement(By.id("email")).sendKeys("maha_paneer@yahoo.com");
		driver.findElement(By.id("password")).sendKeys("Test@1234");
		driver.findElement(By.xpath("//a[@class='a-ayg']")).click();
		
		//Question 15
		
		driver.get("https://management.ind.in/forum/lakshmi-vilas-bank-net-banking-application-form-157353.html");
		driver.findElement(By.id("navbar_username")).sendKeys("maha_paneer@yahoo.com");
		driver.findElement(By.id("navbar_password")).sendKeys("Test@1234");
		Thread.sleep(2000);

		driver.findElement(By.id("cb_cookieuser_navbar")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);

		
		
		//Question 14
		
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		
		driver.findElement(By.name("email")).sendKeys("maha_paneer@yahoo.com");
		driver.findElement(By.name("password")).sendKeys("Test@1234");
		driver.findElement(By.name("mobile")).sendKeys("9500238463");
		driver.findElement(By.id("male")).click();
		driver.findElement(By.xpath("//button[@class='register-register-button']")).click();
		
		
		//Question 13
		
		driver.get("https://www.snapdeal.com/");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[contains (text(),'Sign In')]")).click();
		driver.findElement(By.xpath("//span[@class='newUserRegister']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[placeholder='Mobile Number/ Email']")).sendKeys("maha_paneer@yahoo.com");
		driver.findElement(By.id("checkUser")).click();
		driver.findElement(By.id("j_number")).sendKeys("9500238463");
		driver.findElement(By.id("j_name")).sendKeys("Dhana");
		driver.findElement(By.id("j_dob")).click();
		
		//DOB
		
		driver.findElement(By.xpath("//th[@class='datepicker-switch']")).click();
		driver.findElement(By.xpath("//th[@class='next']")).click();
		driver.findElement(By.xpath("//div[@class='datepicker-months']")).click();
		driver.findElement(By.xpath("//span[@class='month'][5]")).click();
		driver.findElement(By.xpath("//div[@class='datepicker-days']")).click();
		driver.findElement(By.xpath("//td[@class='day'][5]")).click();
		
		driver.findElement(By.id("j_password")).sendKeys("Test@1234");
		driver.findElement(By.id("userSignup")).click();
		
		
		//Question 11
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		driver.findElement(By.id("firstName")).sendKeys("Riya");
		
		driver.findElement(By.id("lastName")).sendKeys("Riya");
		
		driver.findElement(By.id("username")).sendKeys("dfgdghghgfhgf");
		
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("Test@1234");
		
		driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("Test@1234");
		
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("phoneNumberId")).sendKeys("9500238463");
		
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
		Thread.sleep(2000);


		driver.findElement(By.xpath("//input[@id='code']")).sendKeys("test");
		
		driver.findElement(By.xpath("//div[@class='ZFr60d CeoRYc']")).click();
		
		driver.findElement(By.xpath("//input[@type='text' and @aria-label='Recovery email address (optional)']")).sendKeys("abc@gmail.com");
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select m = new Select(month);
		
		m.selectByVisibleText("July");
		
		driver.findElement(By.id("day")).sendKeys("4");
		
		driver.findElement(By.id("year")).sendKeys("2000");
		
		WebElement gender = driver.findElement(By.id("gender"));
		
		Select g = new Select(gender);
		
		g.selectByValue("2");
		
		driver.findElement(By.xpath("//div[@class='ZFr60d CeoRYc']")).click();

		driver.findElement(By.xpath("//button[@type='button' and @jsname='NjDI7d']")).click();
		
		driver.findElement(By.xpath("//span[@class='RveJvd snByac'][1]")).click();
		
		
	}

}
