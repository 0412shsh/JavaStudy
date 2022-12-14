package ch6;

public class ReferenceParamEx2 {
    public static void main(String[] args) {
        int[] x = {10}; // 크기가 1인 배열. x[0]=10;
        System.out.println("main() : x ="+x[0]); // 10

        change(x); //change메서드 실행
        System.out.println("After change(x)");
        System.out.println("main() : x ="+x[0]); //change메서드 실행후 같은 위치를 참조하고 있어 1000으로 출력

    }
    static void change(int[] x) { //배열의 참조변수 주소값을 가져옴
        x[0] = 1000; // 주소값에 들어 있는 변수에 1000을 저장
        System.out.println("change() : x = "+x[0]); // 1000
    }
}
