package com.datadrivenexcel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.read.biff.BiffException;

public class LoginTest {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		ExcelParser objExcelParser = new ExcelParser("Login.xls");
		String[][] myLoginData = objExcelParser.retrieveData();
		int col = 0;
		int rows = myLoginData[0].length;
		for (int row = 0; row < rows; row++) {
			for (col = 0; col < myLoginData.length; col++) {
				System.out.println(myLoginData[col][row]);
			}
		}

		System.setProperty("webdriver.gecko.driver", "C:\\Java\\Jars\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.opencart.com/");

		WebElement myElement;

		for (int iteration = 0; iteration < myLoginData[0].length; iteration++) {

			myElement = driver.findElement(By.xpath("//html/body/header/nav/div/div[2]/div/a[1]"));
			myElement.click();

			myElement = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
			myElement.sendKeys(myLoginData[0][iteration]);

			myElement = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
			myElement.sendKeys(myLoginData[1][iteration]);

			myElement = driver
					.findElement(By.xpath("//html/body/div[1]/div[2]/div/div[1]/form/div[3]/div[1]/button[1]"));
			myElement.click();

			try {
				Thread.sleep(5000);
			} catch (Exception e) {

			}

			myElement = driver.findElement(By.xpath("//html/body/header/nav/div/div[2]/div/a[2]"));
			myElement.click();

		}
	}
}
