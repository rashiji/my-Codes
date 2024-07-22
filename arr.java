import java.util.HashMap;
import java.util.Map;

public class arr {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 55, 66, 77, 88, 86};
        Map<Integer, Integer> map = new HashMap<>();
        for (int key : arr) {
//            if (map.containsKey(key)) {
//                int value = map.get(key);
//                value++;
//                map.put(key, value);
//            } else {
//                map.put(key, 1);
//            }
       map.put(key, map.getOrDefault(key,0)+1);
  }

        System.out.println(map);
    }
}