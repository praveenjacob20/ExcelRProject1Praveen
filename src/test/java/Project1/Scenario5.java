package Project1;

import java.awt.AWTException;
import java.io.IOException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BasePackage.Baseclass;
import Pages.LogInandOut;
import Pages.Recruitment;

public class Scenario5 extends Baseclass {
	
LogInandOut lp;
Recruitment rc;	
	@BeforeMethod
	public void OpenWebPage() throws IOException {
		initialization();
	}
	
	@Test
	private void ValidateLogin() throws IOException, AWTException {	
		lp = new LogInandOut();
		rc = new Recruitment();
		lp.login(prop.getProperty("username"),prop.getProperty("password"));
		rc.recruitment();
		lp.logout();
	}
	
	@AfterMethod
	public void Closedriver() {
		tearDown();
	}

}
