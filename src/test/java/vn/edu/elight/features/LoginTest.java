package vn.edu.elight.features;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import vn.edu.elight.steps.LoginSteps;

@RunWith(SerenityRunner.class)

public class LoginTest {
	String email = "tranvan.humg@gmail.com";
	String pwd = "";

	@Managed(driver = "firefox")
	WebDriver driver;

	@Steps
	LoginSteps testerLoginSteps;

//	@Before
//	public void tearUp() {
//		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
//		//driver = new ChromeDriver();
//		driver = new FirefoxDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//	}
//
//	@After
//	public void tearDow() {
//		driver.quit();
//	}

	@Test
	public void loginWithFBAc() {
		testerLoginSteps.openLoginPage();
		testerLoginSteps.login(email, pwd);
		testerLoginSteps.clickOnLoginBt();
	}

	@Test
	public void loginWithFBAcEmty() {
		testerLoginSteps.openLoginPage();
		testerLoginSteps.loginEmptyAc();
		testerLoginSteps.clickOnLoginBt();
	}

}
