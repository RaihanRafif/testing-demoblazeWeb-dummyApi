package stepdef;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class Loginstepdef extends BaseTest{
    LoginPage loginPage;
    private String generatedUsername;

    @And("user click Login button on the sign up page")
    public void userClickLoginButtonOnTheSignUpPage() {
        loginPage.userClickLoginButtonOnTheLoginPage();

    }

    @Then("user will see Welcome username")
    public void userWillSeeWelcomeUsername() {
        loginPage.userWillSeeWelcomeUsername();

    }

//    @And("user input username with the same last username that already been registered \\(for loginPage)")
//    public void userInputUsernameWithTheSameLastUsernameThatAlreadyBeenRegisteredForLoginPage() {
//        loginPage.inputLoginUsername(generatedUsername);
//
//
//    }

    @And("user input password {string} \\(for loginPage)")
    public void userInputPasswordForLoginPage(String password) {
        loginPage.userInputPasswordForLoginPage(password);
    }

    @And("user is on Login page")
    public void userIsOnLoginPage() {
        loginPage = new LoginPage(driver);
        loginPage.userIsOnLoginPage();

    }

    @When("user input username that no registered before")
    public void userInputUsernameThatNoRegisteredBefore() {
        generatedUsername = "user_" + RandomStringUtils.randomAlphanumeric(8); // Menghasilkan suatu username acak
        loginPage.userInputUsernameThatNoRegisteredBefore(generatedUsername);
    }

    @Then("user will see text alert {string}")
    public void userWillSeeTextAlert(String username) {
        loginPage.userWillSeeAlertText(username);
    }
}
