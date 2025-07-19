public class StringReplace {
    public static void main(String[] args) { // 字符串替换
        String str = "Hello meat";

        // 替换全部字符：str.replaceAll
        System.out.println(str.replaceAll("l", "p"));

        // 替换首个字符：str.replaceFirst
        System.out.println(str.replaceFirst("l", "p"));
    }
}
