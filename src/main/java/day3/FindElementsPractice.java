/*package day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.DriverFactory;

public class FindElementsPractice {

    public static void main(String[] args) {
      //  WebDriverManager.chromedriver().setup();
      //  WebDriver driver = new ChromeDriver();
        WebDriver driver = DriverFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");
        WebElement fullName = driver.findElement(By.name("full_name"));
        fullName.sendKeys(...keysToSend: "Mister Twister");

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys(...keysToSend:"sdet@cybertek.com");
        Thread.sleep(2000);

        WebElement signUp = driver.findElement(By.name("wooden_spoon"));
        signUp.click();
        Thread.sleep(2000);

        driver.quit();



    }
}
*/