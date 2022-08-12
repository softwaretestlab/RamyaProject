package BasicOfJava;

import org.junit.Test;

public class AT04_GlobalVariables {
    //global variables are created in the class level
    int i=10;
    int j=20;
    String name="SoftwareTestLab";
    @Test
    public void test05(){
        //local variable
        int l=30;
        int k = l+i+j; //60
        System.out.println("Value of k is : " + k); //output 60

    }
    @Test
    public void test06(){
        //local variable
        String work="ITconsulting";
        System.out.println("total value of i and j : "+ (i+j));
        System.out.println("company name and its work :  " + name+" "+work); //output 60

    }

}
