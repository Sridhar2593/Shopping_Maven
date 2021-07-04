package classfiles;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import testfiles.ShoppingBaseClass;
import testfiles.ShoppingTest;

public class HomePage {

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
	
	public HomePage() {
		
		driver = ShoppingBaseClass.driver;
		report = ShoppingBaseClass.report;
		test = ShoppingBaseClass.test;
		
		PageFactory.initElements(driver, this);
	}

	public void LoginTest(String uname, String pass) {
		
		test = report.startTest("Login Test Case");
		UserName.sendKeys(uname);
		test.log(LogStatus.PASS, "Successfully enter the UserName");
		Password.sendKeys(pass);
		test.log(LogStatus.PASS, "Successfully enter the Password");
		Login.click();
		test.log(LogStatus.PASS, "Successfully clicked on the Login Link");
	}
	
	public void AddtoCart(String product) throws NullPointerException {
		
		WebElement btnAddCrt = driver.findElement(By.xpath("//*[text() = '" + product + "']//following::button[1]"));
		btnAddCrt.click();
		
		//test.log(LogStatus.PASS, "Successfully clicked on the Add cart Link");
		
		
		
	}
	
	public void GotoCart() {
		
		ShoppingCart.click();
		
		//test.log(LogStatus.PASS, "Successfully clicked on the Shopping cart Link");
		
		String ItemCartCheck = CartCheck.getText();
		
		String ExpectedItem = "Sauce Labs Fleece Jacket";
		
		//Assert.assertTrue(CartCheck.isDisplayed());
		Assert.assertEquals(ItemCartCheck, ExpectedItem);
		
		if(ItemCartCheck.equals(ExpectedItem)) {
			
			System.out.println("Item Matches");
			//test.log(LogStatus.PASS, "Expected and Actual value does matched");
		}else
		{
			System.out.println("Item does not matches");
			//test.log(LogStatus.FAIL, "Expected and Actual value does not match");
		}
		/*try {
			
			Assert.assertEquals(ItemCartCheck, ExpectedItem);
			test.log(LogStatus.PASS, "Expected and Actual value does matched");
			
		}catch(Throwable e) {
			
			//test.log(LogStatus.FAIL, "Expected and Actual value does not match");
		}*/
		
	}
}
