package org.greenstech.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day3Q3 {
	
	public static void main(String[] args) throws InterruptedException   {
		
		System.setProperty("webdriver.chrome.driver", "F:\\GreensTech\\Selenium\\Automation\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		
		//FirstName
		
		WebElement fname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		fname.sendKeys("Maha");
		
		//LastName
		
		WebElement lname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lname.sendKeys("Lakshmi");
		
		//Address
		
		WebElement addr = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		addr.sendKeys("Chennai");
		
		
		//Email
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("lakshu@gmail.com");
		
		//Phn No
		
		WebElement phn = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		phn.sendKeys("9600917221");
		
		//Gender
		
		WebElement radiob = driver.findElement(By.xpath("//input[@value='Male']"));
		radiob.click();
		
		//Hobbies
		
		WebElement hobby = driver.findElement(By.xpath("//input[@value='Movies']"));
		hobby.click();
		
		WebElement crckt = driver.findElement(By.xpath("//input[@value='Cricket']"));
		crckt.click();
		
		
		//Languages
		
		/*
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		Thread.sleep(2000);
		
		WebElement La = driver.findElement(By.xpath("//li[@list-select class='ng-scope']"));

		Select s = new Select(La);
		
		List<WebElement> Lang = s.getOptions();

		
		s.selectByVisibleText("Arabic");
		
	*/
		
		//Skills
		
		Select skill = new Select(driver.findElement(By.id("Skills")));
		skill.selectByVisibleText("Android");
		
		//Country
		
		Select country= new Select(driver.findElement(By.id("countries")));
		country.selectByValue("India");
		
		//Select country 2
		/* 
		Select country2= new Select(driver.findElement(By.xpath("//span[@id='select2-country-container']")));
	
		country2.selectByVisibleText("India");
		*/
		
		//Dob
		
		Select doby = new Select(driver.findElement(By.xpath("//select[@placeholder='Year']")));
		doby.selectByValue("1989");
		
		Select dobm = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
		dobm.selectByValue("May");
		
		Select dobd = new Select(driver.findElement(By.xpath("//select[@placeholder='Day']")));
		dobd.selectByValue("30");
		
		//Password
		
		WebElement pwd = driver.findElement(By.xpath("//input[@id='firstpassword']"));
		pwd.sendKeys("Pwd@123");
		
		//Confirm Password
		WebElement cpwd = driver.findElement(By.xpath("//input[@id='secondpassword']"));
		cpwd.sendKeys("Pwd@123");
		
		//Submit
		
		WebElement submt = driver.findElement(By.id("submitbtn"));
		submt.click();
		
		
	}

}
