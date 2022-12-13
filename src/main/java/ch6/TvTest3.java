package ch6;

class Tv2{
    //Tv의 속성
    String color; //색상
    boolean power; //전원상태
    int channel; //채널

    //Tv의 기능(메서드)
    void power (){ power =!power;}
    void channelUp(){++channel;}
    void channelDown(){--channel;}

}
public class TvTest3 {
    public static void main(String[] args) {
        Tv2 t1 = new Tv2();
        Tv2 t2 = new Tv2();
        System.out.println("t1의 채널값은 "+t1.channel+"번 입니다. ");
        System.out.println("t2의 채널값은 "+t2.channel+"번 입니다. ");

        t2 = t1; // t1이 저장하고 있는 주소값을 t2에 저장한다.
        t1.channel=7;
        System.out.println("t1의 채널값을 7로 변경했습니다.");

        System.out.println("t1의 채널값은 "+t1.channel+"번 입니다. ");
        System.out.println("t2의 채널값은 "+t2.channel+"번 입니다. ");
    }
}
