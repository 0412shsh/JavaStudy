package ch8;

public class ExceptionEx4 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(4);
        }catch (Exception e){
            System.out.println(5);

        } // try-catch 끝
        System.out.println(6);
    } // main 끝
    // 출력 1 2 3 4 6
}
