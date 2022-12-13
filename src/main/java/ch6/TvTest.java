package ch6;

class Tv {

        String color; // 색상
        boolean power; // 전원상태 on/off
        int channel;  // 채널

        //Tv의 기능 (메서드)
        void power(){power=!power;} // 전원상태 on/off 기능 하는 메서드
        void channelUp(){ ++channel;} //채널을 높이는 기능
        void channelDown(){--channel;} //채널을 낮추는 기능

}



public class TvTest {
    public static void main(String[] args) {
        Tv t;
        t = new Tv();
        t.channel = 7; // Tv인스턴스의 멤버변수 channel의 값을 7로 한다.
        t.channelDown(); // Tv인스턴스의 메서드 channelDown()을 호출한다.
        System.out.println("현재 채널은 "+t.channel+"번 입니다.");


    }
}
