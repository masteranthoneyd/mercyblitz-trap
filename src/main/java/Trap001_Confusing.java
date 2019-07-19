/**
 * @author ybd
 * @date 19-7-19
 * @contact yangbingdong1994@gmail.com
 *
 * <p>
 * (a) Object
 * (b) double array
 * (c) 以上都不是
 * <p>
 *
 * Most Specific 原则:
 * https://docs.oracle.com/javase/specs/jls/se8/html/jls-15.html#jls-15.12.2.5
 */
public class Trap001_Confusing {
    public Trap001_Confusing(Object o) {
        System.out.println("Object");
    }

    public Trap001_Confusing(double[] dArray) {
        System.out.println("double array");
    }

    public static void main(String args[]) {
        new Trap001_Confusing(null);
    }
}
