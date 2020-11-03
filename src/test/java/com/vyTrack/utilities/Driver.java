package com.vyTrack.utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Driver {
    private Driver(){
    }
    private static WebDriver driver;

    public static WebDriver getDriver() {
      if (driver==null) {
          String browser =  ConfigurationReader.getProperty("browser");
          switch (browser) {
              case "chrome":
                  WebDriverManager.chromedriver().setup();//**
                  driver = new ChromeDriver();
                  break;
              case "firefox":
                  WebDriverManager.firefoxdriver().setup();//**
                  driver = new FirefoxDriver();
                  break;
              default:
                  throw new RuntimeException("Wrong browser name: "+browser);//**
          }
      }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
