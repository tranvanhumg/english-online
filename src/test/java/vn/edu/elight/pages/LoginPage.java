package vn.edu.elight.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://elight.edu.vn/tieng-anh-online/login")
public class LoginPage extends PageObject {

	@FindBy(className = "center-block cursor-pointer social-fb")
	WebElementFacade loginWithFaceBook;

	public void clickOnloginWithFaceBook() {
		loginWithFaceBook.waitUntilClickable().click();
	}

	@FindBy(className = "center-block cursor-pointer social-gg")
	WebElementFacade loginWithGoogle;

	public void clickOnloginWithGoogle() {
		loginWithGoogle.waitUntilClickable().click();
	}

	@FindBy(name = "email")
	WebElementFacade emailField;

	public void enterEmailField(String email) {
		// 4 cách để gọi element
		emailField.sendKeys(email);
		// $("//input[@ng-model='data.email']").sendKeys(email);
		// element(emailField).sendKeys(email);
		// element("//input[@ng-model='data.email']").sendKeys(email);
	}

	public void clearEmailField() {
		emailField.clear();
	}

	WebElementFacade password_in; // using id, name

	public void enterPassword(String pwd) {
		password_in.sendKeys(pwd);
	}

	public void clearPassword() {
		password_in.clear();
	}

	@FindBy(xpath = "//a[@ng-click='goToForgetAccount()']")
	WebElementFacade linkTextForgetPassword;

	public void clickOnLinkForgetPassword() {
		linkTextForgetPassword.waitUntilClickable().click();
	}

	@FindBy(xpath = "//button[@ng-click='signIn(data);'][contains(.,'ĐĂNG NHẬP')]")
	WebElementFacade loginBt;

	public void clickOnLoginBt() {
		loginBt.waitUntilClickable().click();
	}

	@FindBy(xpath = "//a[@ng-click='goToCode()']")
	WebElementFacade backCodeCoursePageBt;

	public void clickOnbackCodeCoursePageBt() {
		backCodeCoursePageBt.waitUntilClickable().click();
	}

	// Email không được để trống
	@FindBy(xpath = "//div[contains(@ng-show,'form_signIn.email.$error.required')]")
	WebElementFacade messageErrorEmptyEmail;

	public String getMessageErrorEmptyEmail() {
		return messageErrorEmptyEmail.waitUntilVisible().getText();
	}

	// Email không đúng định dạng
	@FindBy(xpath = "//div[contains(@ng-show,'form_signIn.email.$error.email')]")
	WebElementFacade messageErrorTypeEmail;

	public String getMessageErrorTypeEmail() {
		return messageErrorTypeEmail.waitUntilVisible().getText();
	}

	// Mật khẩu ít nhất 6 ký tự
	@FindBy(xpath = "//div[contains(@ng-show,'form_signIn.password.$viewValue.length')]/div")
	WebElementFacade messageErrorLengthPassword;

	public String getMessageErrorLengthPassword() {
		return messageErrorLengthPassword.waitUntilVisible().getText();
	}

	// Phải điền đầy đủ thông tin trước khi đăng nhập.
	// Đây là tài khoản Facebook của bạn. Vui lòng click đăng nhập bằng Facebook!
	@FindBy(xpath = "//div[@class='message-error ng-binding ng-scope']")
	WebElementFacade messageErrorScopePassword;

	public String getMessageErrorScopePassword() {
		return messageErrorScopePassword.waitUntilVisible().getText();
	}

	//Cach multi chose doi voi the input
	public void selectFields(String... fields) {

		$("//input[@type='search']").click();
		for (String field : fields) {

			$("//input[@type='search']").typeAndEnter(field);

		}
	}

}
