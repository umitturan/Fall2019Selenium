/*package day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementById {

    public static void main(String[] args)  throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/login");
        driver.findElement(By.name("username")).sendKeys(...keysToSend: "tomsmith");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys(...keysToSend:"SuperSecretPassword");

        driver.findElement(By.id("wooden_spoon")).click();

        Thread.sleep(2000);

        String expected = "Wlcome to the Area. When you are done click logout below";
        String actual = driver.findElement(By.tagName("h4")).getText();

        if (expected.equals(actual)){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");
        }
        //let's click on logout button. It looks like a button, but it's actually a link
        //if you have couple spaces in the text, just use partialLinkText instead of linkText
        //link-Text -equals()
        //partialLinkText -contains()

        WebElement logout = driver.findElement(By.linkText("Logout"));
        logout.click();
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys(...keysToSend:"wrong");
        driver.findElement(By.name("password")).sendKeys(...keysToSend: "wrong");
        driver.findElement(By.id("wooden_spoon")).click();
        ))
        driver.quit();

    }
}
*/