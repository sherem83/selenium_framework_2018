import org.testng.annotations.Test;

public class VerifyInvalidLogin extends DriverWrapper{

    @Test
    public void verifyInvalidLogin() {
        LandingPage landingPage = new LandingPage();
        //2. Enter username
        landingPage.enterEmail("mohammad@technosoft.io");
        //3. Enter password
        landingPage.enterPassword("test12345");
        //4. Click on login button
        landingPage.clickOnLoginButton();
        //5. Verify invalid login error message
        //TODO: Please complete this step
    }
}
