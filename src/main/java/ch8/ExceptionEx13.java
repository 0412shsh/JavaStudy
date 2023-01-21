package ch8;

public class ExceptionEx13 {
    public static void main(String[] args) {
        method1(); // 같은 클래스의 static멤버이므로 객체생성없이 호출 가능
    }

    static void method1(){
        try {
            throw new Exception(); // 예외 발생
        } catch (Exception e) { // 예외 처리
            System.out.println("method1의 예외가 처리되었습니다.");
            e.printStackTrace();
        }
    }
}
