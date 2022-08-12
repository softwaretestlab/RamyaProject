package BasicOfJava;

import org.junit.Test;

import java.util.HashMap;

public class AT12_HashMap {
    @Test
    public void test16() {
// here we created an object (map) of Hashmap and this hashmap takes String and Integer as Key:Value
        HashMap<String,Integer> map = new HashMap<>();
        //at this point there is nothing inside map
        System.out.println(map);
        // lets add key values to map
        map.put("Ricky",11);
        map.put("Bianca",8);
        map.put("Sophy",13);
        System.out.println("print map on console : "+ map);
        //Size of hasmap
        int mapSize=map.size();
        System.out.println("hasmap size is : "+mapSize);
        if(map.containsKey("Bianca")){
            int keyVal=map.get("Bianca");
            System.out.println("Key value for "+"Bianca is :"+keyVal);

        }

    }
}
