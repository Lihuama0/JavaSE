package demoClone;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException { // 2.main方法声明异常
        Person person1 = new Person(1);
        Person person2 = (Person) person1.clone(); // 3.调用重写方法时需强转类型
        System.out.println(person1.m.money);
        System.out.println(person2.m.money);
        System.out.println("====================");

        person2.m.money = 99.9;

        System.out.println(person1.m.money); // 99.9
        System.out.println(person2.m.money); // 99.9

    }
}
