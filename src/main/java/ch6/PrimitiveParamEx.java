package ch6;

class Data {int x;}

public class PrimitiveParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : "+d.x); // 10

        change(d.x); // static 메서드 실행
        System.out.println("After change(d.x)");
        System.out.println("main() : "+d.x); // 10

    }

    static void change(int x) { //기본형 매개변수를 복사해와서
        x = 1000;  // 1000으로 초기화
        System.out.println("chang() : "+x); // 출력
    }
}
