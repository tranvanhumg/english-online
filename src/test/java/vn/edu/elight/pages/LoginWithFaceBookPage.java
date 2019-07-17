package vn.edu.elight.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginWithFaceBookPage extends PageObject{

	WebElementFacade email;
	public void enterEmail(String emailStr) {
		email.sendKeys(emailStr);
	}
	public void clearEmail() {
		email.clear();
	}
	
	WebElementFacade pass;
	public void enterPassWord(String pwd)
	{
		pass.sendKeys(pwd);
	}
	public void clearPassWord() {
		pass.clear();
	}
	
	WebElementFacade loginbutton;
	public void clickOnLoginBt() {
		loginbutton.click();
	}
	
	@FindBy(xpath = "//a[contains(.,'Forgotten account?')]")
	WebElementFacade linkTextForgotPassword;
	public void clickOnLinkTextFogotPassword() {
		linkTextForgotPassword.click();		
	}
	
	@FindBy(xpath = "//a[contains(.,'Create New Account')]")
	WebElementFacade createNewAccountFaceBookBt;
	public void clickOnNewAccountFaceBookBt() {
		createNewAccountFaceBookBt.click();
	}
	
	@FindBy(xpath = "//div[@class='fsl fwb fcb'][contains(.,'Vui lòng nhập lại mật khẩu của bạn')]")
	WebElementFacade messageErrorWrongPassword;
	public void getMessageErrorWrongPassword() {
		messageErrorWrongPassword.getText();
	}
	
	@FindBy(xpath = "//div[@class='fsl fwb fcb'][contains(.,'Số điện thoại hoặc email không chính xác')]")
	WebElementFacade messageErrorWrongEmailOrPassword;
	public void getMessageErrorWrongEmailOrPassword() {
		messageErrorWrongEmailOrPassword.getText();
	}
	
}
