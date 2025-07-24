import java.util.Comparator;

// 1.泛型类语法
// 2.泛型类继承语法
// 3.泛型类的上界
// 4.泛型方法语法
// 5.通配符上下界
class MyArray<T> { // 泛型类语法

    Object[] arr = new Object[5];

    public void setArr(int pos, T val) {
        this.arr[pos] = val;
    }

    public T getArr(int pos) {
        return (T) arr[pos];
    }

}

class StringMyArray extends MyArray<String>{ // 继承时尖括号内需要填写
    @Override // 由于参数列表不相同，此类中 setArr 方法未覆盖父类，因此编译器会在 StringMyArray 类中生成桥接方法
    public void setArr(int pos, String val) {
        super.setArr(pos, val);
    }
}

class MyArray2<E extends Comparator<E>> {
    // 使用 extends 规定泛型的上届，即传入类型的边界
    // 例如，E必须实现的了 Comparator 接口
}

class util { // 泛型方法语法
    public static <T> void swap(T[] arr, int i, int j) { // 在返回类型前加上 <T>
        T tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}

public class GenericClass {
    public static void main(String[] args) {

        MyArray<Integer> myArray = new MyArray<>(); // 泛型类的实例化
        myArray.setArr(1, 2);
        int ret = myArray.getArr(5);
        System.out.println(ret);

        util.swap(new Integer[]{1, 2, 3}, 1, 2); // 传入的必须为包装类型


    }
}

class Food {}
class Fruit extends Food{}

class Apple extends Fruit {}

class Banana extends Fruit {}

class Plate<T> { // 设置泛型

    private T data ;
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
}

class TestDemo { // 通配符上届，下届同理
    public static void main(String[] args) {
        Plate<Apple> plate = new Plate<>();
        plate.setData(new Apple());
        fun(plate); // 只能传入 Fruit 及其子类
        Plate<Banana> plate2 = new Plate<>();
        plate2.setData(new Banana());
        fun(plate2);
    }

    public static void fun(Plate<? extends Fruit> temp){
        // 此时⽆法在fun函数中对temp进⾏添加元素，因为temp接收的是Fruit和他的⼦类，此时存储的元素应该是哪个⼦类⽆法确定。所以添加会报错！
        // temp.setData(new Banana()); error
        // temp.setData(new Apple()); error
        System.out.println(temp.getData());
    }
}