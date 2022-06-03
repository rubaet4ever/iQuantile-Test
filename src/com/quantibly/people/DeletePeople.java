package com.quantibly.people;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeletePeople {
	
	public static void delPeople(WebDriver driver) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#app > div > div > div > div > div > div.col-md-5.auth-card-right > div > div > form > section > div:nth-child(1) > div > input")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#app > div > div > div > div > div > div.col-md-5.auth-card-right > div > div > form > section > div:nth-child(1) > div > input")).sendKeys("Your Email"); // Input Your Email
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#app > div > div > div > div > div > div.col-md-5.auth-card-right > div > div > form > section > div.right-inner-addon.form-group > input")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#app > div > div > div > div > div > div.col-md-5.auth-card-right > div > div > form > section > div.right-inner-addon.form-group > input")).sendKeys("Password"); // Input Your Password
			Thread.sleep(2000);
			
			//driver.findElement(By.className("bigger-110")).click();
			//Thread.sleep(2000);
			//driver.findElement(By.className("user-info")).click();
			//Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#app > div > div > div > div > div > div.col-md-5.auth-card-right > div > div > form > section > button")).click();
			Thread.sleep(2000);
			
			
			driver.findElement(By.cssSelector("#app > div > div.main-content-wrap.main-content-wrap--onboarding > div.onbording-card > div > div > div > div.onbording__row > div.onbording-col.onbording-col--left > div > div:nth-child(2)")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#app > div > div.main-content-wrap.main-content-wrap--onboarding > div.onbording-card > div > div > div > div.onbording__footer > button > span")).click();
			Thread.sleep(2000);
			
			
			driver.findElement(By.cssSelector("#myTable > tbody > tr > td.w-120.text-left > a:nth-child(3) > i")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("#app > div > div.main-content-wrap.d-flex.flex-column.sidenav-open > div.main-content > div.main-content-render > div > div > div:nth-child(4) > div > div > div > div > form > button > span")).click();
			Thread.sleep(2000);
			
			
			
			
				
		    }
		    catch(Exception e) {
			e.printStackTrace();
			driver.quit();
				
			}

	}
	

}
