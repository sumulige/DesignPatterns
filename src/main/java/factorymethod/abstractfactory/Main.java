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
package factorymethod.abstractfactory;

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

        AbstractFactory f = new ModenFactory();
        Vehicle c = f.createVehicle();
        c.go();

        Car car = new Car();

        car.go();

        Bread bread = new Bread();
        bread.eat();

        AK47 ak47 = new AK47();
        ak47.shot();


    }
}
