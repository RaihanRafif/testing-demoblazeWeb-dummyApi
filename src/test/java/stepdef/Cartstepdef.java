package stepdef;

import Pages.CartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.commons.lang3.RandomStringUtils;

public class Cartstepdef extends BaseTest{

    CartPage cartPage;

    private String generatedFill;

    @And("user is on the cart page")
    public void userIsOnTheCartPage() {
        cartPage = new CartPage(driver);
        cartPage.userWillSeeFirstProduct();
    }

    @Then("user will see Samsung galaxy s\\(six) on the Cartpage")
    public void userWillSeeSamsungGalaxySSixOnTheCartpage() {
        cartPage.userWillSeeFirstProduct();

    }

    @Then("user will see Nokia lumia\\(OneFiveTwoZero) on the Cartpage")
    public void userWillSeeNokiaLumiaOneFiveTwoZeroOnTheCartpage() {
        cartPage.userWillSeeFirstProduct();
        driver.close();
    }


    @Then("user will see Nexus s\\(six) on the Cartpage")
    public void userWillSeeSamsungNexusSSixOnTheCartpage() {
        cartPage.userWillSeeFirstProduct();
        driver.close();
    }

    @Then("user will see Samsung galaxy s\\(seven) on the Cartpage")
    public void userWillSeeSamsungGalaxySSevenOnTheCartpage() {
        cartPage.userWillSeeFirstProduct();
        driver.close();
    }

    @Then("user will see Iphone \\(six) \\(ThirtyTwo) gb on the Cartpage")
    public void userWillSeeIphoneSixThirtyTwoGbOnTheCartpage() {
        cartPage.userWillSeeFirstProduct();
        driver.close();

    }

    @Then("user will see Sony xperia z\\(five) on the Cartpage")
    public void userWillSeeSonyXperiaZFiveOnTheCartpage() {
        cartPage.userWillSeeFirstProduct();
        driver.close();
    }

    @Then("user will see HTC One M\\(Nine) on the Cartpage")
    public void userWillSeeHTCOneMNineOnTheCartpage() {
        cartPage.userWillSeeFirstProduct();
        driver.close();

    }

    @Then("user will see Sony vaio i\\(Five) on the Cartpage")
    public void userWillSeeSonyVaioIFiveOnTheCartpage() {
        cartPage.userWillSeeFirstProduct();
        driver.close();

    }

    @Then("user will see Sony vaio i\\(Seven) on the Cartpage")
    public void userWillSeeSonyVaioISevenOnTheCartpage() {
        cartPage.userWillSeeFirstProduct();
        driver.close();
    }

    @Then("user will see Apple monitor \\(TwentyFour) on the Cartpage")
    public void userWillSeeAppleMonitorTwentyFourOnTheCartpage() {
        cartPage.userWillSeeFirstProduct();
        driver.close();
    }

    @Then("user will see MacBook air on the Cartpage")
    public void userWillSeeMacBookAirOnTheCartpage() {
        cartPage.userWillSeeFirstProduct();
        driver.close();
    }

    @Then("user will see Dell i\\(Seven) \\(Eight)gb on the Cartpage")
    public void userWillSeeDellISevenEightGbOnTheCartpage() {
        cartPage.userWillSeeFirstProduct();
        driver.close();
    }

    @Then("user will see \\(Twenty Seventeen) Dell \\(Five point Six) gb on the Cartpage")
    public void userWillSeeTwentySeventeenDellFivePointSixGbOnTheCartpage() {
        cartPage.userWillSeeFirstProduct();
        driver.close();
    }

    @Then("user will see ASUS Full HD on the Cartpage")
    public void userWillSeeASUSFullHDOnTheCartpage() {
        cartPage.userWillSeeFirstProduct();
        driver.close();
    }

    @Then("user will see MacBook Pro on the Cartpage")
    public void userWillSeeMacBookProOnTheCartpage() {
        cartPage.userWillSeeFirstProduct();
        driver.close();
    }

    @And("user click Place Order")
    public void userClickPlaceOrder() {
        cartPage.userClickPlaceOrder();
        
    }

    @And("user fill the Name form")
    public void userFillTheNameForm() {
        generatedFill = "user_" + RandomStringUtils.randomAlphanumeric(8); // Menghasilkan suatu username acak
        cartPage.userFillTheNameForm(generatedFill);
        
    }

    @And("user fill the Country form")
    public void userFillTheCountryForm() {
        generatedFill = RandomStringUtils.randomAlphanumeric(8); // Menghasilkan suatu username acak
        cartPage.userFillTheCountryForm(generatedFill);
        
    }

    @And("user fill the City form")
    public void userFillTheCityForm() {
        generatedFill = RandomStringUtils.randomAlphanumeric(8); // Menghasilkan suatu username acak
        cartPage.userFillTheCityForm(generatedFill);
        
    }

    @And("user fill the Credit card form")
    public void userFillTheCreditCardForm() {
        generatedFill = RandomStringUtils.randomAlphanumeric(8); // Menghasilkan suatu username acak
        cartPage.userFillTheCreditCardForm(generatedFill);
        
    }

    @And("user fill the Month form")
    public void userFillTheMonthForm() {
        generatedFill = RandomStringUtils.randomAlphanumeric(8); // Menghasilkan suatu username acak
        cartPage.userFillTheMonthForm(generatedFill);
        
    }

    @And("user fill the Year Form")
    public void userFillTheYearForm() {
        generatedFill = RandomStringUtils.randomAlphanumeric(8); // Menghasilkan suatu username acak
        cartPage.userFillTheYearForm(generatedFill);
        
    }

    @Then("user click the Purchase button")
    public void userClickThePurchaseButton() {
        cartPage.userClickThePurchaseButton();

    }

    @And("user can see the description of the order")
    public void userCanSeeTheDescriptionOfTheOrder() throws InterruptedException{
        cartPage.userCanSeeTheDescriptionOfTheOrder();
    }

    @And("user click OK button")
    public void userClickOKButton() {
        cartPage.userClickOKButton();
    }
}
