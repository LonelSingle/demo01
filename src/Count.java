import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 2018/12/19 0019.
 */
public class Count {
    public static void main(String[] args) {
        String[] arr = new String[]{"aaa", "bbb", "ccc", "ddd", "ddd", "aaa"};
        Map<String, Integer> map = new HashMap<>();

        for (String str : arr) {
            Integer num = map.get(str);
            map.put(str, num == null ? 1 : num + 1);
        }
        Set set = map.entrySet();
        Iterator it = set.iterator();
        System.out.println("方法一 ：");

        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = (Map.Entry<String, Integer>) it.next();
            System.out.println("单词 " + entry.getKey() + " 出现次数 : " + entry.getValue());
        }

        System.out.println("方法二 ：");

        Iterator it01 = map.keySet().iterator();
        while (it01.hasNext()) {
            Object key = it01.next();
            System.out.println("单词 " + key + " 出现次数 : " + map.get(key));

        }
    }

}
