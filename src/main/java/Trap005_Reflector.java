import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author ybd
 * @date 19-7-19
 * @contact yangbingdong1994@gmail.com
 *
 * <p>
 * (a) 运行期异常
 * (b) true
 * (c) 程序编译错误
 * (d) 以上都不是
 */
public class Trap005_Reflector {
    public static void main(String[] args) throws Exception {
        Set s = new HashSet();
        s.add("foo");
        Iterator i = s.iterator();
        Method m = i.getClass().getMethod("hasNext", new Class[0]);
        System.out.println(m.invoke(i, new Object[0]));
    }
}
