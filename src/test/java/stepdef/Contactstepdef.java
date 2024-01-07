package stepdef;

import Pages.ContactPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class Contactstepdef extends BaseTest {

    ContactPage contactPage;

    private String generatedUsername;

    @And("user is on Contact page")
    public void userIsOnContactPage() {
        contactPage = new ContactPage(driver);
        contactPage.userIsOnContactPage();
    }

    @When("user input contact email")
    public void userInputContactEmail() {
        generatedUsername = "user_" + RandomStringUtils.randomAlphanumeric(8); // Menghasilkan suatu username acak
        contactPage.inputContactEmail(generatedUsername);
    }

    @And("user input contact name")
    public void userInputContactName() {
        generatedUsername = "user_" + RandomStringUtils.randomAlphanumeric(8); // Menghasilkan suatu username acak
        contactPage.inputContactName(generatedUsername);
    }

    @And("user input message")
    public void userInputMessage() {
        generatedUsername = "user_" + RandomStringUtils.randomAlphanumeric(8); // Menghasilkan suatu username acak
        contactPage.inputMessage(generatedUsername);
    }

    @And("user click send message button on the contact page")
    public void userClickSendMessageButtonOnTheContactPage() {
        contactPage.userSendMessageButton();
    }

    @Then("user will see message {string}")
    public void userWillSeeMessage(String username) {
        contactPage.userWillSeeMessage(username);
    }
}
