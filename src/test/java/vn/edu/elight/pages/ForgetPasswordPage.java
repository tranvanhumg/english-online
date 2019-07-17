package vn.edu.elight.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://elight.edu.vn/tieng-anh-online/forget-account")
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
	
	@FindBy(xpath = "//h4[@class='message-error ng-binding']")
	WebElementFacade messageErrorEmail;
	public void getMessageErrorEmail() {
		messageErrorEmail.getText();
	}
}
