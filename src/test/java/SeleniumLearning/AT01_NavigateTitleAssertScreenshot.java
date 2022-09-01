package SeleniumLearning;

import BaseClass.OpenBrowser;
import PropertiesFile.ReadPropertiesFile;
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
        OpenBrowser.NavToWebsite(ReadPropertiesFile.PropFile("GGhomePage"));
        //implicit wait
        OpenBrowser.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //get title of the page
        String ActualTitle=OpenBrowser.driver.getTitle();
        System.out.println("ActualTitle : "+ActualTitle);
        String ExpectedTitle="The Good Guys - Online Electrical & Home Appliances";
        //Assertion Version-1 [here we are trying to match expected to actual]
        Assert.assertEquals(ExpectedTitle,ActualTitle);
        //Assertion Version-2 [here we are checking for a specific value from entire title to match]
        Assert.assertTrue(ActualTitle.contains("Electrical"));

        //Screenshot
        File screenshotFile = ((TakesScreenshot)OpenBrowser.driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File("C:\\Users\\softw\\screenshot.png"));
        //this will close the browser
       // OpenBrowser.driver.close();
        //this will close chromdrive.exe + browser
     //   OpenBrowser.driver.quit();
        // if we dont OpenBrowser.driver.quit, then everytime we run the code, chromediver.exe will open and it
        //buildup in our machine and our machine will crash


    }
}
