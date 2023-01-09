package ch7;

class Product2 {
    int price;
    int bonusPoint; 
    
    Product2(int price){
        this.price = price;
        this.bonusPoint = (int)(price/10.0);
    }
    
    Product2(){} // 기본생성자

} //Product2


class TV2 extends Product2 {
    TV2(){super(100);} // TV 가격 설정
    public String toString(){return "TV";}
} // TV2


class Computer2 extends Product2 {
    Computer2(){super(200);} // Computer 가격 설정
    public String toString(){return "Computer";}
} // Computer2


class Audio2 extends Product2 {
    Audio2(){super(200);} // Audio 가격 설정
    public String toString(){return "Audio";}
} // Audio2


class Buyer2 {
    int money = 1000;
    int bonusPoint = 0;
    Product2 [] item = new Product2[10]; // 구입한 제품을 저장하기 위한 배열
    int i = 0; //Product2 배열에 사용될 카운터

    void buy(Product2 p) {
        if(money < p.price) {
            System.out.println("잔액 부족 살 수 없습니다.");
            return;
        }
            money -= p.price; // 가진 돈 = 가진 돈 - 물건가격
            bonusPoint += bonusPoint+p.bonusPoint;
            item[i++] = p; // 제품을 배열에 저장한다.
            System.out.println(p+"를 구입하셨습니다.");

    }

    void summery(){
        int sum = 0;
        String itemList = "";

        for (int i = 0; i < item.length; i++) {
            if(item[i] == null) break;
            sum += item[i].price;
            itemList += item[i]+","; // 아이템을 리스트값에 추가한다.
        }
        System.out.println("구매하신 물품의 총 금액은 : " + sum + "만원입니다.");
        System.out.println("구매하신 제품은 "+ itemList + "입니다.");

    }

} //Buyer2



public class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer2 b = new Buyer2();

        b.buy(new TV2());
        b.buy(new Computer2());
        b.buy(new Audio2());
        b.summery();
    }
}
