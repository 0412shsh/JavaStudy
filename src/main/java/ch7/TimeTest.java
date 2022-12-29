package ch7;

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time(12,35,40);
        System.out.println(t);
        // t.hour = 13; 변수 hour의 접근제어자가 private 으로 에러
        t.setHour(t.getHour()+1);
        System.out.println(t);
    }
}

