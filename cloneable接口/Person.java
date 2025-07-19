package demoClone;

public class Person implements Cloneable{ // 4.实现Cloneable接口
    public int id;

    Money m = new Money();

    public Person(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }

    @Override // 1.想使用clone方法，需重写Object类的clone方法
    protected Object clone() throws CloneNotSupportedException {

        // return super.clone(); 浅拷贝

        Person tmp = (Person) super.clone(); // 先新建对象进行浅拷贝
        tmp.m = (Money) this.m.clone(); // 再通过tmp.m 使得 类中对象 进行拷贝
        return tmp; // 深拷贝

    }
}
