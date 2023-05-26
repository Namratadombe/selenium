package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_SwitchToMainPageFromFrame 
{
	public static void main(String[] args) throws InterruptedException 
{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize(); 
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		driver.switchTo().frame("iframeResult");   //switch to frame 
		
		//click on "click me btn" from iframe 
		driver.findElement(By.xpath("//button[contains(text(),'Click me to display')]")).click();
		
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000); 
		
		//click on "open menu" option from main page 
		driver.findElement(By.xpath("//a[@id='menuButton']")).click(); 

}

}


