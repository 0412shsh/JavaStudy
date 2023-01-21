package ch8;

public class FinallyTest2 {
    public static void main(String[] args) {
        try {
            startInstasll();
            copyFile();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            deleteTempFile();
        } // try-catch-finally 끝
    } // main 끝
    static void startInstasll(){}
    static void copyFile(){}
    static void deleteTempFile(){}
}
