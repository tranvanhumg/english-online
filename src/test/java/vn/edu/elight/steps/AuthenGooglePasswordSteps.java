package vn.edu.elight.steps;

import net.thucydides.core.annotations.Step;
import vn.edu.elight.pages.AuthenGooglePasswordPage;

public class AuthenGooglePasswordSteps {
	AuthenGooglePasswordPage onAuthenGooglePasswordPage;

	@Step
	public void sendPwd(String pwd) {
		onAuthenGooglePasswordPage.enterPassword(pwd);
	}
	public void sendEmtyPwd() {
		onAuthenGooglePasswordPage.clearPassword();
	}
	@Step
	public void clickOnContinueToAuthen() {
		onAuthenGooglePasswordPage.clickOnContinueBt();
	}
	@Step
	public void clickOnForgetAc() {
		onAuthenGooglePasswordPage.clickOnlinkTextForgetPassword();
	}
	@Step
	public void clickOnShowPwd() {
		onAuthenGooglePasswordPage.clickOnShowPasswordBt();
	}
	@Step
	public void clickOnHidePwd() {
		onAuthenGooglePasswordPage.clickOnHidePasswordBt();
	}
}
