package ch8;

public class ExceptionEx1 {
    public static void main(String[] args) {
        try {
            try {} catch (Exception e) {}

       } catch (Exception e) {
            //try {} catch (Exception e) {}  에러! 변수 e가 중복 선언 되었다.
            try {} catch (Exception e2) {}  // catch 블럭 내에 또 다른 try-catch문이 포함된 경우, 같은 이름의 참조변수 사용하면 안된다.
        } // try-catch 끝

        try{

        } catch (Exception e) {

        } // try-catch 끝

    } // main 끝
}
