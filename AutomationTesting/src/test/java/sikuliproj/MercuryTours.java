package sikuliproj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import java.util.concurrent.TimeUnit;

/**
 * Created by Harsha on 8/14/2016.
 */
public class MercuryTours {


    public static void main(String[] args) throws FindFailed, InterruptedException {

        System.setProperty("webdriver.chrome.driver","F:\\Selenium2\\BrowserDrivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://newtours.demoaut.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        Screen screen=new Screen() ;
        Pattern User_Name=new Pattern("C:\\Users\\Harsha\\IdeaProjects\\AutomationTesting\\MercuryToursSikuliImages\\User_Name.PNG");
        screen.type(User_Name,"Harsha");
        Pattern Psswd=new Pattern("C:\\Users\\Harsha\\IdeaProjects\\AutomationTesting\\MercuryToursSikuliImages\\Psswd.PNG");
        screen.type(Psswd,"sdnfsdvs");
        Pattern Signin=new Pattern("C:\\Users\\Harsha\\IdeaProjects\\AutomationTesting\\MercuryToursSikuliImages\\Signin.PNG");
        screen.click(Signin);
//        screen.find(Signin);
        Pattern Signon=new Pattern("C:\\Users\\Harsha\\IdeaProjects\\AutomationTesting\\MercuryToursSikuliImages\\Signon.PNG");
        Thread.sleep(2000);
        try {
            screen.wait(Signin, 5);
            System.out.print("Found the Signon");
        }catch(FindFailed ff){

            System.out.print("could not find the Signon");
        }




        driver.close();
    }

}
