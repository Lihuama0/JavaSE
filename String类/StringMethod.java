public class StringMethod {

    public static void main(String[] args) { // 数组的常用方法

        String str1 = new String("Hello");
        String str2 = new String("Hello");
        String str3 = new String("World");
        String str4 = str1;

        // 比较引用地址: ==
        System.out.println(str1 == str2);
        System.out.println(str1 == str4);
        System.out.println("============================================================");

        // 比较字符串内容，返回布尔类型：str1.equals(str2)
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str4));
        System.out.println("============================================================");

        // 比较内容，返回整型: str1.compareTo(str2)
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareTo(str3));
        System.out.println("============================================================");

        // 比较内容，忽略大小写，返回整型：str1.compareToIgnoreCase(str2)
        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str1.compareToIgnoreCase(str3));
        System.out.println("============================================================");
    }
}
