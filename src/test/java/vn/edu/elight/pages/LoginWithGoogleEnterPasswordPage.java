package vn.edu.elight.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginWithGoogleEnterPasswordPage extends PageObject {
	
	WebElementFacade password;

	public void enterPassword(String pwd) {
		element(password).sendKeys(pwd);
	}

	public void clearPassword() {
		element(password).clear();
	}

	//hoi thay cach lay locator cua nut nay
	@FindBy(xpath = "")
	WebElementFacade show_hide_PasswordBt;

	public void clickOnShow_Hide_PasswordBt() {
		show_hide_PasswordBt.click();
	}
	
	@FindBy(xpath = "//span[@class='RveJvd snByac'][contains(.,'Bạn quên mật khẩu?')]")
	WebElementFacade linkTextForgetPassword;

	public void clickOnlinkTextForgetPassword() {
		linkTextForgetPassword.click();
	}

	@FindBy(xpath = "//span[@class='RveJvd snByac'][contains(.,'Tiếp theo')]")
	WebElementFacade continueBt;

	public void clickOnContinueBt() {
		continueBt.click();
	}

	@FindBy(xpath = "(//span[contains(.,'Nhập mật khẩu')])[3]")
	WebElementFacade messageErrorEmptyPassword;
	public void getMessageErrorEmptyPassword() {
		messageErrorEmptyPassword.getText();
	}
	
	@FindBy(xpath = "(//span[contains(.,'Mật khẩu không chính xác. Hãy thử lại hoặc nhấp vào 'Bạn quên mật khẩu' để đặt lại mật khẩu.')])[3]")
	WebElementFacade messageErrorWrongPassword;
	public void getMessageErrorEmpttyPassword() {
		messageErrorWrongPassword.getText();
	}
}
