package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
    WebDriver driver;

//    By samsungGalaxyS6ImageCartPage = By.xpath("//*[@id=\"tbodyid\"]/tr[1]/td[1]/img");
//    By nokiaLumia1520ImageCartPage = By.xpath("//*[@id=\"tbodyid\"]/tr[1]/td[1]/img");

    By universalFirstProductOnCartPage = By.xpath("//*[@id=\"tbodyid\"]/tr[1]/td[1]/img");
    By placeOrderButton = By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button");
    By inputNameForm = By.xpath("//*[@id=\"name\"]");
    By inputCountryForm = By.xpath("//*[@id=\"country\"]");
    By inputCityForm = By.xpath("//*[@id=\"city\"]");
    By inputCreditCardForm = By.xpath("//*[@id=\"card\"]");
    By inputMonthForm = By.xpath("//*[@id=\"month\"]");
    By inputYearForm = By.xpath("//*[@id=\"year\"]");
    By purchaseButton = By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]");
    By viewDescription = By.xpath("/html/body/div[10]/p");
    By okButton = By.xpath("/html/body/div[10]/div[7]/div/button");
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void userWillSeeFirstProduct() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement productTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(universalFirstProductOnCartPage));
        productTitle.isDisplayed();

    }

    public void userClickPlaceOrder() {
        WebElement element = driver.findElement(placeOrderButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
    }


    public void userFillTheNameForm(String generatedFill) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement usernameInput = wait.until(ExpectedConditions.elementToBeClickable(inputNameForm));
        usernameInput.sendKeys(generatedFill);

    }


    public void userFillTheCountryForm(String generatedFill) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement usernameInput = wait.until(ExpectedConditions.elementToBeClickable(inputCountryForm));
        usernameInput.sendKeys(generatedFill);

    }


    public void userFillTheCityForm(String generatedFill) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement usernameInput = wait.until(ExpectedConditions.elementToBeClickable(inputCityForm));
        usernameInput.sendKeys(generatedFill);

    }


    public void userFillTheCreditCardForm(String generatedFill) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement usernameInput = wait.until(ExpectedConditions.elementToBeClickable(inputCreditCardForm));
        usernameInput.sendKeys(generatedFill);

    }


    public void userFillTheMonthForm(String generatedFill) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement usernameInput = wait.until(ExpectedConditions.elementToBeClickable(inputMonthForm));
        usernameInput.sendKeys(generatedFill);

    }


    public void userFillTheYearForm(String generatedFill) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement usernameInput = wait.until(ExpectedConditions.elementToBeClickable(inputYearForm));
        usernameInput.sendKeys(generatedFill);

    }


    public void userClickThePurchaseButton() {
        WebElement element = driver.findElement(purchaseButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
    }

    public void userCanSeeTheDescriptionOfTheOrder() throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement productTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(viewDescription));
        productTitle.isDisplayed();
        Thread.sleep(5000);

    }

    public void userClickOKButton() {
        WebElement element = driver.findElement(okButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
    }
}
