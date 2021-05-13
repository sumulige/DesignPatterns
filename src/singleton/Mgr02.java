/**
 * Copyright (C), 2015-2021, 中信银行有限公司
 * FileName: Mgr02
 * Author:   willem
 * Date:     2021/5/13 4:16 下午
 * Description: 懒汉式
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package singleton;

/**
 * 〈一句话功能简述〉<br> 
 * 〈饿汉式〉
 *  静态代码块 本质上还是第一种
 * @author willem
 * @create 2021/5/13
 * @since 1.0.0
 */
public class Mgr02 {

    private static final Mgr02 INSTANCE;

    static Mgr02{
        INSTANCE  = new Mgr02();
    }

    private static Mgr02 getInstance(){

        return INSTANCE;
    }


}

