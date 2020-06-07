package example;


import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Udemy {
	  
	    @Test
	    public void Login()
	    {
	   
	    	 String exePath = "C:\\Users\\ykollu\\OneDrive - Infor\\Desktop\\drivers\\chromedriver_win32\\chromedriver.exe";
	    	 System.setProperty("webdriver.chrome.driver", exePath);
	    	WebDriver driver = new ChromeDriver();
	    	//WebDriverWait wait = new WebDriverWait(driver,30);
	    	//System.setProperty("webdriver.ie.driver","C:/Users/ykollu/eclipse-workspace/testEX/drivers/iedriver/IEDriverServer.exe");
	    	//WebDriver driver = new InternetExplorerDriver();
	    	//WebDriverWait wait = new WebDriverWait(driver,30);
		driver.get("https://https://www.thepromoapp.com/");
		WebElement query = driver.findElement(By.id("ContentPlaceHolder1_UsernameTextBox"));
		query.sendKeys("ykollu");;
		query = driver.findElement(By.id("ContentPlaceHolder1_PasswordTextBox"));
		query.sendKeys("Yashu8125^");
		query = driver.findElement(By.id("ContentPlaceHolder1_SubmitButton"));
		query.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		query = driver.findElement(By.cssSelector("#mhdrAppBtn > svg"));
		query.click();
		query = driver.findElement(By.cssSelector("#usr-span > svg"));
		query.click();
		query = driver.findElement(By.id("usrMng"));
		query.click();
		WebElement slink;
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("social_a52a14ba-15cf-4a8f-bb92-1f6178bf5dd0")));
		slink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("addIFSItem")));
		slink.click();
		query = driver.findElement(By.id("txtSelectOPUsersSearch"));
		query.sendKeys("suhasini");
		//query=driver.findElement(By.className(""));
		query = driver.findElement(By.id("btnLoad"));
		query.click();
		//query = driver.findElement(By.className(""));
			
	}
}


