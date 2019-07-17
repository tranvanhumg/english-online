package vn.edu.elight.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AuthenFBPage extends PageObject{

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
	
	@FindBy(xpath = "//a[@id='forgot-password-link']")
	WebElementFacade linkTextForgotPassword;
	public void clickOnLinkTextFogotPassword() {
		linkTextForgotPassword.click();		
	}
	
	@FindBy(xpath = "//a[@href='/reg/']")
	WebElementFacade createNewAccountFaceBookBt;
	public void clickOnNewAccountFBBt() {
		createNewAccountFaceBookBt.click();
	}
	
	//Số điện thoại hoặc email không chính xác
	//Vui lòng nhập lại mật khẩu của bạn
	@FindBy(xpath = "//div[@id='error_box']/div[@class='fsl fwb fcb']")
	WebElementFacade messageErrorAuthen;
	public void getMessageErrorAuthen() {
		messageErrorAuthen.waitUntilVisible().getText();
	}
	
	//Email hoặc số điện thoại bạn đã nhập không khớp với bất kỳ tài khoản nào
	//Mật khẩu bạn đã nhập không chính xác
	@FindBy(xpath = "//div[@id='error_box']/div[2]")
	WebElementFacade messageErrorExplainAuthen;
	public void getMessageErrorExplainAuthen() {
		messageErrorExplainAuthen.waitUntilVisible().getText();
	}
	
	//Đăng ký tài khoản
	@FindBy(xpath = "//div[@id='error_box']/div[2]/a")
	WebElementFacade linkTextNewAccountFB;
	public void clickLinkTextNewAccountFB() {
		linkTextNewAccountFB.waitUntilVisible().getText();
	}
}
