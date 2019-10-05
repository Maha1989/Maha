package org.greenstech.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4_Q11toQ15 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\GreensTech\\Selenium\\Automation\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Question 15
		
		driver.get("https://www.shopclues.com/wholesale.html");
		
		driver.findElement(By.id("autocomplete")).sendKeys("fastrack watch");
		driver.findElement(By.id("//a[@class='srch_action btn orange']")).click();
		driver.findElement(By.xpath("//h2[text()='mkstone m2 Digital led watch band type black colour men']")).click();
		
		
		
		//Question 13
		
		driver.get("https://www.flipkart.com/");
				
		driver.findElement(By.linkText("Electronics")).click();
		
		
				
		
		//Question 12
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		WebElement fname = driver.findElement(By.id("firstName"));
		fname.sendKeys("MMM");
		System.out.println(fname.getAttribute("value"));
		
		WebElement lname = driver.findElement(By.id("lastName"));
		lname.sendKeys("LLL");
		System.out.println(lname.getAttribute("value"));
		
		WebElement uname = driver.findElement(By.id("username"));
		uname.sendKeys("abc");
		System.out.println(uname.getAttribute("value"));
		
		//question 11
		
				driver.get("https://www.snapdeal.com/");
				
				driver.findElement(By.linkText("Women's Fashion")).click();
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//span[text() = 'Kurtas & Kurtis']")).click();
				
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//p[@title='Alena Green Cotton A-line Kurti']")).click();
								
				driver.findElement(By.xpath("//div[@selectedattr='L']")).click();
				
				driver.findElement(By.xpath("//div[@id='add-cart-button-id'])")).click();
				
				driver.findElement(By.xpath("//input[@id='inputValEnter']")).sendKeys("Lehenga");
				
				driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
				
				driver.findElement(By.xpath("//p[@title='Saadhvi Blue Bangalore Silk Circular Semi Stitched Lehenga']")).click();

				driver.findElement(By.xpath("//div[@selectedattr='Free Size']")).click();
				
				driver.findElement(By.xpath("//div[@id='add-cart-button-id'])")).click();

				driver.findElement(By.xpath("//div[@class='btn btn-theme-secondary open-cart']")).click();
				
				WebElement cart = driver.findElement(By.xpath("//input[@class='btn btn-xl rippleWhite cart-button']"));
				String amt = cart.getAttribute("value");
				System.out.println("Total cost in the cart : "+amt);

				
	}
	
	

}
