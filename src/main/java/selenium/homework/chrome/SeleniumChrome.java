package selenium.homework.chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.sql.Driver;

public class SeleniumChrome {
    public static void main(String[] args) {
        // Get the path to the ChromeDriver executable dynamically using System's "user.dir" property
        // This points to the current project directory and builds the path to the "chromedriver.exe" file
        //F:\IntellijProject\p1.google.WithChrome\src\main\resources\chromedriver.exe
        String path = System.getProperty("user.dir")+ File.separator+"src"+File.separator
                +"main"+File.separator+"resources"+File.separator+"chromedriver.exe";

        // Set the system property to specify the location of the ChromeDriver
        // This allows Selenium to communicate with the Chrome browser
        System.setProperty("webdriver.chrome.driver",path);

        // Create a new instance of the Chrome browser
        WebDriver driver= new ChromeDriver();

        // Navigate to Google's homepage
        driver.get("https://www.google.com");
    }
}
