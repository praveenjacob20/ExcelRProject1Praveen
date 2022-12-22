package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;

import BasePackage.Baseclass;

public class Recruitment extends Baseclass{
	
	public void recruitment() throws AWTException {
		
		Robot robot = new Robot();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[1]/div[2]/input")).sendKeys(prop.getProperty("firstname"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div[3]/div[2]/input")).sendKeys(prop.getProperty("lastname"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input")).sendKeys(prop.getProperty("mobile"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/div/div[1]/div/div[2]/input")).sendKeys(prop.getProperty("Skills"));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[6]/div/div/div/div[2]/textarea")).sendKeys(prop.getProperty("note"));
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div/div[2]/i")).click();
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div/div/div/div[2]/div/i")).click();
		StringSelection resumepath = new StringSelection(prop.getProperty("resume"));
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(resumepath, null);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/div/div[2]/div/div[2]/div/div/input")).click();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_A);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/div/div[2]/div/div[2]/div/div/input")).sendKeys(prop.getProperty("Appdate"));
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[7]/div/div/div/div[2]/div/label/span/i")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[8]/button[2]")).click();
		robot.setAutoDelay(1000);
	}

}
