package demoClassInner;

public class OuterClassInMethod { // 罕见！！！

    int data1 = 10;

    public void method() { // 外部类的成员方法

        int data2 = 10;

        class InnerClass { // 局部内部类
            public void inMethodClass() { // 局部内部类的方法
                System.out.println(data1);
                System.out.println(data2);
            }
        }

        InnerClass innerClass = new InnerClass(); // 只能再方法内部使用
        innerClass.inMethodClass();

    }

    public static void main(String[] args) {

    }

}
