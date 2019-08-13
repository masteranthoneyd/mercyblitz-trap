import java.util.IdentityHashMap;
import java.util.Map;

/**
 * @author ybd
 * @date 2019/8/13
 * @contact yangbingdong1994@gmail.com
 */
public class Trap011_NumberCache {

    public static void main(String[] args) {
        trap1();

        trap2();
    }

    private static void trap1() {
        int a = 127;
        Integer b = 127;
        Integer c = 127;
        System.out.println(a == b);
        System.out.println(b == c);

        int a1 = 128;
        Integer b1 = 128;
        Integer c1 = 128;
        System.out.println(a1 == b1);
        System.out.println(b1 == c1);
    }

    private static void trap2() {
        Map map = new IdentityHashMap<>();
        map.put(1, "Hello");
        map.putIfAbsent(1, "World");
        print(map.get(1));
        print(map.size());

        map.put(1024, "A");
        map.putIfAbsent(1024, "B");
        print(map.get(1024));
        print(map.size());
    }

    private static void print(Object object) {
        System.out.print(object + " ");
    }
}
