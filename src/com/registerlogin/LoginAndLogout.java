package com.registerlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginAndLogout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Java\\Jars\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.opencart.com/");

		WebElement myElement = driver.findElement(By.xpath("//html/body/header/nav/div/div[2]/div/a[1]"));
		myElement.click();

		myElement = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
		myElement.sendKeys("user@gmail.com");

		myElement = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
		myElement.sendKeys("Password");

		myElement = driver.findElement(By.xpath("//html/body/div[1]/div[2]/div/div[1]/form/div[3]/div[1]/button[1]"));
		myElement.click();

		try {
			Thread.sleep(5000);
		} catch (Exception e) {

		}

		myElement = driver.findElement(By.xpath("//html/body/header/nav/div/div[2]/div/a[2]"));
		myElement.click();
	}
}
