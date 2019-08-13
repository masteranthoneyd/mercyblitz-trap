import java.util.Random;

/**
 * @author ybd
 * @date 2019/8/13
 * @contact yangbingdong1994@gmail.com
 *
 * <p>
 * 以上程序输出内容是？
 *
 * (a) 运行时异常
 * (b) 3
 * (c) 1.0
 * (d) 以上答案都不是
 */
public class Trap010_Hamlet {
    public static void main(String[] args) {
        Random rnd = new Random();
        boolean toBe = rnd.nextBoolean();
        Number result = (toBe || !toBe) ?
                new Integer(3) : new Float(1);
        System.out.println(result);
    }
}
