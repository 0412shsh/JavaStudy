package ch8;

public class ExceptionEx2 {
    public static void main(String[] args) {
        int num = 100;
        int result = 0;

        for (int i = 0; i < 10; i++) {
            result = num / (int)(Math.random()*10); // 9번째 라인 ,ArithmeticException 발생
            System.out.println(result);
        } //for 끝
    } // main 끝


}
