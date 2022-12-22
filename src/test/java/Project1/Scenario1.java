package Project1;

import java.io.IOException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BasePackage.Baseclass;
import Pages.LogInandOut;

public class Scenario1 extends Baseclass {
	
	LogInandOut lp;
	
	@BeforeMethod
	public void OpenWebPage() throws IOException {
		initialization();
	}
	
	@Test
	private void ValidateLogin() throws IOException {	
		lp = new LogInandOut();
		lp.login(prop.getProperty("username"),prop.getProperty("password"));
		lp.logout();
	}
	
	@AfterMethod
	public void Closedriver() {
		tearDown();
	}
	
}
