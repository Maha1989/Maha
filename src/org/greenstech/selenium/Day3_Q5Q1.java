package org.greenstech.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day3_Q5Q1 {
	
	public static void main(String[] args) throws InterruptedException {
			
		
		System.setProperty("webdriver.chrome.driver", "F:\\GreensTech\\Selenium\\Automation\\driver\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		
	
		//question 5:
		
		driver.get("http://www.greenstechnologies.in/selenium-training.php");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='http://greenstech.in/interview-questions/cts.pdf#toolbar=0']")).click();
		//driver.findElement(By.linkText("CTS Interview Question ")).click();
				
				
		
		//Question 1:
		
		driver.get("http://www.greenstechnologys.com/");
		
		
		//contact Us link
		
		WebElement contactus = driver.findElement(By.partialLinkText("CONTACT US"));
		contactus.click();
		
		//Enter Name
		
		WebElement name = driver.findElement(By.xpath("//input[@id='InputName']"));
		name.sendKeys("Lakshmi");
		
		
		//Email
		
		WebElement email = driver.findElement(By.xpath("//input[@id='InputEmail1']"));
		email.sendKeys("Lakshmi@gmail.com");
		
		
		//Mobile Number
		
		WebElement mobno = driver.findElement(By.xpath("//input[@id='InputSubject']"));
		mobno.sendKeys("9934456789");
		
		//Course
		
		Select crs = new Select(driver.findElement(By.name("courses")));
		crs.selectByValue("Selenium");
		
		
		//branch
		
		Select brnch = new Select(driver.findElement(By.name("branch")));
		brnch.selectByIndex(2);
		
		//timings
		
		Select time = new Select(driver.findElement(By.name("time")));
		time.selectByIndex(1);
		
		
		//Message
		
		WebElement msg = driver.findElement(By.xpath("//textarea[@placeholder='Message*']"));
		msg.sendKeys("adhgasj askdjaslkdj alsjdklasdja");
		
		
		//submit
		
		WebElement submit = driver.findElement(By.id("submit"));
		submit.click();
		
		
		driver.quit();
		
		
	}

}
