package practice;

import java.util.HashMap;
import java.util.LinkedList;

public class HashMapDriver {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("CIT", "Computing and Information Technology");
        map.put("CHI", "Childcare and Early Education");
        map.put("MVS", "Motor Vehicle Systems");
        map.put("BTH", "Beauty Therapy");
        map.put("GDE", "Graphic Design");
        System.out.println(map);
        System.out.println(map.get("MVS"));
    }
}
