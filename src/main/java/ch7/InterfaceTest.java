package ch7;

class A{
    public void methodA(B b){
        b.methodB(); // 클래스 B의 인스턴스를 생성하고 메서드 호출한다.
    }
}

class B {
    public void methodB(){
        System.out.println("methodB()");
    }
}
public class InterfaceTest {
    public static void main(String[] args) {
        A a = new A();
        a.methodA(new B());
    }
}
