package ch7;

class A1 {
    void autoPlay(I i){
        i.play();
    }
}

interface I {
    public abstract void play(); //추상메서드
}

class B1 implements I {
    @Override
    public void play() {
        System.out.println("play in B1 class");
    }
}
class C1 implements I {
    @Override
    public void play() {
        System.out.println("play in C1 class");
    }
}

public class InterfaceTest2 {
    public static void main(String[] args) {
        A1 a = new A1();
        a.autoPlay(new B1()); //void autoPlay(I i)호출
        a.autoPlay(new C1()); //void autoPlay(I i)호출
    }
}
