package com.ictak.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Invalidlog {
	
	 WebDriver driver;
	    
	    @FindBy(linkText="Login")
		private WebElement Login;
		@FindBy(xpath="//input[@id='floatingInput']")
		private WebElement uname;
		@FindBy(id="floatingPassword")
		private WebElement pwd;
		@FindBy(xpath="//button[@type=\"submit\"]")
		private WebElement signin;
		
		
		public Invalidlog(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}
		public void clickklog() {
			Login.click();
		}
		public void setUserName(String StrUserName) {
	    	uname.sendKeys(StrUserName);
	    }
	    public void setPassword(String StrPassword) {
	    	pwd.sendKeys(StrPassword);
	    	
	    }
	    public void clicksignin() {
			// TODO Auto-generated method stub
			signin.click();
			
		}
}
