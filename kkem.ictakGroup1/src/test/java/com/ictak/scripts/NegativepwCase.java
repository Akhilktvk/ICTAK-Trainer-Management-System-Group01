package com.ictak.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ictak.constants.AutomationConstants;
import com.ictak.pages.Negativeverifypassword;
import com.ictak.utitlities.Excelutility;

public class NegativepwCase extends TestBase{
	Negativeverifypassword objverpw;
	
	@Test
	public void Retypepw() throws IOException, InterruptedException {
		objverpw.invalidpw();
		objverpw=new Negativeverifypassword(driver);
	String pwd=Excelutility.getCellData(12, 0);
	String repwd=Excelutility.getCellData(13, 0);
	objverpw.SendPw(pwd);
	objverpw.SendPw(repwd);
    String expectedMessage =AutomationConstants.act;
    String actualMessage=driver.getCurrentUrl();
    Assert.assertEquals(expectedMessage,actualMessage);
	Thread.sleep(3000);

	
	
	}
}

