package singleton;

public class Mgr05 {
    private static Mgr05 INSTANCE;

    private Mgr05() {
    }

    //多个线程执行这个方法
    public static Mgr05 getInstance() {

        //这里线程不安全
        if (INSTANCE == null) {
            //锁加这里并不能保证线程安全
            synchronized (Mgr05.class) {
                try {
                    //睡一秒增加打断的机会
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            INSTANCE = new Mgr05();
        }

        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                //哈希码不同就不是同一个对象
                System.out.println(Mgr05.getInstance().hashCode());
            }).start();
        }
    }
}
