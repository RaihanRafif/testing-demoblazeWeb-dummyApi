package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class SignUpPage {

    WebDriver driver;

    private String lastRegisteredUsername;
    private String generatedUsername;
    By validateSignUpPage = By.xpath("//*[@id=\"signInModalLabel\"]");

    By signupInputPassword = By.xpath("//*[@id=\"sign-password\"]");
    private Object username;

//    By signupSignUpPageButton = By.xpath("//button[@onclick='register()']");

//    By
    public SignUpPage(WebDriver driver){
        this.driver = driver;
    }
    public void userIsOnSignUpPage(){
        driver.findElement(validateSignUpPage);
    }
    public void inputSignUpUsername(String generatedUsername) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement usernameInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("sign-username")));
        usernameInput.sendKeys(generatedUsername);
    }

    public void inputLoginUsername(String generatedUsername) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement usernameInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("loginusername")));
        usernameInput.sendKeys(generatedUsername);
    }

    public void inputSignUpPassword(String password) {
        driver.findElement(signupInputPassword).sendKeys(password);
    }
    public void userClickSignUpButtonOnTheSignUpPage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Tunggu hingga tombol Sign Up benar-benar dapat diinteraksi
        WebElement signupSignUpPageButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[onclick='register()']")));

        // Lakukan scroll ke elemen jika diperlukan (khususnya jika tombol di luar tampilan)
        Actions actions = new Actions(driver);
        actions.moveToElement(signupSignUpPageButton).perform();

        // Klik tombol Sign Up
        signupSignUpPageButton.click();
//        WebElement signUpButton = driver.findElement(By.cssSelector("button[onclick='register()']"));
//        signUpButton.click();
    }
    public void userWillSee(String username) {
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

        // Tutup browser setelah menanggapi alert
//        driver.quit();
    }

    public void userWillSeeAlert(String username) {
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

        // Tutup browser setelah menanggapi alert
//        driver.quit();
    }
    }







