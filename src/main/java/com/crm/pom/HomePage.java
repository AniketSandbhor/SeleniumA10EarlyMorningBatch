package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//Dashboard page
public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@class='oxd-userdropdown-tab']/img")
	private WebElement profile_icon;
	
	public void profile_icon() {
		profile_icon.click();
	}
	
	@FindBy(xpath="(//a[@class='oxd-userdropdown-link'])[4]")
	private WebElement logOut;
	public void logout() {
		logOut.click();
	}
	
	@FindBy(xpath="//input[@class='oxd-input oxd-input--active']")
	private WebElement search_field;
	public void search(String data) {
		search_field.sendKeys(data);
	}
	
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")
	private WebElement admin;
	public void admin() {
		admin.click();
	}
	
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]")
	private WebElement pim;
	
	public void pim() {
		pim.click();
	}
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[3]")
	private WebElement leave;
	
	public void leave() {
		leave.click();
	}
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[4]")
	private WebElement time;
	
	public void time() {
		time.click();
	}
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[5")
	private WebElement recruitment;
	
	public void recruitment() {
		recruitment.click();
	}
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[6]")
	private WebElement my_info;
	
	public void myInfo() {
		my_info.click();
	}
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[7]")
	private WebElement performance;
	
	public void performance() {
		performance.click();
	}
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[8]")
	private WebElement dashboard;
	
	public void dashboard() {
		dashboard.click();
	}
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[9]")
	private WebElement directory;
	
	public void directory() {
		directory.click();
	}
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[10]")
	private WebElement maintenance;
	
	public void maintenance() {
		maintenance.click();
	}
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[11]")
	private WebElement claim;
	
	public void claim() {
		claim.click();
	}
	@FindBy(xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[12]")
	private WebElement buzz;
	
	public void buzz() {
		buzz.click();
	}
	
	@FindBy(xpath="//button[@title='Assign Leave']")
	private WebElement Assign_leave;
	public void AssignLeave() {
		Assign_leave.click();
	}
	
	
	
}
