public class StringIntern {
    public static void main(String[] args) { // intern 方法

        char[] ch = new char[]{'a', 'b', 'c'};
        String str1 = new String(ch);

        str1.intern(); // 调用此方法后，将str1对象的引用放入字符串常量池中

        String str2 = "abc"; // “abc” 在字符串常量池中已经存在，str2创建时之间使用"abc"的引用

        System.out.println(str1 == str2); // 返回true,若没有调用上述方法则返回false

    }
}
