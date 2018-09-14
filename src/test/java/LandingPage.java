import org.openqa.selenium.By;

public class LandingPage extends BasePage{

    //Locators
    private By emailTextField = By.id("email");
    private By passwordField = By.id("pass");
    private By loginButton = By.id("u_0_2");

    //Methods
    public void enterEmail(String email) {
        setValue(emailTextField, email);
    }

    public void enterPassword(String password) {
        setValue(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOn(loginButton);
    }
}
