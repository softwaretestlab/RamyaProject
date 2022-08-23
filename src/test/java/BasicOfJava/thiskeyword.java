package BasicOfJava;

import org.junit.Test;

public class thiskeyword {

    int id =10; //instance variable

@Test
    public void Employee(){
       int id=20; // local variable
    System.out.println(id);
// if instant variable and local variable are same then we use "this" keyword to let its intance variable
        System.out.println(this.id);
    }


    public void Employee(int id){
        this.id=id; // local variable
        System.out.println(id);

           }

           @Test
    public void test(){
               thiskeyword obj = new thiskeyword();
               obj.Employee(50);
           }

}
