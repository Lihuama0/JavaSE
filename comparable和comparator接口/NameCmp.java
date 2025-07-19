package democmp;

import java.util.Comparator;

public class NameCmp implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name); // 调用String类方法
    } // 重写compare方法比较姓名
}
