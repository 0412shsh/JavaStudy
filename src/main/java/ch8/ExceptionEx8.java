package ch8;

public class ExceptionEx8 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try{
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
            System.out.println("예외 메세지 : "+ae.getMessage());
        } // try-catch
        System.out.println(6);
        //실행 1 2 3 메서드정보&예외메시지 예외메세지 6
    }
}
