package BasicOfJava;

import org.junit.Test;

public class AT13_trimLearn {

    @Test
    public void trimusage(){
        String myName = " software ";
        String urName = "TestLab";
        //leading spaces and ending spaces will be removed by trim
        System.out.println("myName+urName:"+myName.trim()+urName);

    }
}
