package ch7;

public class DefaultMethodTest {
    public static void main(String[] args) {
        Child5 c = new Child5();
        c.method1();    // "method1() in Child"
        c.method2();    // "method2() in Parent1"
        MyInterface.staticMethod(); // "staticMethod() in MyInterface"
        MyInterface2.staticMethod(); // "staticMethod() in MyInterface2"
    }
}

class Child5 extends Parent5 implements MyInterface,MyInterface2{
    public void method1(){
        System.out.println("method1() in Child"); // 오버라이딩
    }
}

class Parent5 {
    public void method2(){
        System.out.println("method2() in Parent1");
    }
}

interface MyInterface {
    default void method1(){
        System.out.println("method1() in MyInterface");
    }
    default void method2(){
        System.out.println("method2() in MyInterface");
    }
    static void staticMethod(){
        System.out.println("staticMethod() in MyInterface");
    }
}

interface MyInterface2 {
    default void method1(){
        System.out.println("method() in MyInterface2");
    }
    static void staticMethod(){
        System.out.println("staticMethod() in MyInterface2");
    }
}