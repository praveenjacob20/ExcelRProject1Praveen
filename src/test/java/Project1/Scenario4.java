package Project1;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BasePackage.Baseclass;
import Pages.ForgetPassword;

public class Scenario4 extends Baseclass {
	
	ForgetPassword fp;
	
	@BeforeMethod
	public void OpenWebPage() throws IOException {
		initialization();
	}
	
	@Test
	private void Validation() throws IOException {	
		fp = new ForgetPassword();
		String acttext = fp.resetpassword();
		String exptext = "Reset Password link sent successfully" ; 
		Assert.assertEquals(acttext, exptext);
	}
	
	@AfterMethod
	public void Closedriver() {
		tearDown();
	}

}
