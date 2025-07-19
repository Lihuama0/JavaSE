package democmp;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        Student student1 = new Student("JDK", 1);
        Student student2 = new Student("Alan", 3);
        Student student3 = new Student("Bob", 2);

        System.out.println("==========1==========");

        if (student1.compareTo(student2) > 0) { // 调用类中方法比较
            System.out.println("student1.age >= student2.age");
        } else {
            System.out.println("student1.age < student2.age");
        }

        System.out.println("==========2==========");

        Student[] students = new Student[3]; // 创建student类型数组
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        System.out.println(Arrays.toString(students)); // 排序前

        Arrays.sort(students); // 根据类中重写的compareTo方法比较年龄

        NameCmp nameCmpArray = new NameCmp();
        Arrays.sort(students, nameCmpArray); // 根据类中重写的compareTo方法比较姓名

        System.out.println(Arrays.toString(students)); // 排序后

        System.out.println("==========3==========");

        NameCmp nameCmp = new NameCmp(); // 创建姓名比较器
        int ret1 = nameCmp.compare(student1, student2);
        if (ret1 >= 0) { // 用比较器比较姓名
            System.out.println("student1.name >= student2.name");
        } else {
            System.out.println("student1.name < student2.name");
        }

        System.out.println("==========4==========");

        AgeCmp ageCmp = new AgeCmp(); // 创建年龄比较器
        int ret2 = ageCmp.compare(student1, student2);
        if (ret1 >= 0) { // 用比较器比较年龄
            System.out.println("student1.age >= student2.age");
        } else {
            System.out.println("student1.age < student2.age");
        }


    }

}
