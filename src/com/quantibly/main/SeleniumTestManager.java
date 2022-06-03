package com.quantibly.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.quantibly.authentication.SignIn;
import com.quantibly.authentication.SignUp;
import com.quantibly.people.AddPeople;
import com.quantibly.people.DeletePeople;
import com.quantibly.people.EditPeople;

import org.openqa.selenium.chrome.ChromeOptions;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.remote.ProtocolHandshake;

    public class SeleniumTestManager {
    	
	public static void main(String[] args) throws InterruptedException{
	//WebDriverManager.chromedriver().setup();
	//WebDriverManager.firefoxdriver().setup();
			
	final String SERVER_URL = "https://app.quantibly.com/";
	
	 
	WebDriver driver = getChromeDriver(SERVER_URL); 
	
	// WebDriver webDriverManager;
	// webDriverManager = WebDriverManager.chromedriver();
	// webDriverManager.config().setCachePath("F:\\My Work\\Selenium\\selenium-java-3.141.59\\chromedriver_win32");
     
    
    //webDriverManager.setup();
	
	//WebDriver driver = getFirefoxDriver(SERVER_URL); 
	
    //Rubaet // SQA Engineer

	

	
	 //SignUp.createSignUp(driver);
	   SignIn.clickSignIn(driver);
     //AddPeople.createPeople(driver);
	 //EditPeople.updatePeople(driver);
	 //DeletePeople.delPeople(driver);
  	 
	 
	// https://chromedriver.chromium.org/capabilities
	 
    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.addArguments("--incognito");
    chromeOptions.addArguments("--disable-popup-blocking");
    chromeOptions.addArguments("--privileged");
    chromeOptions.addArguments("window-size=1000,500");
    chromeOptions.addArguments("disable-infobars");
    chromeOptions.addArguments("--disable-extensions");
    chromeOptions.addArguments("--no-sandbox"); // Bypass OS security model

//    // to disables the driver to install other chrome extensions
//    chromeOptions.setExperimentalOption("useAutomationExtension", false);

  
	}

	
	public static void logout(WebDriver driver) {
		try {
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#app > div > div > div > div > div > div.col-md-5.auth-card-right > div > div > form > section > div:nth-child(1) > div > input")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#app > div > div > div > div > div > div.col-md-5.auth-card-right > div > div > form > section > div:nth-child(1) > div > input")).sendKeys("rubaetqaiyum@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#app > div > div > div > div > div > div.col-md-5.auth-card-right > div > div > form > section > div.right-inner-addon.form-group > input")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#app > div > div > div > div > div > div.col-md-5.auth-card-right > div > div > form > section > div.right-inner-addon.form-group > input")).sendKeys("Just4@me");
			Thread.sleep(2000);
			
			//driver.findElement(By.className("bigger-110")).click();
			//Thread.sleep(2000);
			
			//driver.findElement(By.className("user-info")).click();
			//Thread.sleep(2000);
			driver.findElement(By.cssSelector("#app > div > div > div > div > div > div.col-md-5.auth-card-right > div > div > form > section > button")).click();
			Thread.sleep(2000);
			
		    }
		    catch(Exception e) {
			e.printStackTrace();
			driver.quit();
		}
	}
	
	private static WebDriver getChromeDriver(String serverUrl) {
		
		
		
			final String DRIVER_NAME = "webdriver.chrome.driver";
			final String DRIVER_URL =  "F:\\My Work\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe";
			
			System.setProperty(DRIVER_NAME, DRIVER_URL);
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(serverUrl);
		    
	
		return driver;
	}
	
    private static WebDriver getFirefoxDriver(String serverUrl) {
		
	       
	
			final String DRIVER_NAME = "webdriver.gecko.driver";
			final String DRIVER_URL = "F:\\My Work\\Selenium\\selenium-java-3.141.59\\geckodriver-v0.29.1-win64\\geckodriver.exe";
			
			System.setProperty(DRIVER_NAME, DRIVER_URL);
			WebDriver driver = new FirefoxDriver();
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(serverUrl);
		
		return driver;
	}
	
}
