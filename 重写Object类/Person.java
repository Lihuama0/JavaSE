package demoObject;

import java.util.Objects;

public class Person {

    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() { // 重写toString方法 打印对象信息
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) { // 重写equals方法 比较对象内容是否相同
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() { // 重写hashCode方法 如果对象一样，那么值一样
        return Objects.hash(name, age);
    }
}
