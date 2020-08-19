package org.Automation;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;

public class DbankTestng {
	WebDriver driver;
	
	
	          
	
  @BeforeClass(alwaysRun = true)
  public void beforeClass() {
		 System.setProperty("webdriver.chrome.driver","C:/Users/41986/workspace/WebdriverTest/src/test/resources/drivers/chromedriver.exe");
		  driver = new ChromeDriver();
		  //driver.get("http://dbankdemo.com/login");
		  driver.get("http://demo.guru99.com/test/delete_customer.php");
		  driver.manage().window().maximize();
		  TakesScreenshot scrShot =((TakesScreenshot)driver);
		  File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

		          File DestFile=new File("C:/Users/41986/workspace/WebdriverTest/screens/screen.png");
  }
  
  @Test(priority = 1,groups={"test1"})
  public void test_1() throws IOException{
	  driver.findElement(By.xpath("//input[@type='submit']")).click(); 
	driver.findElement(By.name("submit")).submit();
	  try 
	  {driver.switchTo().alert().accept();}
	  catch 
	  (NoAlertPresentException e){
		  System.out.println("Waring:"+e);
		  driver.findElement(By.xpath("//input[@type='submit']")).click(); 
		  driver.switchTo().alert().accept();
		  
	  }finally{
		  System.out.println("Always gets executed");
		  //FileUtils.copyFile(SrcFile, DestFile);
 }
	  
	  /*try{
		  driver.findElement(By.xpath("//input[@type='submi']")).click();
		  
	  }catch(NoSuchElementException e){System.out.println("Error:"+e);
		  
	  }catch(NoAlertPresentException e){
		  
	  }catch(Exception e){
		  
	  }*/
  
  }
  
  @Test(description="Dbank Logout Tests",priority = 3,groups={"smoke","regression"})
  public void dbank_Logout(){
	  
  }
  
  

  
  @Test(description="Dbank Login Page",priority = 0,groups={"smoke","regression"})
  public void Dbank_Login() {
	  
	  DbankPage DbankElement = PageFactory.initElements(driver, DbankPage.class);
	  DbankElement.signInBtn.click();
	  DbankElement.userName.sendKeys("Test");
	  DbankElement.userName.sendKeys("Test");
	  
  }
  
  @Test(priority = 2,groups={"regression"})
  public void Atest_all(){
	  
  }
  

  

  @AfterClass
  public void afterClass() {
	 // driver.quit();
  }

}
