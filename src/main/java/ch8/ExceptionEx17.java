package ch8;

public class ExceptionEx17 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e){
            System.out.println("main에서 예외 처리 되었습니다.");
        }
    } // main 끝
    static void method1() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1에서 예외 처리 되었습니다.");
            throw e;
        }
    }
}
