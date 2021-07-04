package classfiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


import testfiles.ShoppingTest;

public class SwagLabs {

	    WebDriver driver;
		ExtentReports report;
		ExtentTest test;
		//SoftAssert soft = new SoftAssert();
		
		//============== WebElements ===================
		
		@FindBy(xpath="//input[@id='user-name']")
		WebElement UserName;
		
		@FindBy(xpath="//input[@id='password']")
		WebElement Password;
		
		@FindBy(xpath= "//input[@id='login-button']")
		WebElement Login;
		
		@FindBy(xpath= "//button[@id='add-to-cart-sauce-labs-backpack']")
		WebElement addCart;
		
		@FindBy(xpath= "//a[@class='shopping_cart_link']")
		WebElement ShoppingCart;
		
		@FindBy(xpath= "//div[@class='inventory_item_name']")
		WebElement CartCheck;
		
		//============== Constructor ===================
		
		/*public SwagLabs() {
			
			driver = ShoppingTest.driver;
			report = ShoppingTest.report;
			test = ShoppingTest.test;
			
			PageFactory.initElements(driver, this);
		}*/
		
		
		
		
}
