package ch9;

class Card {
    String kind;
    int number;

    Card(){
        this("SPADE",1);
    }
    Card(String kind, int number){
        this.kind = kind;
        this.number = number;
    }
}
public class CardToString {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();

        System.out.println(c1.toString());
        System.out.println(c2.toString()); // Object 클래스로부터 상속받은 toString을 오버라이딩하지 않았기 때문에 클래스이름과 해시코드가 출력됨
    }
}
