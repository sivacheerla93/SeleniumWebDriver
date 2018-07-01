package com.registerlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Java\\Jars\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.opencart.com/");

		WebElement myElement = driver.findElement(By.xpath("//html/body/header/nav/div/div[2]/div/a[2]"));
		myElement.click();

		myElement = driver.findElement(By.xpath("//*[@id=\"input-username\"]"));
		myElement.sendKeys("Username");

		myElement = driver.findElement(By.xpath("//*[@id=\"input-firstname\"]"));
		myElement.sendKeys("First name");

		myElement = driver.findElement(By.xpath("//*[@id=\"input-lastname\"]"));
		myElement.sendKeys("Last name");

		myElement = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
		myElement.sendKeys("user@gmail.com");

		Select cou = new Select(driver.findElement(By.xpath("//*[@id=\"input-country\"]")));
		cou.selectByVisibleText("India");

		myElement = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
		myElement.sendKeys("Password");

		try {
			Thread.sleep(10000);
		} catch (Exception e) {

		}

		myElement = driver.findElement(By.xpath("//html/body/div[1]/div/div/div[1]/form/div[7]/button[1]"));
		myElement.click();
	}
}
