package TestCases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.BaseClass.BaseOrangeHRM;
import com.crm.FileUtility.Read_From_Excel;
import com.crm.JavaUtility.GenerateNumbers;
import com.crm.SeleniumUtility.MouseAndKeyboard;
import com.crm.pom.AdminPOM;
import com.crm.pom.HomePage;

public class AdminModule extends BaseOrangeHRM {
	@Test
	public void tc_001() throws InterruptedException, EncryptedDocumentException, IOException {
		String homePage_url = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		Thread.sleep(2000);
		String actual_url = driver.getCurrentUrl();
		assertEquals(actual_url,homePage_url," i am not in HomePage");
		Reporter.log("i am im homepage ",true);
		HomePage home = new HomePage(driver);
		home.admin();
		Thread.sleep(2000);
		AdminPOM admin = new AdminPOM(driver);
		admin.addUser();
		Thread.sleep(2000);
		admin.user_role();
		MouseAndKeyboard.arrowDown(driver,1);
		admin.Status();
		MouseAndKeyboard.arrowDown(driver,1);
		String password = Read_From_Excel.readExcel("Admin", 1, 1);
		admin.password(password);
		Thread.sleep(2000);
		String emp_name = Read_From_Excel.readExcel("Admin", 1, 2);
		admin.Emp_Name(emp_name);
		Thread.sleep(3000);
		MouseAndKeyboard.arrowDown(driver, 1);
		String name = Read_From_Excel.readExcel("Admin", 1, 3);
		String user = GenerateNumbers.createUserName(name, 1000);
		admin.userName(user);
		Thread.sleep(3000);
		admin.confirm_password(password);
		Thread.sleep(2000);
		admin.save();
		
		Thread.sleep(8000);
		WebElement new_user=driver.findElement(By.xpath("//div[text()='"+user+"']"));
        assertTrue(new_user.isDisplayed(),"user name is not display");	
        Reporter.log("new user add Successfully",true);
        Thread.sleep(2000);

	}

}
