package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {


public static WebDriver driver;
public static String browser = Config.getValue("browser");

public static WebDriver getDriver(){
    if(driver == null){

        if(browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();

            ChromeOptions co = new ChromeOptions();
            co.addArguments("--remote-allow-origins=*");

            driver = new ChromeDriver(co);
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            return driver;
        }
        else if(browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            return driver;
        }else{
            System.out.println("Invalid Browser type");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
            return driver;
        }


    }else{
        return driver;
    }

}

public  static void quitBrowser(){
    if(driver != null){
        driver.quit();
        driver = null;
    }


}




}
