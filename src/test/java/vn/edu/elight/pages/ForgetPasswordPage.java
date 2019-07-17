package vn.edu.elight.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ForgetPasswordPage extends PageObject {

	WebElementFacade email;

	public void enterEmail(String emailStr) {
		email.sendKeys(emailStr);
	}

	public void clearEmail() {
		email.clear();
	}

	@FindBy(xpath = "//button[@ng-click='forgetAccount(data);']")
	WebElementFacade sendBt;
	public void clickOnSendBt() {
		sendBt.click();
	}
	
	@FindBy(className = "return-login-page")
	WebElementFacade linkTextBackLoginPage;
	public void clickOnLinkTextBackLoginPage() {
		linkTextBackLoginPage.click();
	}
	
	@FindBy(xpath = "//h4[@class='message-error ng-binding'][contains(.,'Email không đúng. Vui lòng nhập email bạn đăng ký tài khoản')]")
	WebElementFacade messageErrorEmail;
	public void getMessageErrorEmail() {
		messageErrorEmail.getText();
	}
}
