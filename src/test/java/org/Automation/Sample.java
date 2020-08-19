package org.Automation;
//import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 
public class Sample {
public static void main(String[] args)  {
 
	 System.setProperty("webdriver.chrome.driver","C:/Users/41986/workspace/WebdriverTest/src/test/resources/drivers/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.phptravels.net/home");
	  driver.manage().window().maximize();
WebElement textDemo = driver.findElement(By.xpath("//*[text()='Check in']"));
textDemo.getText();
 
if(textDemo.isDisplayed())
{
System.out.println(textDemo.getText());
}
 
else
System.out.println("Element not found");
driver.quit();
}
}

