package ch7;

class Product {
    int price;
    int bonusPoint;

    Product(int price){
        this.price = price;
        this.bonusPoint = (int)(price/10.0); // 보너스 점수는 가격의 10%
    }
} // Product

class TV extends Product {
    TV(){
        super(100); // 조상 클래스의 생성자 Product(int price) 호출한다.
    } // TV

    //Object 클래스의 toString()을 오버라이딩한다.
    public String toString(){return "TV"; }

} // Product


class Computer extends Product {
  Computer(){super(200);}
    public String toString(){return "Computer";}
}

class Buyer {
    int money = 1000; //가진돈
    int bonusPoint = 0; //보너스포인트

    void buy(Product p){
       if(money < p.price){
           System.out.println("잔액이 부족하여 물건을 살 수 없습니다. ");
           return;
       }
       money -= p.price;
       bonusPoint += p.bonusPoint;
        System.out.println(p+"를 구입하셨습니다.");
    }

} // Buyer

public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new TV());
        b.buy(new Computer());

        System.out.println("현재 남은 돈은 "+b.money+"원 입니다.");
        System.out.println("현재 보너스 점수는 "+b.bonusPoint+"원 입니다.");

    }
}
