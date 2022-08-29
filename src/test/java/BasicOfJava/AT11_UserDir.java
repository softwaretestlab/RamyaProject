package BasicOfJava;

import org.junit.Test;

public class AT11_UserDir {
    @Test
    public void UserProjectLocation(){
        System.out.println(System.getProperty("user.dir")+"\\src\\main\\java\\PropertiesFile\\ProjectName.properties");

    }
}
