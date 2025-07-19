package demoObject;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("小明", 10);
        Person person2 = new Person("小明", 10);

        // 调用重写的toString方法
        System.out.println(person1);

        // 调用重写的equals方法
        System.out.println(person1.equals(person2));

        // 调用重写的hashcode方法
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }
}
