package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.BrowserUtils;
import utilities.DriverFactory;

public class RadioButtonsTest {

    public static void main(String[] args) {
        WebDriver driver = DriverFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        BrowserUtils.wait(2);

        WebElement blackButton = driver.findElement(By.id("blcak"));

        if (blackButton.isDisplayed()&& blackButton.isEnabled()) {
            blackButton.click();
        }else {
            System.out.println("FAI:ED TO CLICK ON BLACK BUTTON");
        }

        if (blackButton.isSelected()){
            System.out.println("TEST PASSED");

        }else{
            System.out.println("TEST FAILED");
        }
    }
}

