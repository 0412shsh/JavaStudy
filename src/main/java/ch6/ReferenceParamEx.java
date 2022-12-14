package ch6;
class Data1 {int x;}

public class ReferenceParamEx {
    public static void main(String[] args) {
    Data1 d = new Data1(); // 인스턴스 생성
    d.x = 10; // 10 초기화
        System.out.println("main() : x = "+d.x); // 10

    change(d); //change()의 매개변수가 참조형이라 값이 저장된 주소값을 넘겨줌
        System.out.println("after change(d)");
        System.out.println("main() : x = "+d.x); //change()에서 값을 1000으로 바꿈

    }
    static void change(Data1 d){ //참조형 매개변수
        d.x = 1000; //d의 주소로 찾아가서 x의 값을 1000으로 초기화
        System.out.println("change() : x = "+d.x); // 1000
    }
}
