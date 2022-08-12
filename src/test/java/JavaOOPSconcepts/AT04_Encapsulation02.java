package JavaOOPSconcepts;

import org.junit.Test;

public class AT04_Encapsulation02{
    @Test
    public void envMethod03(){
        AT03_Encapsulation01 obj = new AT03_Encapsulation01();
        obj.envMethod01(10,20);
        obj.envMethod01(50,50);

        // this part is about the returned value
        //returned value can be further used
        int p= obj.envMethod02(60,70);
        System.out.println(" p value is : "+ p);
        int x = p*500;
        System.out.println(" x value is : "+ x);
    }


}
