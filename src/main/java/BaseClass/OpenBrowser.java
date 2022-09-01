package BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
    public static WebDriver driver;
    public static void NavToWebsite(String url){
        //below 2 line will open chrome browser
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        //maximize window
        driver.manage().window().maximize();
        //navigate to website
        driver.get(url);

    }

}
