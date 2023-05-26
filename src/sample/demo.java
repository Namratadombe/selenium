package sample;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By; 
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class demo 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Object src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		
		File dest = new File("C:\\Users\\delll\\Desktop\\secreenshot\\abc.jpg");
		FileHandler.copy((File) src, dest);
		
		
	}

}
