package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AT01_NavigateTitleAssertScreenshot {

    @Test
    public void NavHn() throws IOException {
        //below 2 line will open chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //maximize window
        driver.manage().window().maximize();
        //navigate to website
        driver.get("https://www.thegoodguys.com.au/");
        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //get title of the page
        String ActualTitle=driver.getTitle();
        System.out.println("ActualTitle : "+ActualTitle);
        String ExpectedTitle="The Good Guys - Online Electrical & Home Appliances";
        //Assertion Version-1 [here we are trying to match expected to actual]
        Assert.assertEquals(ExpectedTitle,ActualTitle);
        //Assertion Version-2 [here we are checking for a specific value from entire title to match]
        Assert.assertTrue(ActualTitle.contains("Electrical"));

        //Screenshot
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File("C:\\Users\\softw\\screenshot.png"));
        //this will close the browser
       // driver.close();
        //this will close chromdrive.exe + browser
     //   driver.quit();
        // if we dont driver.quit, then everytime we run the code, chromediver.exe will open and it
        //buildup in our machine and our machine will crash


    }
}
