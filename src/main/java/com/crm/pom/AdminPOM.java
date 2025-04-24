package com.crm.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPOM {
	public AdminPOM(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	private WebElement Add_btn;
	
	@FindBy(xpath = "//div[@class='oxd-select-wrapper']")
	private WebElement user_role;
	
	@FindBy(xpath="(//div[@class='oxd-select-wrapper'])[2]")
	private WebElement status;
	
	@FindBy(xpath="//input[@type='password'][1]")
	private WebElement a_passwpord;
	
	@FindBy(xpath="//div[@class='oxd-autocomplete-wrapper']/div/input")
	private WebElement Emp_name;
	
	@FindBy(xpath="(//div[@class='oxd-input-group oxd-input-field-bottom-space']/div[2]/input)[1]")
	private WebElement a_username;
	
	@FindBy(xpath="(//input[@type='password'])[2]")
	private WebElement confirm_password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement save_btn;
	
	
	public void addUser() {
		Add_btn.click();	
	}
	public void user_role() {
		user_role.click();
	}
	public void Status() {
		status.click();
	}
	public void Emp_Name(String data) {
		Emp_name.sendKeys(data);
		
	}
	public void userName(String data) {
		a_username.sendKeys(data);
		
	}
	public void password(String data) {
		a_passwpord.sendKeys(data);
	}
	public void confirm_password(String data) {
		confirm_password.sendKeys(data);
		
	}
	public void save() {
		save_btn.click();	
	}
	
	
}