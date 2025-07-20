import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class AboutBigDecimal {

    public static void main(String[] args) { // BigDecimal类 用于进行高精度浮点计算

        BigDecimal num1 = new BigDecimal("6.66"); // 用String类进行初始化

        BigDecimal num2 = new BigDecimal("3.34");

        // BigDecimal类的加减乘，运算后会生成新的BigDecimal对象
        BigDecimal add = num1.add(num2);
        BigDecimal sub = num1.subtract(num2);
        BigDecimal mul = num1.multiply(num2);
        System.out.println(add + " " + sub + " " + mul);

        // 通过 指定精度和舍入模式 实现除法
        BigDecimal div1 = num1.divide(num2, 3, RoundingMode.HALF_UP); // 保留小数点后 3 位，四舍五入（默认）
        System.out.println(div1);

        // 通过 MathContext 实现除法
        BigDecimal div2 = num1.divide(num2, new MathContext(4));
        System.out.println(div2);
    }

}
