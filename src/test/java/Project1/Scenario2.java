package Project1;

import java.awt.AWTException;
import java.io.IOException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BasePackage.Baseclass;
import Pages.LogInandOut;
import Pages.PIM;

public class Scenario2 extends Baseclass {
	
	LogInandOut lp;
	PIM pim;
	
	@BeforeMethod
	public void OpenWebPage() throws IOException {
		initialization();
	}
	
	@Test
	private void Validation() throws IOException, AWTException {	
		lp = new LogInandOut();
		lp.login(prop.getProperty("username"),prop.getProperty("password"));
		pim = new PIM();
		pim.pim();
		lp.logout();
		lp.login(prop.getProperty("username*"), prop.getProperty("password*"));
		lp.logout();
	}
	
	@AfterMethod
	public void Closedriver() {
		tearDown();
	}
}
