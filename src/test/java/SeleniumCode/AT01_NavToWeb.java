package SeleniumCode;

import BaseClass.OpenBrowser;
import PropertiesFile.ReadPropertiesFile;
import org.junit.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class AT01_NavToWeb {
    @Test
    public static void Nav() throws IOException {
        OpenBrowser.NavToWebsite(ReadPropertiesFile.PropFile("GGhomePage"));
        //implicit wait
        OpenBrowser.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
