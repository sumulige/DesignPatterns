package singleton;

/**
 * 保证线程安全 是一种追求完美的写法
 *
 * @date 20210513 09：33
 */
public class Mgr06 {

    private static volatile Mgr06 INSTANCE;

    private Mgr06() {
    }

    //多个线程执行这个方法
    public static Mgr06 getInstance() {

        //这里线程不安全
        if (INSTANCE == null) {
            //锁加这里并不能保证线程安全
            synchronized (Mgr06.class) {
                //双重判断
                if (INSTANCE == null) {
                    try {
                        //睡一秒增加打断的机会
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            INSTANCE = new Mgr06();
        }

        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                //哈希码不同就不是同一个对象
                System.out.println(Mgr06.getInstance().hashCode());
            }).start();
        }
    }
}
