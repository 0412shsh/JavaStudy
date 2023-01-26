package ch9;

import javax.print.PrintService;

class Person{
    long id;

    public boolean equals(Object obj){ // Person인스턴스의 주소값이 아닌 멤버변수 id값을 비교하도록 하기위해 equals 메서드를 오버라이딩 했다.
        if (obj instanceof Person)
            return id == ((Person)obj).id;
        else return false;
    }
    Person(Long id){
        this.id = id;
    }
}

public class EqualsEx2 {
    public static void main(String[] args) {
    Person p1 = new Person(9090L);
    Person p2 = new Person(9090L);

    if(p1 == p2)
        System.out.println("p1과 p2는 같은 사람입니다.");
    else System.out.println("p1과 p2는 다른 사람입니다.");

    if(p1.equals(p2))
       System.out.println("p1과 p2는 같은 사람입니다.");
    else System.out.println("p1과 p2는 다른 사람입니다."); // 이로써 다른 인스턴스라고할지라도 같은 id를 가지고 있을때 true의 결과를 얻을 수 있다.


    }
}
