import java.util.HashSet;
import java.util.Set;

/**
 * @author ybd
 * @date 19-7-19
 * @contact yangbingdong1994@gmail.com
 *
 * <p>
 * (a) true
 * (b) false
 * (c) 程序编译错误
 * (d) 以上都不是
 */
public class Trap003_Name {
    private String first, last;

    public Trap003_Name(String first, String last) {
        if (first == null || last == null)
            throw new NullPointerException();
        this.first = first;
        this.last = last;
    }

    public boolean equals(Trap003_Name o) {
        return first.equals(o.first) && last.equals(o.last);
    }

    public int hashCode() {
        return 31 * first.hashCode() + last.hashCode();
    }

    public static void main(String[] args) {
        Set s = new HashSet();
        s.add(new Trap003_Name("Mickey", "Mouse"));
        System.out.println(s.contains(new Trap003_Name("Mickey", "Mouse")));
    }
}
