/**
 * Copyright (C), 2015-2021, 中信银行有限公司
 * FileName: ModenFactory
 * Author:   willem
 * Date:     2021/5/14 12:11 下午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package factorymethod.abstractfactory;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author willem
 * @create 2021/5/14
 * @since 1.0.0
 */
public class ModenFactory extends AbstractFactory {

    @Override
    Food createFood() {
        return new Bread();
    }

    @Override
    Vehicle createVehicle() {
        return new Car();
    }

    @Override
    Weapon createWeapon() {
        return new AK47();
    }
}
