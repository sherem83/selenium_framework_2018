package lesson_1;

import org.openqa.selenium.By;

public class LandingPage extends BasePage{

    //Locators
    private By emailTextField = By.id("email");
    private By passwordField = By.id("pass");
    private By loginButton = By.id("u_0_2");
    private By maleGender = By.id("u_0_a");

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

    public boolean isMaleSelected() {
        return isSelected(maleGender);
    }

    public void clickOnMaleRadioButton() {
        clickOn(maleGender);
    }
}
