package dz.algeev.other;

import java.util.HashMap;
import java.util.Map;

public interface Connection {
    String next();
    static  Connection of(String name){
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "file.doc");
        map.put(2, "file.pdf");
        map.put(3, "file.txt");
        return null;
    }
}
