package sikuliproj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import java.util.concurrent.TimeUnit;

/**
 * Created by Harsha on 8/13/2016.
 */
public class SikuliTest {


    public static void main(String[] args) throws FindFailed {



        Screen sc=new Screen();
        Pattern pattern=new Pattern("C:\\Users\\Harsha\\Desktop\\SikuliImages\\google_search.PNG");

        System.setProperty("webdriver.chrome.driver","F:\\Selenium2\\BrowserDrivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        sc.type(pattern,"Facebook");

        Pattern suggestive_dd=new Pattern("C:\\Users\\Harsha\\Desktop\\SikuliImages\\google_suggest_dd.PNG");
        sc.click(suggestive_dd);


        driver.close();


    }
}
