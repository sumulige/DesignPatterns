/**
 * Copyright (C), 2015-2021, 中信银行有限公司
 * FileName: MagicFactory
 * Author:   willem
 * Date:     2021/5/14 12:13 下午
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
public class MagicFactory extends AbstractFactory {

    @Override
    Food createFood() {
        return new MushRoom();
    }

    @Override
    Vehicle createVehicle() {
        return new Broom();
    }

    @Override
    Weapon createWeapon() {
        return new MagickStick();
    }
}
