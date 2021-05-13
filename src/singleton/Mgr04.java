package singleton;

public class Mgr04 {
    private static Mgr04 INSTANCE;

    private Mgr04() {
    }

    //多个线程执行这个方法
    //线程安全必须加锁
    public static synchronized Mgr04 getInstance() {

        //这里线程不安全
        if (INSTANCE == null) {
            try {
                //睡一秒增加打断的机会
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr04();
        }

        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                //哈希码不同就不是同一个对象
                System.out.println(Mgr04.getInstance().hashCode());
            }).start();
        }
    }
}
