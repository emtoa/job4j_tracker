package myself.pattern;

import java.util.HashMap;

public class test5 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("parsentev@yandex.ru", "Petr Arsentev Sergeevich");
        map.put("parsentev@yandex.ru", "Petr Arsentev Sergeevich");

        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}
