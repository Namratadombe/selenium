package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_SwitchToFrame 
{
	public static void main(String[] args)
{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
        
        driver.switchTo().frame("iframeResult");  
            
      //click on click me btn
       driver.findElement(By.xpath("//button[contains(text(),'Click me to display')]")).click();
                    
}
	

}

