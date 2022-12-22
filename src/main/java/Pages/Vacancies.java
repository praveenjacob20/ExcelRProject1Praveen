package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import BasePackage.Baseclass;

public class Vacancies extends Baseclass {
		
	
	
	public void vacancies() throws AWTException {
		
		Robot robot = new Robot();
	
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/input")).sendKeys(prop.getProperty("VacancyName"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div[2]/textarea")).sendKeys(prop.getProperty("description"));

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div[1]/div/div[2]/div/div/input")).sendKeys(prop.getProperty("HiringManager"));
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div[2]/div/div/div/div[2]/input")).sendKeys(prop.getProperty("No.ofPositions"));
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div/div[2]/div/div/div[1]")).click();
		robot.setAutoDelay(2000);
		robot.keyPress(KeyEvent.VK_Q);
		robot.keyRelease(KeyEvent.VK_Q);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/form/div[7]/button[2]")).click();
		
	}
	
}
