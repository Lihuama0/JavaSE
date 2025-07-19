public class SubStringAndTrim {
    public static void main(String[] args) { // 字符串的截取和去除空格
        String str1 = "hello meat";

        // 从指定索引截取到结尾：str.substring(index)
        System.out.println(str1.substring(5));

        // 截取指定索引范围内内容：str.substring(index, index)
        System.out.println(str1.substring(5, 8));
        System.out.println("============================================================");

        String str2 = "  hello world";

        //去除两边的空格：str.trim()
        System.out.println(str2);
        System.out.println(str2.trim());
    }
}
