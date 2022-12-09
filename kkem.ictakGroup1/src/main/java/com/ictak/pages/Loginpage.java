package com.ictak.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	//find by using locate element
    WebDriver driver;
    
    @FindBy(linkText="Login")
	private WebElement Login;
	@FindBy(xpath="//input[@id='floatingInput']")
	private WebElement uname;
	@FindBy(id="floatingPassword")
	private WebElement pwd;
	@FindBy(xpath="//button[@type=\"submit\"]")
	private WebElement signin;
	
	
    public Loginpage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }
    public void clicklog()
    {
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
