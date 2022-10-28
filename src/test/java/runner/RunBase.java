package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunBase {

   static WebDriver driver;
   public enum Browser {FIREFOX, CHROME}

   public static WebDriver getDriver(){
        if(driver == null){
            getDriver(Browser.FIREFOX);
        }else{
            return driver;
        }
    return null;
   }

    public static WebDriver getDriver(Browser browser) {

       if(driver != null){
            driver.quit();
        }

        switch (browser) {
            case CHROME:
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                driver = new FirefoxDriver();
                break;
            default:
                throw new IllegalArgumentException("Passe um navegador valido");
        }
        return driver;
    }
}
