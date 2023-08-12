package PagesDirectory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver driver;
    private By registerButton = By.className("ico-register");
    private By loginButton = By.className("ico-login");

    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    public RegistrationPage clickOnRegistration(){
       driver.findElement(registerButton).click();
        return new RegistrationPage(driver);
    }

}
