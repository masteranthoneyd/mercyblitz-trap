/**
 * @author ybd
 * @date 19-7-19
 * @contact yangbingdong1994@gmail.com
 *
 * <p>
 * (a) Bleep
 * (b) Blat
 * (c) 程序编译错误
 * (d) 以上都不是
 */
public class Trap004_Bleep {
    String name = "Bleep";

    void setName(String name) {
        this.name = name;
    }

    void backgroundSetName() throws InterruptedException {
        Thread t = new Thread() {
            @Override
            public void run() {
                setName("Blat");
            }
        };
        t.start();
        t.join();
        System.out.println(name);
    }

    public static void main(String[] args) throws InterruptedException {
        new Trap004_Bleep().backgroundSetName();
    }
}
