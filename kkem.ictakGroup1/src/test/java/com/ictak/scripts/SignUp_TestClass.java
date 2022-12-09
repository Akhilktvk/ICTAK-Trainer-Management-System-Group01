package com.ictak.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ictak.constants.AutomationConstants;
import com.ictak.pages.Signuppage;
import com.ictak.utitlities.Excelutility;



public class SignUp_TestClass extends TestBase {
	Signuppage objsignup;

	@Test 
	public void verifysignuppage() throws IOException, InterruptedException {
		objsignup.SignupClick();
		objsignup=new Signuppage(driver);
		String name =Excelutility.getCellData(3, 0);
		String email=Excelutility.getCellData(4, 0);
		String phone=Excelutility.getCellData(5, 0);
		String address=Excelutility.getCellData(6, 0);
		String quaalification=Excelutility.getCellData(7, 0);
		String skillset=Excelutility.getCellData(8, 0);
		String cName=Excelutility.getCellData(9, 0);
		String desigination=Excelutility.getCellData(10, 0);
		String photo=Excelutility.getCellData(11, 0);
		String pwd=Excelutility.getCellData(12, 0);
		String repwd=Excelutility.getCellData(13, 0);
		objsignup.SenDkey(name);
		objsignup.SenDkey(email);
		objsignup.SenDkey(phone);
		objsignup.SenDkey(address);
		objsignup.SenDkey(quaalification);
		objsignup.SenDkey(skillset);
		objsignup.SenDkey(cName);
		objsignup.SenDkey(desigination);
		objsignup.SenDkey(photo);
		objsignup.SenDkey(pwd);
		objsignup.SenDkey(repwd);
		
		String excpectedTitle=AutomationConstants.SIGNUPTITLE;
		String actualTitle=driver.getCurrentUrl();
		Assert.assertEquals(actualTitle,excpectedTitle);
		Thread.sleep(3000);
		
		
	}
	

}
	


