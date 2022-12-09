package com.ictak.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Negativeverifypassword {

	WebDriver driver;
	@FindBy(css="li>a[href=\"/signup\"]")
	private WebElement Signup;
	@FindBy(id="password")
	private WebElement pwd;
	@FindBy(id="Re-type_password")
	private WebElement repwd;
	@FindBy(className="warning_message")
	private WebElement waring;
    
	public Negativeverifypassword(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	public void invalidpw() {
		Signup.click();
		
	}
	public void SendPw(String SendVerifypw) {
		pwd.sendKeys(SendVerifypw);
		repwd.sendKeys(SendVerifypw);
        waring.getText();
		
		
	}
}
