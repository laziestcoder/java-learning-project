package mainpackage;

public class ConstructorDemoTwo {
    public static void main(String[] args) {
        MyClassTwo t1 = new MyClassTwo(10);
        MyClassTwo t2 = new MyClassTwo(20);
        System.out.println(t1.x + " " + t2.x);
    }
}
