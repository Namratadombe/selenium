package HandlingofAutoSugestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Example2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("iphone");
		
		Thread.sleep(2000);
List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@role='listbox']"));
String expText="iphone 14";

for(WebElement s1: allOptions)
{
	String actText = s1.getText();
	if(actText.equals(expText))

	{
		s1.click();
		break;
}
}
}
}