package PagesDirectory;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationResult {
    private final WebDriver driver;
    private final By successfulRegister = By.className("result");
    public RegistrationResult(WebDriver driver){
        this.driver=driver;
    }
    public RegistrationResult assertOnRegistrationMessage(){
        assertEquals(driver.findElement(successfulRegister).getText(),"Your registration completed");
        return new RegistrationResult(driver);
    }


}
