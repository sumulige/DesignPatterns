/**
 * Copyright (C), 2015-2021, 中信银行有限公司
 * FileName: Mgr01
 * Author:   willem
 * Date:     2021/5/13 4:07 下午
 * Description: 最关键的一个单例子
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package singleton;

/**
 * 〈一句话功能简述〉<br> 
 * 〈最关键的一个单例子〉
 *
 * @author willem
 * @create 2021/5/13
 * @since 1.0.0
 */
public class Mgr01 {
    private static final Mgr01 INSTACE = new Mgr01();

    private Mgr01(){};

    private static Mgr01 getInstace(){
        return INSTACE;
    }

    public static void main(String[] args) {
        Mgr01 mgr01 = Mgr01.getInstace();
        Mgr01 mgr011 = Mgr01.getInstace();

        System.out.println(mgr01 == mgr011);
    }
}
