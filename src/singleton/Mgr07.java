package singleton;


/**
 * 静态内部类 jvm保证线程安全
 */
public class Mgr07 {
    private Mgr07() {
    }

    private static class Mgr07Holder {
        private static final Mgr07 INSTANCE = new Mgr07();
    }

    private static Mgr07 getInstance() {
        return Mgr07Holder.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Mgr07.getInstance().hashCode());
            }).start();
        }
    }
}
