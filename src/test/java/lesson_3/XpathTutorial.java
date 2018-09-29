package lesson_3;

import lesson_1.DriverWrapper;
import org.openqa.selenium.By;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class XpathTutorial extends DriverWrapper {

    public static void main(String[] args) {

        getDriver().findElement(By.xpath("Test")).click();

    }

}
