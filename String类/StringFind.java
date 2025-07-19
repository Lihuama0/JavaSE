public class StringFind {

    public static void main(String[] args) { // 字符串查找：str.charAt str.indexOf str.lastIndexOf

        String str = "hello meat ooo";

        // 1 查找指定索引的字符
        System.out.println(str.charAt(4));

        System.out.println("============================================================");

        // 2.1 查找第一次出现指定字符的下标
        System.out.println(str.indexOf('o'));

        // 2.2 从指定索引开始，查找出现指定字符的下标
        System.out.println(str.indexOf('a', 6));

        // 2.3 查找第一次出现指定字符串的第一个元素的下标位置
        System.out.println(str.indexOf("ooo"));

        // 2.4从指定索引开始，查找出现指定字符串的第一个元素的下标位置
        System.out.println(str.indexOf("ooo", 10));

        System.out.println("============================================================");

        // 3.1 从后往前找第一次出现指定字符的下标
        System.out.println(str.lastIndexOf('t'));

        // 3.2 从指定索引开始，从后往前找第一次出现指定字符的下标
        System.out.println(str.lastIndexOf('t', 10));

        // 3.3 从后往前找第一次出现指定字符串的下标
        System.out.println(str.lastIndexOf("ooo"));

        // 3.4 从指定索引开始，从后往前找第一次出现指定字符串的下标
        System.out.println(str.lastIndexOf("ooo", 10));

    }
}
