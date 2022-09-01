package SeleniumCode;

import BaseClass.OpenBrowser;
import PropertiesFile.ReadPropertiesFile;
import org.junit.Test;
import org.openqa.selenium.By;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AT02_login {

public static void clickAcc(){
    OpenBrowser.driver.findElement(By.xpath("//i[@class='nav-supplementary-icon ggdsicon-user-slim-o']")).click();

}
    @Test
    public static void LoginToGG() throws IOException {

       OpenBrowser.driver.findElement(By.id("WC_AccountDisplay_FormInput_logonId_In_Logon_1")).sendKeys("test");
    }
}
