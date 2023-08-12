package TestsDirectory;

import Base.BaseClass;
import PagesDirectory.RegistrationPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HomeTests extends BaseClass {
    private RegistrationPage registrationPage;

    @Test
    public void confirmGoingToRegister(){
        registrationPage = homePage.clickOnRegistration();
        assertEquals(registrationPage.getRegisterTittle(), "Register");
    }
}
