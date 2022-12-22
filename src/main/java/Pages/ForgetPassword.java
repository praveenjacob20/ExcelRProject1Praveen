package Pages;

import org.openqa.selenium.By;
import BasePackage.Baseclass;

public class ForgetPassword extends Baseclass {
	
	public String resetpassword() {
		
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p")).click();
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/form/div[1]/div/div[2]/input")).sendKeys(prop.getProperty("username*"));
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/form/div[2]/button[2]")).click();
    return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/div/h6")).getText();
	}
}
