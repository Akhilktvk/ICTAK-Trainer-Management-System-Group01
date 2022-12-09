package com.ictak.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ictak.constants.AutomationConstants;
import com.ictak.pages.Invalidlog;
import com.ictak.utitlities.Excelutility;




public class Invalidlogtest extends TestBase {
	
	Invalidlog objinvalid;
	@Test
	public void verifyInvalidlog() throws IOException, InterruptedException {
		objinvalid=new Invalidlog(driver);
		objinvalid.clickklog();
		 String uname = Excelutility.getCellData(0, 3);
	     String pwd =Excelutility.getCellData(2, 3);
	     objinvalid.setUserName(uname);
	     objinvalid.setPassword(pwd);
	     objinvalid.clicksignin();
	     String expectedTitle=AutomationConstants.INVALIDLOGTITTLE;
	     String actualTitle=driver.getTitle();
	     Assert.assertEquals(expectedTitle,actualTitle);
	     Thread.sleep(3000);
	}

}
