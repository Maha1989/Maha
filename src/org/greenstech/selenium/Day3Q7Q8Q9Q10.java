package org.greenstech.selenium;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day3Q7Q8Q9Q10 {
	
	public static void main(String[] args) throws InterruptedException   {
		
		System.setProperty("webdriver.chrome.driver", "F:\\GreensTech\\Selenium\\Automation\\driver\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
		
		//Question 10
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("nav-link-accountList")).click();
				
		driver.findElement(By.xpath("//a[@href='/gp/navigation/redirector.html/ref=sign-in-redirect?ie=UTF8&associationHandle=inflex&currentPageURL=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&pageType=Gateway&switchAccount=&yshURL=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26ref_%3Dnav_signin']")).click();		
		
		Thread.sleep(2000);

		driver.findElement(By.id("createAccountSubmit")).click();

		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Chitra");
		
		driver.findElement(By.id("ap_phone_number")).sendKeys("9500238463");
		
		driver.findElement(By.id("ap_password")).sendKeys("Test@1234");
		
		driver.findElement(By.id("continue")).click();
		
		WebElement otp1 = driver.findElement(By.xpath("//input[@id='auth-pv-enter-code']"));
		otp1.click();
		otp1.sendKeys("otp");
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter otp");
		
		long otp = sc.nextLong();
		
		System.out.println("Entered OTP is :"+otp);
		
		*/
		
		driver.findElement(By.xpath("//input[@id='auth-verify-button']")).click();
		
		
		//Question 9
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.linkText("New to Flipkart? Create an account")).click();

		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("9500238463");
		
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ' and @type='text']")).sendKeys("otp");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@1234");
		
		driver.findElement(By.xpath("//button[@type='submit' and @class='_2AkmmA _1LctnI _7UHT_c']")).click();
		
		
		
		//Question 7
			
		driver.get("https://www.cleartrip.com/trains");
		
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.id("username1")).sendKeys("maha_paneer@yahoo.com");
				
		
		driver.findElement(By.id("registerButton")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Test@1234");
		
		WebElement title = driver.findElement(By.id("profile_title"));
		
		Select s = new Select(title);
		
		s.selectByVisibleText("Mrs");
		
		driver.findElement(By.name("first_name")).sendKeys("Maha");
		
		driver.findElement(By.name("last_name")).sendKeys("Lakshmi");
		
		WebElement mob = driver.findElement(By.id("country_code"));
		
		Select s1= new Select(mob);
		
		s1.selectByValue("91");
		
		driver.findElement(By.id("mobile_number")).sendKeys("9952393721");
		
		driver.findElement(By.id("signUpButton")).click();
		
		
		//Question 8
		
				driver.get("http://www.greenstechnologies.in/selenium-training.php");
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[@href='http://traininginchennai.in/core%20java%20material.pdf']")).click();
				//driver.findElement(By.linkText("Core JAVA  material")).click();
		
		
	}

}
