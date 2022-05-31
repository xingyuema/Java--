import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("张三",20182222);
        map.put("李四",20183333);
        System.out.println(map.get("张三"));
        map.remove("张三");
    }
}