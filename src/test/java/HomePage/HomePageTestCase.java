package HomePage;

import org.testng.annotations.Test;

import com.crm.BaseClass.BaseOrangeHRM;
import com.crm.pom.HomePage;

public class HomePageTestCase extends BaseOrangeHRM {
	@Test
	public void test1() {
		HomePage home = new HomePage(driver);
		home.search("Admin");
	}
	@Test
	public void test2() throws InterruptedException {
		HomePage home = new HomePage(driver);
		home.admin();
		Thread.sleep(2000);
	}
	@Test
	public void test3() throws InterruptedException {
		HomePage home = new HomePage(driver);
		home.AssignLeave();
		Thread.sleep(2000);
	}
}
