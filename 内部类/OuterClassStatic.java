package demoClassInner;

public class OuterClassStatic {

    public int data1; // 数据1
    public static int data2; // 静态数据2

    static class staticInnerClass {
        public void innerMethod() {
            data2 = 1; // 只能访问静态变量data2
        }
    }

    public static void main(String[] args) {
        OuterClassStatic.staticInnerClass staticInnerClass = new staticInnerClass(); // 静态类的创建
        staticInnerClass.innerMethod(); // 静态方法的访问
    }
}
