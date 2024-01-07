package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class LoginPage {

    WebDriver driver;
    By validateLoginPage = By.xpath("//*[@id=\"logInModalLabel\"]");
    By loginInputPassword = By.xpath("//*[@id=\"loginpassword\"]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void userIsOnLoginPage() {
        driver.findElement(validateLoginPage);
    }

    public void userClickLoginButtonOnTheLoginPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Tunggu hingga tombol Sign Up benar-benar dapat diinteraksi
        WebElement loginLoginPageButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[onclick='logIn()']")));

        // Lakukan scroll ke elemen jika diperlukan (khususnya jika tombol di luar tampilan)
        Actions actions = new Actions(driver);
        actions.moveToElement(loginLoginPageButton).perform();

        // Klik tombol Sign Up
        loginLoginPageButton.click();

//        signUpButton.click();//*[@id="logInModal"]/div/div/div[3]/button[2]
    }

    public void userWillSeeWelcomeUsername() {
        WebElement welcomeElement = driver.findElement(By.xpath("//*[@id=\"nameofuser\"]"));

    }
//    public void inputLoginUsername(String generatedUsername) {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement usernameInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("loginusername")));
//        usernameInput.sendKeys(generatedUsername);
//    }


    public void userInputPasswordForLoginPage(String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Tunggu hingga tombol Sign Up benar-benar dapat diinteraksi
        WebElement passLoginPageButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"loginpassword\"]")));
        passLoginPageButton.sendKeys(password);
    }

    public void userInputUsernameThatNoRegisteredBefore(String generatedUsername) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement usernameInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("loginusername")));
        usernameInput.sendKeys(generatedUsername);
    }

    public void userWillSeeAlertText(String username) {
        try {
            // Tunggu hingga alert muncul dengan waktu maksimal 10 detik
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.alertIsPresent());

            // Tangkap alert
            Alert alert = driver.switchTo().alert();

            // Tampilkan teks alert
            System.out.println("Alert Text: " + alert.getText());
            assertEquals(alert.getText(), username, "pesan sesuai");
            // Terima alert
            alert.accept();
        } catch (NoAlertPresentException e) {
            // Tidak ada alert yang muncul
            System.out.println("No alert present.");
        }

    }
}
