package com.sparta.swaglabs.cucumber.stepdefs;

import com.sparta.swaglabs.pom.pages.LoginPage;
import com.sparta.swaglabs.pom.pages.ProductsPage;
import com.sparta.swaglabs.pom.util.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.ProfilesIni;

public class LoginSteps {

    private static final int WAIT_TIME = 0;
    private static final boolean HEADLESS = true;
    private static final String DRIVER_LOC = "src/test/resources/geckodriver.exe";

    private static WebDriver driver;
    private static FirefoxOptions options;
    private static LoginPage loginPage;

    @Before
    public void setup() {
        // TODO: use factory instead
        DriverManager.setDriverLocation("firefox", DRIVER_LOC);
        options = new FirefoxOptions();
        options.setProfile(new ProfilesIni().getProfile("dev"));
        options.setHeadless(HEADLESS);
        driver = new FirefoxDriver(options);
    }

    @Given("I am on the Login page")
    public void iAmOnTheLoginPage() {
    }

    @When("I type in a valid password in the password field")
    public void iTypeInAValidPasswordInThePasswordField() {
    }

    @And("I press the Login button")
    public void iPressTheLoginButton() {
    }

    @Then("I should see a \"username is required\" error message")
    public void iShouldSeeAUsernameIsRequiredErrorMessage() {
    }

    @Then("I should see a \"password is required\" error message")
    public void iShouldSeeAPasswordIsRequiredErrorMessage() {
    }

    @When("I type in a valid username in the username field")
    public void iTypeInAValidUsernameInTheUsernameField() {
    }

    @Then("I should login successfully")
    public void iShouldLoginSuccessfully() {
    }

    @And("I type in an invalid password in the password field")
    public void iTypeInAnInvalidPasswordInThePasswordField() {
    }

    @Then("I should see an error message about invalid credentials")
    public void iShouldSeeAnErrorMessageAboutInvalidCredentials() {
        loginPage = new LoginPage(driver);
        loginPage.fillWithUsername("standard_user");
        loginPage.fillWithPassword("secret_sauce");
        loginPage.submitLogin();

        //ProductsPage productsPage = new ProductsPage(driver);
        ProductsPage productsPage = loginPage.getRedirect();
        //productsPage.goToTwitter();
        //System.out.println(driver.getCurrentUrl());
        System.out.println(productsPage.goToTwitter().getUrl());
    }

    @When("I type in an invalid username in the username field")
    public void iTypeInAnInvalidUsernameInTheUsernameField() {
    }

    @After
    public void teardown() {
        driver.quit();
    }
}
