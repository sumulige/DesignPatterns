/**
 * Copyright (C), 2015-2021, 中信银行有限公司
 * FileName: VehicleFactory
 * Author:   willem
 * Date:     2021/5/14 11:23 上午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package factorymethod.simplefactory;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 * 简单工厂 扩展不好
 *
 * @author willem
 * @create 2021/5/14
 * @since 1.0.0
 */
public class VehicleFactory {

    public Car createCar() {
        return new Car();
    }

    public Plane createPlane() {
        return new Plane();
    }


}
