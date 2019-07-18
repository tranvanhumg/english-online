package vn.edu.elight.steps;

import net.thucydides.core.annotations.Step;
import vn.edu.elight.pages.LoginPage;

public class LoginSteps {
	LoginPage onLoginPage;

	@Step
	public void login(String email, String pwd) {
		onLoginPage.enterEmailField(email);
		onLoginPage.enterPassword(pwd);
	}
	@Step
	public void loginEmptyEmail(String pwd) {
		onLoginPage.clearEmailField();
		onLoginPage.enterPassword(pwd);
	}
	@Step
	public void loginEmptyPwd(String email) {
		onLoginPage.enterEmailField(email);
		onLoginPage.clearPassword();
	}
	@Step
	public void loginEmptyAc() {
		onLoginPage.clearEmailField();
		onLoginPage.clearPassword();
	}
	
	@Step
	public void clickOnLoginBt() {
		onLoginPage.clickOnLoginBt();
	}
	@Step
	public void clickOnLoginFB() {
		onLoginPage.clickOnloginWithFaceBook();
	}
	@Step
	public void clickOnLoginGoogle() {
		onLoginPage.clickOnloginWithGoogle();
	}
	@Step
	public void clickOnForgetPwd() {
		onLoginPage.clickOnLinkForgetPassword();
	}
	@Step
	public void clickOnBackCode() {
		onLoginPage.clickOnbackCodeCoursePageBt();
	}
}
