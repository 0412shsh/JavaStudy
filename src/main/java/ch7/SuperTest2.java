package ch7;

public class SuperTest2 {
    public static void main(String[] args) {
    Child1 c1 = new Child1();
        c1.method();
    }
}
class Parent1 {
    int x= 34;
}

class Child1 extends Parent {
    int x=1;

    void method(){
        System.out.println("x="+x);
        System.out.println("this.x="+this.x);
        System.out.println("super.x="+super.x);
    }
}

