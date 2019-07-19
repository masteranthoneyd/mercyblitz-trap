/**
 * @author ybd
 * @date 19-7-19
 * @contact yangbingdong1994@gmail.com
 *
 * <p>
 * (a) true
 * (b) false
 * (c) 编译错误
 * (d) 以上答案都不对
 */
public class Trap009_Lazy {

    private static boolean initialized = false;

    static {
        Thread t = new Thread(() -> initialized = true);
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            throw new AssertionError(e);
        }
    }

    public static void main(String[] args) {
        System.out.println(initialized);
    }
}
