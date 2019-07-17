package vn.edu.elight.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AuthenGoogleEmailPage extends PageObject{

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
	@FindBy(xpath = "//div[@class='ck6P8']/button[@jsname='Cuz2Ue']")
	WebElementFacade linkTextForgetEmail;
	public void clickOnlinkTextForgetEmail() {
		linkTextForgetEmail.click();
	}
	@FindBy(xpath = "//div[@jsname='Njthtb']/span[@class='CwaK9']/span[@class='RveJvd snByac']")
	WebElementFacade continueBt;
	public void clickOnContinueBt() {
		continueBt.click();		
	}
	@FindBy(xpath = "//div[@jsname='YU8Bzc']/span[@class='CwaK9']/span[@class='RveJvd snByac']")
	WebElementFacade linkTextCreateNewAccount;
	public void clickOnLinkTextCreateNewAccount() {
		linkTextCreateNewAccount.click();		
	}
			
	//Không thể tìm thấy Tài khoản Google của bạn
	//Hãy nhập email hoặc số điện thoại
	@FindBy(xpath = "//div[@class='GQ8Pzc']")
	WebElementFacade messageErrorEmail;
	public void getMessageErrorEmail() {
		messageErrorEmail.waitUntilVisible().getText();
	}
}
