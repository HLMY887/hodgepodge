package xyz.hlmy;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Optional;

/**
 * @ProjectName: hodgepodge
 * @ClassName: Strategy
 * @Author: Hlmy
 * @Description: 策略
 * @Date: 2023/02/14 9:46
 */
public class Strategy {
    public static void main(String[] args) {
        CEILING();
        FLOOR();
        UP();
        HALF_UP();
        DOWN();
        HALF_DOWN();
        HALF_EVEN();
        UNNECESSARY();
    }

    /**
     * ROUND_CEILING：无论后面是多少(后面是0的话除外)，在正常值下，往大变
     */
    static void CEILING() {
        BigDecimal bigDecimal1 = new BigDecimal("1.22");
        BigDecimal bigDecimal2 = new BigDecimal("-1.22");
        BigDecimal bigDecimal = bigDecimal1.setScale(1, RoundingMode.CEILING);
        BigDecimal bigDecimal3 = bigDecimal2.setScale(1, BigDecimal.ROUND_CEILING);
        System.out.println(bigDecimal + " CEILING" + bigDecimal3);
    }

    /**
     * ROUND_FLOOR：无论后面是多少(后面是0的话除外)，在正常值下，往小变
     */
    static void FLOOR() {
        BigDecimal bigDecimal1 = new BigDecimal("1.22");
        BigDecimal bigDecimal2 = new BigDecimal("-1.22");
        BigDecimal bigDecimal = bigDecimal1.setScale(1, RoundingMode.FLOOR);
        BigDecimal bigDecimal3 = bigDecimal2.setScale(1, BigDecimal.ROUND_FLOOR);
        System.out.println(bigDecimal + " FLOOR" + bigDecimal3);
    }

    /**
     * ROUND_UP：无论后面是多少(后面是0的话除外)，在绝对值的角度，往大变
     */
    static void UP() {
        BigDecimal bigDecimal1 = new BigDecimal("1.22");
        BigDecimal bigDecimal2 = new BigDecimal("-1.22");
        BigDecimal bigDecimal = bigDecimal1.setScale(1, RoundingMode.UP);
        BigDecimal bigDecimal3 = bigDecimal2.setScale(1, BigDecimal.ROUND_UP);
        System.out.println(bigDecimal + " UP" + bigDecimal3);
    }

    /**
     * ROUND_DOWN：无论后面是多少，都直接丢弃
     */
    static void DOWN() {
        BigDecimal bigDecimal1 = new BigDecimal("1.22");
        BigDecimal bigDecimal2 = new BigDecimal("-1.22");
        BigDecimal bigDecimal = bigDecimal1.setScale(1, RoundingMode.DOWN);
        BigDecimal bigDecimal3 = bigDecimal2.setScale(1, BigDecimal.ROUND_DOWN);
        System.out.println(bigDecimal + " DOWN" + bigDecimal3);
    }

    /**
     * ROUND_HALF_UP：0-4舍，5-9入，在绝对值的角度，舍和入
     */
    static void HALF_UP() {
        BigDecimal bigDecimal1 = new BigDecimal("1.22");
        BigDecimal bigDecimal2 = new BigDecimal("-1.22");
        BigDecimal bigDecimal = bigDecimal1.setScale(1, RoundingMode.HALF_UP);
        BigDecimal bigDecimal3 = bigDecimal2.setScale(1, BigDecimal.ROUND_HALF_UP);
        System.out.println(bigDecimal + " HALF_UP" + bigDecimal3);
    }

    /**
     * ROUND_HALF_DOWN：0-5舍，6-9入,在绝对值的角度，舍和入
     */
    static void HALF_DOWN() {
        BigDecimal bigDecimal1 = new BigDecimal("1.25");
        BigDecimal bigDecimal2 = new BigDecimal("-1.22");
        BigDecimal bigDecimal = bigDecimal1.setScale(1, RoundingMode.HALF_DOWN);
        BigDecimal bigDecimal3 = bigDecimal2.setScale(1, BigDecimal.ROUND_HALF_DOWN);
        System.out.println(bigDecimal + " HALF_DOWN" + bigDecimal3);
    }

    /**
     * ROUND_HALF_EVEN：0-4舍，6-9入，;在绝对值的角度舍和入如果是5，则结果为偶数的一边
     */
    static void HALF_EVEN() {
        BigDecimal bigDecimal1 = new BigDecimal("1.25");
        BigDecimal bigDecimal2 = new BigDecimal("-1.22");
        BigDecimal bigDecimal = bigDecimal1.setScale(1, RoundingMode.HALF_EVEN);
        BigDecimal bigDecimal3 = bigDecimal2.setScale(1, BigDecimal.ROUND_HALF_EVEN);
        System.out.println(bigDecimal + " HALF_EVEN" + bigDecimal3);
    }

    /**
     * ROUND_UNNECESSARY
     * 断言请求的操作具有精确的结果，因此不需要舍入。如果对获得非精确结果的操作指定此舍入模式，则抛出 ArithmeticException
     */
    static void UNNECESSARY() {
        BigDecimal bigDecimal = new BigDecimal("2").setScale(2, RoundingMode.UNNECESSARY);
        System.out.println(" UNNECESSARY    " + bigDecimal);
    }
}
