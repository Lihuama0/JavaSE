package democmp;

import java.util.Comparator;

public class AgeCmp implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.age - o2.age; // 从小到大排序
        //return o2.age - o1.age // 从大到小排序
    } // 重写compare方法比较年龄
}
