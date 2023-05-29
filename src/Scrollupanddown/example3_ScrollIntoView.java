package Scrollupanddown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3_ScrollIntoView 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		WebElement Verified = driver.findElement(By.xpath("//span[text()='Meta Verified']"));
		
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",Verified);
	
	
	
		
		
	


		
	}

	

}
