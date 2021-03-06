package vn.edu.elight.steps;

import net.thucydides.core.annotations.Step;
import vn.edu.elight.pages.CodeCoursePage;

public class CodeCourseSteps {
	
	CodeCoursePage onCodeCoursePage;

	@Step
	public void activeCode(String code) {
		onCodeCoursePage.enterCode(code);
	}
	@Step
	public void clearCode() {
		onCodeCoursePage.clearFieldCode();
	}
	@Step
	public void clickOnActiveCode()
	{
		onCodeCoursePage.clickOnActiveCodeButton();
	}
	@Step
	public void clickOnLinkTextLogin()
	{
		onCodeCoursePage.clickOnLinkTextLogin();
	}
	@Step
	public void clickOnBtLogin()
	{
		onCodeCoursePage.clickOnLoginButton();;
	}
}
