package vn.edu.elight.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import vn.edu.elight.pages.CodeCoursePage;

public class CodeCourseSteps extends ScenarioSteps {
	
	CodeCoursePage onCodeCoursePage;

	@Step
	public void activeCode(String code) {
		onCodeCoursePage.enterCode(code);
	}
	@Step
	public void activeWithWEmptyCode() {
		onCodeCoursePage.clearFieldCode();
	}
	@Step
	public void clickOnActiveCodeBt()
	{
		onCodeCoursePage.clickOnActiveCodeButton();
	}
}
