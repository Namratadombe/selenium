package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_selectMultipleCheckboxes 
{
	public static void main(String[] args) throws InterruptedException 
{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/GK/Nams/selectMultipleCheckboxes.html");
		
		List<WebElement> allCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println(allCheckboxes.size());
        
        for(WebElement s1:allCheckboxes)
        {
        	s1.click();
        	Thread.sleep(2000);
        }
}

}
