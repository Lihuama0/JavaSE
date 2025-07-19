package demoClassInner;

public class OuterClassVoid {

    public int data1;
    public static  int data2;
    public int data3;

    class InnerClass {
        int data3;
        public void innerMethod() {
            int data1 = 1; // 实例内部类可以直接访问外部类变量
            int data2 = 2;

            int data3 = 3; // 如果内外部类中具有相同名称的变量时，优先访问内部类

            System.out.println(OuterClassVoid.this.data1); // 如果就想访问外部类变量，就需要 外部类名.this.变量名
        }
    }

    public static void main(String[] args) {
        OuterClassVoid outerClassVoid = new OuterClassVoid();
        // 外部类的对象创建和访问
        System.out.println(outerClassVoid.data1);
        System.out.println(OuterClassVoid.data2);
        System.out.println(outerClassVoid.data3);

        // 内部类的对象创建和访问，记得先创建外部类对象！！！
        OuterClassVoid.InnerClass innerClass = outerClassVoid.new InnerClass();
        innerClass.innerMethod();

    }
}
