package democmp;

public class Student implements Comparable<Student>{

    public String name; // 成员变量：姓名
    public int age; // 成员变量：年龄

    public Student(String name, int age) { // 构造方法
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() { // 重写toString方法
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) { // 通过Comparable接口比较年龄
        return this.age - o.age;
    }

}
