package demoClassInner;

interface Greeting {
    void greet();
}

public class OuterClassAnonymous {
    public static void main(String[] args) {

        Greeting greeting = new Greeting() { // 匿名内部类在声明时完成实例化，且只使用一次

            public static int a = 10; // 内部类的静态变量

            @Override
            public void greet() {
                System.out.println("hello");
            }
        }; // 声明最后要加;
    }
}
