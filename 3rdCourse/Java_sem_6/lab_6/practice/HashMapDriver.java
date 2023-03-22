package practice;

import java.util.LinkedHashMap;
import java.util.WeakHashMap;

public class HashMapDriver {
    public static void main(String[] args) {
        WeakHashMap<String, String> map = new WeakHashMap<>();
        map.put("CIT", "Computing and Information Technology");
        map.put("CHI", "Childcare and Early Education");
        map.put("MVS", "Motor Vehicle Systems");
        map.put("BTH", "Beauty Therapy");
        map.put("GDE", "Graphic Design");
        System.out.println(map);
        System.out.println(map.get("BTH"));
    }
}
