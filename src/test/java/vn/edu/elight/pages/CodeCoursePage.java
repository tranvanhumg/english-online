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

	@FindBy(xpath = "/html/body/div[3]/section/div/div/div/form/div[3]/a/span/button")
	WebElementFacade Activebt;

	public void clickOnActiveCodeButton() {
		Activebt.click();
	}

	@FindBy(xpath = "/html/body/div[3]/section/div/div/div/form/div[3]/a/span")
	WebElementFacade linkTextLogin;

	public void clickOnLinkTextLogin() {
		linkTextLogin.click();
	}

	@FindBy(xpath = "//button[@class='btn btn-xs btn-danger'][contains(.,'Đăng nhập')]")
	WebElementFacade Loginbt;

	public void clickOnLoginButton() {
		Loginbt.click();
	}
	
	@FindBy(xpath = "//p[@class='message-error ng-binding ng-scope'][contains(.,'Mã thẻ không được để trống.')]")
	WebElementFacade messageErrorEmpty;
	public String getMessageErrorEmpty() {
		return messageErrorEmpty.getText();
	}
	@FindBy(xpath = "//p[@class='message-error ng-binding ng-scope'][contains(.,'Sai mã thẻ')]")
	WebElementFacade messageErrorWrongKey;
	public void getMessageErrorWrongKey() {		
		messageErrorWrongKey.getText();
	}
}
