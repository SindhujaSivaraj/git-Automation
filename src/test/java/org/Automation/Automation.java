package org.Automation;

import org.openqa.selenium.WebElement;

public class Automation {

private	String searchBtn="//button[@class='btn btn-primary btn-block' and contains(text(),'Search')]";
private String btn;
private String adv;

	public String getSearchBtn() {
		return searchBtn;
	}
	
	public void clickOnElement(WebElement el){
		el.click();
	
	}
	
	public String btnAdultclick(int i){
		this.btn = "(//span[contains(@class,'input-group-btn-vertical')])[1]//button["+i+"]";
		return btn;
	}
	
	public String adultValue(){
		this.adv = "(//div[contains(@class,'input-group')])[1]//input";
		return adv;
	}
		
	
}
 