package com.ictak.scripts;       //ICTAK GROUP1 (akhil)

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ictak.constants.AutomationConstants;
import com.ictak.pages.Loginpage;
import com.ictak.utitlities.Excelutility;


public class TestClass extends TestBase {
	Loginpage objlogin;
	 
	@Test
     public void verifyValidLogin() throws IOException, InterruptedException {
     //Login Page object
     objlogin = new Loginpage(driver);
     objlogin.clicklog();
     //login to application
     String uname = Excelutility.getCellData(0, 0);
     String pwd =Excelutility.getCellData(0, 1);
     objlogin.setUserName(uname);
     objlogin.setPassword(pwd);
     objlogin.clicksignin();
     String expectedTitle =AutomationConstants.HOMEPAGETITLE;
     String actualTitle =driver.getTitle();
     Assert.assertEquals(expectedTitle,actualTitle);
     Thread.sleep(3000);
     
     
     
     
    
    }
	



}
