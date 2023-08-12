package TestsDirectory;

import Base.BaseClass;
import PagesDirectory.HomePage;
import PagesDirectory.RegistrationPage;
import PagesDirectory.RegistrationResult;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class RegistrationTests extends BaseClass {
    private RegistrationPage registrationPage;
    private RegistrationResult registrationResult;

    @Test
    public void assertOnSuccessfulRegistration(){
        registrationPage = homePage.clickOnRegistration();
        registrationResult = registrationPage.setRegistrationData("automation","tester", "test3@example.com","P@sswOrd","P@sswOrd");
        registrationResult.assertOnRegistrationMessage();
    }



}
