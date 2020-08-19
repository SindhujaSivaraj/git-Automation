package org.Automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DbankPage {
	
	@FindBy(id= "submit")
	public WebElement signInBtn;
	
	@FindBy(id= "username")
	public WebElement userName;
	
	@FindBy(id= "password")
	public WebElement password;

}
