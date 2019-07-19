import java.util.Calendar;

/**
 * @author ybd
 * @date 19-7-19
 * @contact yangbingdong1994@gmail.com
 *
 * <p>
 * (a) Elvis wears size 0 belt.
 * (b) Elvis wears size 89 belt.
 * (c) Elvis wears size -1930 belt.
 * (d) 以上答案都不对
 */
public class Trap006_Elvis {
    public static final Trap006_Elvis INSTANCE = new Trap006_Elvis();

    private final int beltSize;

    private static final int CURRENT_YEAR =
            Calendar.getInstance().get(Calendar.YEAR);

    private Trap006_Elvis() {
        beltSize = CURRENT_YEAR - 1930;
    }

    public int beltSize() {
        return beltSize;
    }

    public static void main(String[] args) {
        System.out.println("Elvis wears size " +
                INSTANCE.beltSize() + " belt.");
    }
}
