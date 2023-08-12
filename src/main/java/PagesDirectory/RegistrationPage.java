package PagesDirectory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

    private final WebDriver driver;
    private final By registerTittle = By.className("page-title");
    private final By famaleRadioButton =By.id("gender-female");
    private final By enterFirstName =By.id("FirstName");
    private final By enterLastName = By.id("LastName");
    private final By enterEmail = By.id("Email");
    private final By enterPassword=By.id("Password");
    private final By enterConfirmPassword=By.id("ConfirmPassword");
    private final By registerButton=By.id("register-button");
    public RegistrationPage(WebDriver driver){
        this.driver = driver;
    }

    public String getRegisterTittle(){
        return driver.findElement(registerTittle).getText();
    }
    public RegistrationResult setRegistrationData(String firstName, String lastName, String email, String password, String confirmPassword){
        driver.findElement(famaleRadioButton).click();
        driver.findElement(enterFirstName).sendKeys(firstName);
        driver.findElement(enterLastName).sendKeys(lastName);
        driver.findElement(enterEmail).sendKeys(email);
        driver.findElement(enterPassword).sendKeys(password);
        driver.findElement(enterConfirmPassword).sendKeys(confirmPassword);
        driver.findElement(registerButton).click();
        return new RegistrationResult(driver);
    }

}
