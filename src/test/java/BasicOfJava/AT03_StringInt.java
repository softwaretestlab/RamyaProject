package BasicOfJava;

import org.junit.Test;

public class AT03_StringInt {

    @Test
            public void test03() {
        //Here we declaring local variables, these variables can be used only in this method
        int i = 10;
        int j = 20;
        int k= i+j; //30
        //print on console
        System.out.println("Value of k is : "+k); //output value of k is :30
        System.out.println("value of k is :"+(i+j));
    }
    @Test
    public void test04(){
        //lets declare some strings

        String test01="Software";
        String test02="TestLab";
        String test03=test01+test02;
        System.out.println("Value of test03 : "+test03);


    }
}
