public class StringBuild {

    public static void main(String[] args) { //数组的创建

        // 1.直接创建
        String str1 = "abc";
        System.out.println(str1);

        // 2.新建对象创建
        String str2 = new String("abc");
        System.out.println(str2);

        // 3.通过字符数组创建
        char[] crr = new char[]{'a', 'b', 'c'};
        String str3 = new String(crr);
        System.out.println(str3);

        // 4.通过字符数组创建
        byte[] brr = new byte[]{97 ,98 ,99};
        String str4 = new String(brr);
        System.out.println(str4);

    }

}