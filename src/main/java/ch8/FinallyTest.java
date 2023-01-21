package ch8;

public class FinallyTest {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFile();
            deleteTempFile();
        } catch (Exception e) {
            e.printStackTrace();
            deleteTempFile();
        } // try-catch 끝
    } // main 끝

    static void startInstall(){
//        프로그램 설치에 필요한 준비를 하는 코드를 적는다
    }
    static void copyFile(){
        // 파일을 복사하는 코드를 적는다.
    }
    static void deleteTempFile() {
        // 임시파일들을 삭제하는 코드를 적는다.
    }
}
