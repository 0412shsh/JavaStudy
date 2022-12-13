package ch6;

class Tv3{
    //Tv의 속성
    String color; //색상
    boolean power; //전원상태
    int channel; //채널

    //Tv의 기능(메서드)
    void power (){ power =!power;}
    void channelUp(){++channel;}
    void channelDown(){--channel;}

}
public class TvTest4 {
    public static void main(String[] args) {
        Tv3[] tvArr = new Tv3[3]; // 길이가 3인 Tv객체 배열

        //Tv객체(new Tv3())를 생성해서 Tv객체 배열의 각 요소에 저장
        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i]=new Tv3();
            tvArr[i].channel= 10+i;
        }

        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i].channelUp();
            System.out.println("tvArr["+i+"].channel="+tvArr[i].channel);

        }
    }
}
