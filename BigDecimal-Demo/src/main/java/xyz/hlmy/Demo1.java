package xyz.hlmy;

import java.math.BigDecimal;

/**
 * @ProjectName: hodgepodge
 * @ClassName: Demo1
 * @Author: Hlmy
 * @Description:
 * @Date: 2023/02/14 9:25
 */
public class Demo1 {
    public static void main(String[] args) {

        BigDecimal bigDecimal = new BigDecimal(123);

        BigDecimal string = new BigDecimal("123.123");

        //精准度不对
        BigDecimal doubles = new BigDecimal(123.123);


        System.out.println(doubles);
        /*
         * BigDecimal  bigDecimal = new  BigDecimal(xxx)；其中，xxx可以是整型数据，也可以是数字内容的字符串数据，但不可以是浮点型
         *
         * */
    }


}
