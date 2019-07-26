package vn.edu.elight.features;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;
import vn.edu.elight.steps.LoginSteps;

@RunWith(SerenityRunner.class)

public class LoginTest {
	String email = "tranvan.humg@gmail.com";
	String pwd = "";

	@Managed
	WebDriver driver;

	@Steps
	LoginSteps testerLoginSteps;

	@Test
	public void loginElightWithFBAc() {
		testerLoginSteps.openLoginPage();
		testerLoginSteps.login(email, pwd);
		testerLoginSteps.clickOnLoginBt();
	}

	@Pending @Test
	public void loginElightWithFBAcEmty() {
		testerLoginSteps.openLoginPage();
		testerLoginSteps.loginEmptyAc();
		testerLoginSteps.clickOnLoginBt();
	}
}
