public class StringSpilt {
    public static void main(String[] args) { // 字符串拆分

        String str = "Hello World Hello meat";

        // 将字符串全部以空格拆分：str.split("...")，用字符串数组接受
        String[] srr1 = str.split(" ");
        for (String s : srr1) {
            System.out.println(s);
        }
        System.out.println("============================================================");

        // 将字符串以空格拆分 2 次
        String[] srr2 = str.split(" ", 2);
        for (String s : srr2) {
            System.out.println(s);
        }
        System.out.println("============================================================");

        // . | * + ,  ==> 都需要\\转义才能拆分
        String str2 = "name=ZhangSan&age=18";
        String[] srr3 = str2.split("=|&");
        for (String s : srr3) {
            System.out.println(s);
        }
    }
}
