package singleton;

/**
 * 不仅解决了线程同步问题 反而解决了反序列化
 */

//枚举类没有构造方法所以解决了反序列化
public enum Mgr08 {
    INSTANCE;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Mgr08.INSTANCE.hashCode());
            }).start();
        }
    }
}
