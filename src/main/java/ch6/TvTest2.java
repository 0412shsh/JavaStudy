package ch6;

class Tv1{
    //Tv의 속성
    String color; //색상
    boolean power; //전원상태
    int channel; //채널

    //Tv의 기능(메서드)
    void power (){ power =!power;}
    void channelUp(){++channel;}
    void channelDown(){--channel;}

}

public class TvTest2 {
    public static void main(String[] args) {
        Tv1 t1 = new Tv1();
        Tv1 t2 = new Tv1();
        System.out.println("t1의 채널값은 "+t1.channel+"번 입니다. ");
        System.out.println("t2의 채널값은 "+t2.channel+"번 입니다. ");

        t1.channel=9; // t1의 채널을 9번으로 한다. !! 인스턴스는 참조 변수를 통해서 다룰수 있다. !!
        System.out.println("t1의 채널값을"+t1.channel+"번으로 변경했습니다.");

        System.out.println("t1의 채널값은 "+t1.channel+"번 입니다. ");
        System.out.println("t2의 채널값은 "+t2.channel+"번 입니다. ");
    }
}
