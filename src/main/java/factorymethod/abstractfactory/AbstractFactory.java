/**
 * Copyright (C), 2015-2021, 中信银行有限公司
 * FileName: AbstractFactory
 * Author:   willem
 * Date:     2021/5/14 11:56 上午
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package factorymethod.abstractfactory;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 * Waepon
 * Food
 * Vehicle
 *
 * @author willem
 * @create 2021/5/14
 * @since 1.0.0
 */
public abstract class AbstractFactory {

    abstract Food createFood();

    abstract Vehicle createVehicle();

    abstract Weapon createWeapon();
}
