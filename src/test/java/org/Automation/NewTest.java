package org.Automation;

import org.testng.annotations.Test;

//import junit.framework.Assert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;

public class NewTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:/Users/41986/workspace/WebdriverTest/src/test/resources/drivers/chromedriver.exe");
			  WebDriver driver = new ChromeDriver();
			  driver.get("https://www.phptravels.net/home");
			  driver.manage().window().maximize();
			  driver.findElement(By.id("checkin")).clear();
			  driver.findElement(By.id("checkin")).sendKeys("10/08/2020");
     		  driver.findElement(By.id("checkout")).clear();
			  driver.findElement(By.id("checkout")).sendKeys("15/08/2020");
			  JavascriptExecutor js = (JavascriptExecutor)driver;
			
			  //List<WebElement> des =driver.findElements(By.xpath("//div[@class='select2-result-label' ]"));
			  //auto.clickOnelement(des.get(4));
			  
			  
			 Automation auto = new Automation();
			 String el =auto.getSearchBtn();
			 System.out.print("Xpath:"+el);
			 
			WebElement adv = driver.findElement(By.xpath(auto.adultValue()));
			String val = js.executeScript("return arguments[0].value", adv).toString();
			System.out.println("Before Click:"+val);
			WebElement incBtn = driver.findElement(By.xpath(auto.btnAdultclick(1)));
			incBtn.click();
			String val2 = js.executeScript("return arguments[0].value", adv).toString();
			 System.out.println("After Click:"+val2);
			 
			//Assert.assertEquals("2", val2);
			 
			  List<WebElement> elements =driver.findElements(By.xpath(el));
			  auto.clickOnElement(elements.get(0));
			  
			  //driver.quit();
			 
			  
  }
  
  @BeforeClass
  public void beforeClass() {
  }

}
