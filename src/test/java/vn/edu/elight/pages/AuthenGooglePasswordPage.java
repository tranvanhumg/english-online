package vn.edu.elight.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AuthenGooglePasswordPage extends PageObject {
	
	WebElementFacade password;

	public void enterPassword(String pwd) {
		element(password).sendKeys(pwd);
	}

	public void clearPassword() {
		element(password).clear();
	}

	//show pass
	@FindBy(xpath = "//span[@class='wRNPwe S7pdP']")
	WebElementFacade showPasswordBt;
	public void clickOnShowPasswordBt() {
		showPasswordBt.waitUntilClickable().click();
	}
	
	//hide pass
	@FindBy(xpath = "//span[@class='wRNPwe pVlEsd']")
	WebElementFacade hidePasswordBt;
	public void clickOnHidePasswordBt() {
		hidePasswordBt.waitUntilClickable().click();
	}
	
	@FindBy(xpath = "//div[@jsname='bCkDte']/span[@class='CwaK9']/span[@class='RveJvd snByac']")
	WebElementFacade linkTextForgetPassword;

	public void clickOnlinkTextForgetPassword() {
		linkTextForgetPassword.click();
	}

	@FindBy(xpath = "//div[@jsname='Njthtb']/span[@class='CwaK9']/span[@class='RveJvd snByac']")
	WebElementFacade continueBt;

	public void clickOnContinueBt() {
		continueBt.click();
	}
	
	//Mật khẩu không chính xác. Hãy thử lại hoặc nhấp vào 'Bạn quên mật khẩu' để đặt lại mật khẩu.
	//Nhập mật khẩu
	@FindBy(xpath = "//div[@jsname='B34EJ']/span")  
	WebElementFacade messageErrorPassword;
	public void getMessageErrorPassword() {
		messageErrorPassword.waitUntilVisible().getText();
	}
}
