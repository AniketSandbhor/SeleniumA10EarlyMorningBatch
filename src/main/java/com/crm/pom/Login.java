package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="username")
	private WebElement username;
	
	public void username(String data) {
		username.sendKeys(data);
	}
	
	@FindBy(css="input[type='password']")
	private WebElement password;
	
	public void password(String data) {
		password.sendKeys(data);
	}
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	private WebElement login_button;
	public void login_button() {
		login_button.click();
	}
	
	@FindBy(xpath="//p[text()='Forgot your password? ']")
	private WebElement forgot_password; 
	public void forgot_password() {
		forgot_password.click();
	}
	
	@FindBy(xpath="//input[@class='oxd-input oxd-input--active']")
	private WebElement forgot_username; 
	public void forgotUsername(String data) {
		forgot_username.sendKeys(data);
	}
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--large oxd-button--ghost orangehrm-forgot-password-button orangehrm-forgot-password-button--cancel']")
	private WebElement forgot_cancel; 
	public void forgotCancel() {
		forgot_cancel.click();
	}
	
	@FindBy(xpath="='oxd-button oxd-button--large oxd-button--secondary orangehrm-forgot-password-button orangehrm-forgot-password-button--reset']")
	private WebElement reset_password; 
	public void resetPassword() {
		reset_password.click();
	}
	
	
	
	
	
	

}
