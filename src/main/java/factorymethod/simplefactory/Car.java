/**
 * Copyright (C), 2015-2021, 中信银行有限公司
 * FileName: Car
 * Author:   willem
 * Date:     2021/5/14 10:59 上午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package factorymethod.simplefactory;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author willem
 * @create 2021/5/14
 * @since 1.0.0
 */
public class Car implements Moveable {
    public void go() {
        System.out.println("可以走了");
    }
}
