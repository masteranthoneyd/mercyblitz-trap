import java.lang.reflect.Field;

/**
 * @author ybd
 * @date 19-7-19
 * @contact yangbingdong1994@gmail.com
 *
 * <p>
 * (a) 运行期异常
 * (b) GuangZhou
 * (c) Beijing
 * (d) 以上都不是
 */
public class Trap005_Reflector_Morph01 {
    public static void main(String[] args) throws Exception {
        Field nameField = OneCity.class.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(null, "GuangZhou");
        System.out.println(OneCity.getName());
    }
    static class OneCity {
        private static final String name = "Beijing";
        public static String getName() {
            return name;
        }
    }
}


