package example.stepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;

import java.util.List;
import java.util.Map;

public class MyStepdefs {

    @Given("^User launch Teachable website$")
    public void launch_Teachable_website() {
        LoginPage.launch_Teachable_website();
    }
    @When("^User click on Login Link$")
    public void iClickOnLoginLink() {
        LoginPage.iClickOnLoginLink();
    }
    @And("^Click on Login Button$")
    public void clickOnLoginButton() {
        LoginPage.clickOnLoginButton();
    }
    @And("^Enter password (.*)$")
    public void enter_Password(String Password) {
        LoginPage.enter_Password(Password);
    }
    @And("^Enter username (.*)$")
    public void enter_Username(String Username) {
        LoginPage.enter_Username(Username);
    }
    @And("^User enters Username$")
    public void userEntersUsername(List<Map> data_table) throws InterruptedException{
        LoginPage.entersUsername(data_table.get(0));
    }
    @And("^User enters Password$")
    public void userEntersPassword(List<Map> data_table) throws InterruptedException{
        LoginPage.entersPassword(data_table.get(0));
    }
    @Then("^Verify if User is logged in$")
    public void verifyIfUserIsLoggedIn() {
        LoginPage.verifyIfUserIsLoggedIn();
    }

    @And("^Verify if error is displayed$")
    public void verifyIfErrorIsDisplayed() {
        LoginPage.verifyIfErrorIsDisplayed();
    }

    @And("^Click on forgot password link$")
    public void clickOnForgotPasswordLink() {
        LoginPage.clickOnForgotPasswordLink();
    }

    @Then("^Verify if Reset page is displayed$")
    public void verifyIfResetPageIsDisplayed() {
        LoginPage.verifyIfResetPageIsDisplayed();
    }

    @When("^User click on SignUp Link$")
    public void userClickOnSignUpLink() {
        LoginPage.userClickOnSignUpLink();
    }
    @And("^I enter Full Name (.*)$")
    public void iEnterFullName(String FullName) {
        LoginPage.iEnterFullName(FullName);
    }
    @And("^Enter Email (.*)$")
    public void enterEmail(String Email) {
        LoginPage.enterEmail(Email);
    }

    @And("^Enter Password (.*)$")
    public void enterPassword(String Password) {
        LoginPage.enterPassword(Password);
    }
    @And("^Click on Accept terms$")
    public void clickOnAcceptTerms() {
        LoginPage.clickOnAcceptTerms();
    }

    @And("^Verify Signup Functionality$")
    public void verifySignupFunctionality() {
        LoginPage.verifySignupFunctionality();
    }

    @And("^Close session$")
    public void closeSession() {
        LoginPage.closeSession();
    }
}
