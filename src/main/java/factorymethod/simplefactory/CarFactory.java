/**
 * Copyright (C), 2015-2021, 中信银行有限公司
 * FileName: CarFactory
 * Author:   willem
 * Date:     2021/5/14 11:26 上午
 * Description: 生产汽车的共产
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package factorymethod.simplefactory;

/**
 * 〈一句话功能简述〉<br>
 * 〈生产汽车的共产〉
 *
 * @author willem
 * @create 2021/5/14
 * @since 1.0.0
 */
public class CarFactory {


    public Car create() {
        System.out.println("创建car成功");

        return new Car();
    }

}
