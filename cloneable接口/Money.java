package demoClone;

public class Money {
    public double money = 9.9;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
