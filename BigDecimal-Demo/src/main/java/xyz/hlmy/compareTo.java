package xyz.hlmy;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @ProjectName: hodgepodge
 * @ClassName: compareTo
 * @Author: Hlmy
 * @Description: 属性一
 * @Date: 2023/02/14 9:32
 */
public class compareTo {

    public static void main(String[] args) {
        BigDecimal one = new BigDecimal("4");

        BigDecimal two = new BigDecimal("2");
        //add 加
        BigDecimal add = one.add(two);
        //subtract 减
        BigDecimal subtract = two.subtract(one);
        //multiple 乘
        BigDecimal multiple = one.multiply(two);
        //除
        BigDecimal divides = one.divide(two);

        BigDecimal scale = divides.setScale(4, RoundingMode.UP);

        System.out.println("加" + add + "   乘" + multiple + " 减" + subtract + "   除并四舍五入" + scale);
    }
}
