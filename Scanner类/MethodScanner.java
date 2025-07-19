import java.util.Scanner;

public class MethodScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int intScanner = scanner.nextInt(); // 读取下个整数
        double doubleScanner = scanner.nextDouble(); // 读取下个双精度浮点数
        String stringScanner1 = scanner.next(); // 读取下个单词！
        String stringScanner2 = scanner.nextLine(); // 读取下个句子

        while (scanner.hasNext()) { // 实现循环输入
            String name = scanner.next();
            if (name.equalsIgnoreCase("quit")) {
                break;
            }
        }

        scanner.close(); // 释放资源
    }

}
