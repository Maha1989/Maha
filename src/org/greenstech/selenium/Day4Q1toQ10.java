package org.greenstech.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4Q1toQ10 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\GreensTech\\Selenium\\Automation\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
				
		//question 10
		
		driver.get("http://www.adactin.com/HotelApp/");
		
		WebElement uname = driver.findElement(By.id("username"));
		uname.sendKeys("Maha");
		System.out.println(uname.getAttribute("value"));
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("test1234");
		System.out.println(pass.getAttribute("value"));
		
		//Question 9
		
		driver.get("http://www.gmail.com");
		
		driver.findElement(By.id("identifierId")).sendKeys("lakshu.ms89@gmail.com");
		
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Riya@123");
		
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class=\"gb_Ba gbii\"]")).click();
		
		driver.findElement(By.xpath("//a[@id='gb_71']")).click();
		
		
		//Question 8
		
		driver.get("http://www.google.com/");
		
		driver.findElement(By.xpath("//a[@title='Google apps']")).click();
		
		
		
		
		//Question 7
		
		driver.get("http://www.google.com/");
		
		driver.findElement(By.xpath("//div[@id='searchform']")).sendKeys("greens velmurugan");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='btnK']")).click();
		driver.findElement(By.xpath("//div[@class='TbwUpd']")).click();
		
		//Question 6
		
		driver.get("https://www.facebook.com/");
		
		//email id
		
		WebElement mail = driver.findElement(By.xpath("//input[@id='email']"));
		mail.sendKeys("maha_paneer@yahoo.com");
		Thread.sleep(2000);
		System.out.println(mail.getAttribute("value"));

		
		//password
		
		WebElement pwd = driver.findElement(By.xpath("//input[@id='pass']"));
		pwd.sendKeys("Smile@123");
		Thread.sleep(2000);
		System.out.println(pwd.getAttribute("value"));

	
		//Question 5
		
		driver.get("http://www.greenstechnologys.com/index.html");
		
		WebElement omr = driver.findElement(By.xpath("//div[@class ='trainer-info'][2]"));
		
		String addr = omr.getText();
		
		System.out.println("OMR Address :"+addr);
		
		//Question 4
		
		driver.get("http://www.greenstechnologies.in/selenium-training.php");
		
		
		WebElement rev1 = driver.findElement(By.xpath("//span[@class ='testimonial-content']"));
		
		String txt4 = rev1.getText();
		
		System.out.println("Testimonial:"+txt4);
		
		//Question 3
		
		
		WebElement para1 = driver.findElement(By.xpath("//div[@id ='article-wrapper']/p[1]"));
		
		String txt1 = para1.getText();
		
		System.out.println("Para 1 :"+txt1);
		
		
		WebElement para2 = driver.findElement(By.xpath("//div[@id ='article-wrapper']/p[3]"));
		
		String txt2 = para2.getText();
		
		System.out.println("Para 1 :"+txt2);
		
		//question 2
		
				
		WebElement para3 = driver.findElement(By.xpath("//div[@id ='article-wrapper']/p[4]"));
		
		String txt3 = para3.getText();
		
		System.out.println("Para 3 :"+txt3);
		
		//Question 1
		
		driver.get("http://www.greenstechnologys.com");
		
		WebElement rev = driver.findElement(By.xpath("//div[@itemtype='http://data-vocabulary.org/Review-aggregate']"));
		
		String txt = rev.getText();
		
		System.out.println("Review : "+txt);
		
		
		
		
	}

}
