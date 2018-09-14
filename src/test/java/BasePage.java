import org.openqa.selenium.By;

public class BasePage {

    public void clickOn(By locator) {
        DriverWrapper.getDriver().findElement(locator).click();
    }

    public void setValue(By locator, String text) {
        DriverWrapper.getDriver().findElement(locator).sendKeys(text);
    }
}
