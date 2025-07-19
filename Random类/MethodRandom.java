import java.util.Random;

public class MethodRandom { // Random 类

    public static void main(String[] args) {

        Random random = new Random(); // 不加参数，以时间戳为种子
        Random seedRandom = new Random(123); // 以123为种子生成随机数

        // 生成整数
        int intRandom1 = random.nextInt(); // 生成所有范围的整数
        int intRandom2 = random.nextInt(100); // 生成[0, 100)范围的整数
        int intRandom3 = random.nextInt(1, 100); // 生成指定范围的整数
        System.out.println(intRandom1 + " " + intRandom2 + " " + intRandom3);

    }

}
