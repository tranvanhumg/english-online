package vn.edu.elight.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginWithGoogleEnterEmailPage extends PageObject{

	@FindBy(xpath = "//button[contains(.,'elight.edu.vn')]")
	WebElementFacade linkTextViewElightPage;
	public void clickOnLinkTextViewElightPage()
	{
		linkTextViewElightPage.click();
	}
	
	WebElementFacade identifierId;
	public void enterEmail(String email) {
		element(identifierId).sendKeys(email);
	}
	public void clearEmail() {
		element(identifierId).clear();
	}
	@FindBy(xpath = "//button[@jsname='Cuz2Ue'][contains(.,'Bạn quên địa chỉ email?')]")
	WebElementFacade linkTextForgetEmail;
	public void clickOnlinkTextForgetEmail() {
		linkTextForgetEmail.click();
	}
	@FindBy(xpath = "//span[@class='RveJvd snByac'][contains(.,'Tiếp theo')]")
	WebElementFacade continueBt;
	public void clickOnContinueBt() {
		continueBt.click();		
	}
	@FindBy(xpath = "//span[@class='RveJvd snByac'][contains(.,'Tạo tài khoản')]")
	WebElementFacade linkTextCreateNewAccount;
	public void clickOnLinkTextCreateNewAccount() {
		linkTextCreateNewAccount.click();		
	}
		
	//@FindBy(className = "GQ8Pzc")
	@FindBy(xpath = "//div[@class='GQ8Pzc'][contains(.,'Không thể tìm thấy Tài khoản Google của bạn')]")
	WebElementFacade messageErrorEmail;
	public void getMessageErrorEmail() {
		messageErrorEmail.getText();
	}
	
	@FindBy(xpath = "//div[@class='GQ8Pzc'][contains(.,'Hãy nhập email hoặc số điện thoại')]")
	WebElementFacade messageErrorEmptyEmail;
	public void getMessageErrorEmptyEmail() {
		messageErrorEmptyEmail.getText();
	}
}
