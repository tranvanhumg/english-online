package vn.edu.elight.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://elight.edu.vn/tieng-anh-online/code")
public class CodeCoursePage extends PageObject {
	
	WebElementFacade input_code;

	public void enterCode(String code) {
		input_code.sendKeys(code);
	}

	public void clearFieldCode() {
		input_code.clear();
	}

	@FindBy(xpath = "//button[@type='submit']")
	WebElementFacade Activebt;

	public void clickOnActiveCodeButton() {
		Activebt.click();
	}

	@FindBy(xpath = "//button[contains(text(),'Đăng nhập')]/ancestor::span")
	WebElementFacade linkTextLogin;

	public void clickOnLinkTextLogin() {
		linkTextLogin.click();
	}

	@FindBy(xpath = "//button[contains(text(),'Đăng nhập')]")
	WebElementFacade Loginbt;

	public void clickOnLoginButton() {
		Loginbt.click();
	}
	
	@FindBy(xpath = "////p[@class='message-error ng-binding ng-scope']")
	WebElementFacade messageError;
	public String getMessageError() {
		return messageError.waitUntilVisible().getText();
	}	
}
