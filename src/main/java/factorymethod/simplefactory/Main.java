/**
 * Copyright (C), 2015-2021, 中信银行有限公司
 * FileName: Main
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
public class Main {
    public static void main(String[] args) {

        Moveable moveable = new Broom();

        Moveable moveable1 = new Car();

        moveable.go();
        moveable1.go();

    }
}
