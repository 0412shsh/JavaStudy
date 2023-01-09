package ch7;

public class BindingTest2 {
    public static void main(String[] args) {
        Parent3 p = new Child3();
        Child3 c = new Child3();

        System.out.println("p.x = "+p.x); //100
        p.method(); //parent
        System.out.println("c.x = "+c.x); //100
        c.method(); //parent
    }
}

class Parent3 {
    int x = 100;
    void method(){
        System.out.println("Parent method");
    }
}
class Child3 extends Parent3{}
