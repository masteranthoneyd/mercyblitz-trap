/**
 * @author ybd
 * @date 19-7-19
 * @contact yangbingdong1994@gmail.com
 *
 * <p>
 * (a) 5
 * (b) 1000
 * (c) 抛出异常
 * (d) 以上答案都不对
 */
public class Trap007_LongDivision {

    private static final long MILLIS_PER_DAY
            = 24 * 60 * 60 * 1000;

    private static final long MICROS_PER_DAY
            = 24 * 60 * 60 * 1000 * 1000;

    public static void main(String[] args) {
        System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);
    }
}
