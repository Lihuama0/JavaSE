class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}

public class demoStringTransfer {

    public static void main(String[] args) { // 字符串转换

        // 转换为字符串形式
        String s1 = String.valueOf(1); // 整型转换为字符串：String.valueOf(...)
        String s2 = String.valueOf(1.1); // 浮点转换为字符串：String.valueOf(...)
        String s3 = String.valueOf(true); // 布尔转换为字符串：String.valueOf(...)
        String s4 = String.valueOf(new Student("LiHua", 18)); // 打印类的信息
        System.out.println(s1 + "   " + s2 + "   " + s3 + "   " + s4);
        System.out.println("============================================================");

        // 字符串转为数字：封装类型.parse类型("...") 以此类推
        int a = Integer.parseInt("1"); // 字符串转为整型
        double b = Double.parseDouble("1.1"); // 字符串转为浮点
        System.out.println(a);
        System.out.println(b);
        System.out.println("============================================================");

        // 大小写转换：str.toUpperCase() str.toLowerCase()
        String str1 = "Hello";
        String str2 = "HELLO";

        System.out.println(str1.toUpperCase()); // 小写转大写
        System.out.println(str2.toLowerCase()); // 大写转小写
        System.out.println("============================================================");

        // 字符串转为字符数组：str.toCharArray()
        String str3 = "Hello";
        char[] ch = str3.toCharArray();
        for (char c : ch) {
            System.out.print(c + " ");
        }
        System.out.println();
        System.out.println("============================================================");

        // 字符数组转为字符串：String str = new String(定义好的字符数组变量)
        String str4 = new String(ch);
        System.out.println(str4);
        System.out.println("============================================================");

        // 格式化输出：String.format(" ", ...)
        String str5 = String.format("%d,%d,%d", 2020,1,1);
        System.out.println(str5);
    }
}
