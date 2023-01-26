package ch9;

final class Card1 {
    String kind;
    int num;

    Card1(){ // 생성자
        this("SPADE",1);
    }

    Card1(String kind, int num) { // 생성자 오버로딩
        this.kind = kind;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Card1{" +
                "kind='" + kind + '\'' +
                ", num=" + num +
                '}';
    }
}
public class ClassEx1 {
    public static void main(String[] args) throws Exception {
        Card1 c = new Card1("HEART",3); // new연산자로 객체 생성
        Card1 c2 = Card1.class.newInstance(); // Class 객체를 통해서 객체 생성

        Class cObj = c.getClass();

        System.out.println(c);
        System.out.println(c2);
        System.out.println(cObj.getName());
        System.out.println(cObj.toGenericString());
        System.out.println(cObj.toString());
    }
}
