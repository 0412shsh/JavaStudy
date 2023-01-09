package ch7;

public class BindingTest {
    public static void main(String[] args) {
        Parent2 p = new Child2(); // 부모타입의 참조변수는 자식인스턴스 참조 중
        Child2 c = new Child2(); // 자식타입의 참조변수는 자식인스턴스 참조 중

        System.out.println("p.x = "+p.x); // 100
        p.method(); // Child
        System.out.println("c.x ="+c.x); // 200
        c.method(); // Child
    }
}
class Parent2 {
    int x = 100;
    void method(){
        System.out.println("Parent method");
    }
}
class Child2 extends Parent2{
    int x = 200;

    void method(){
        System.out.println("Child method");
    }
}
