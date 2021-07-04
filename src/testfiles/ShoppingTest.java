package testfiles;

import java.io.IOException;

import org.testng.annotations.Test;

import classfiles.HomePage;
import classfiles.SwagLabs;


public class ShoppingTest extends ShoppingBaseClass {

	@Test
	public void LoginTest2() throws Throwable {
		
		HomePage lnobj = new HomePage();
		HomePage HPtest = new HomePage();
		
		String uname = sheet.getRow(1).getCell(0).getStringCellValue();
		
		String pass = sheet.getRow(1).getCell(1).getStringCellValue();
		
		String product = sheet.getRow(1).getCell(2).getStringCellValue();
		
		lnobj.LoginTest(uname, pass);
		HPtest.AddtoCart(product);
		HPtest.GotoCart();
	}
	
	/*@Test(dependsOnMethods = "LoginTest2")
	public void homepageTest() {
		
		HomePage HPtest = new HomePage();
		
		String uname = sheet.getRow(1).getCell(0).getStringCellValue();
		
		String pass = sheet.getRow(1).getCell(1).getStringCellValue();
		
		//String product = sheet.getRow(1).getCell(2).getStringCellValue();
		
		HPtest.AddtoCart(uname, pass);
		
		
		
	}*/
}
