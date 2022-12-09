package com.ictak.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signuppage {
	WebDriver driver;
	
	@FindBy(css="li>a[href=\"/signup\"]")
	private WebElement Signup;
	@FindBy(id="name")
	private WebElement name;
	@FindBy(id="email")
	private WebElement email;
	@FindBy(id="phone")
	private WebElement phone;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="h_qualification")
	private WebElement qualification; 
	@FindBy(id="SkillsSet")
	private WebElement skillset;
	@FindBy(id="company_name")
	private WebElement cName;
	@FindBy(id="desigination")
	private WebElement desigination;
	@FindBy(id="img")
	private WebElement photo;
	@FindBy(css="div>span>span>span[class=dropdown-multiselect__caret]")
	private WebElement course;
	@FindBy(id="password")
	private WebElement pwd;
	@FindBy(id="Re-type_password")
	private WebElement repwd;
	@FindBy(xpath="//input[@id='signUp-button']")
	private WebElement submit;
	


	public Signuppage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void SignupClick() {
		Signup.click();
	}
	public void SenDkey(String SendData) {
		name.sendKeys(SendData);
		email.sendKeys(SendData);
		phone.sendKeys(SendData);
		address.sendKeys(SendData);
		qualification.sendKeys(SendData);
		skillset.sendKeys(SendData);
		cName.sendKeys(SendData);
		desigination.sendKeys(SendData);
		photo.sendKeys(SendData);
		course.click();
		pwd.sendKeys(SendData);
		repwd.sendKeys(SendData);
	}
	public void Submit() {
		submit.click();
	}

	
	
	
	
	
	

}
