import java.lang.reflect.Field;
import java.util.IdentityHashMap;
import java.util.Map;

/**
 * @author ybd
 * @date 2019/8/13
 * @contact yangbingdong1994@gmail.com
 */
public class Trap011_NumberCache {

    public static void main(String[] args) throws Exception {
        trap1();

        trap2();

        trap3();
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

    private static void trap3() throws Exception {
        Integer a = Integer.parseInt("10");
        Integer b = Integer.valueOf(10);
        Integer c = 10;
        changeValue(a, 100);
        changeValue(b, 200);
        changeValue(c, 300);

        System.out.printf("%d %d %d", a, b, c);
    }

    private static void changeValue(Integer i, int value) throws Exception {
        Field field = Integer.class.getDeclaredField("value");
        field.setAccessible(true);
        field.set(i, value);
    }
}
