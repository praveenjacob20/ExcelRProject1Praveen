package Project1;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BasePackage.Baseclass;
import Pages.LogInandOut;
import Pages.Vacancies;

public class Scenario6 extends Baseclass {

	LogInandOut lp;
	Vacancies vc;
	
		@BeforeMethod
		public void OpenWebPage() throws IOException {
			initialization();
		}
		
		@Test
		private void ValidateLogin() throws IOException, AWTException {	
			lp = new LogInandOut();
			vc = new Vacancies();
			lp.login(prop.getProperty("username"),prop.getProperty("password"));
			vc.vacancies();
			lp.logout();
		}
		
		@AfterMethod
		public void Closedriver() {
			tearDown();
		}
}
