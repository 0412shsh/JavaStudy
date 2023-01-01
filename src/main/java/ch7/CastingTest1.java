package ch7;

public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe2; // car=(Car)fe2; 에서 형변환 생략
        //car.water(); Car타입의 참주변수로는 water()를 호출할수 없다.
        fe2 = (FireEngine) car; // 자손타입←부모타입
        fe2.water();

    }
}

class Car {
    String color;
    int door;

    void drive(){ // 운전하는 기능
        System.out.println("drive, 부르릉~ ");
    }

    void stop (){ // 멈추는 기능
        System.out.println("stop, 스탑!!!! ");
    }
}

class FireEngine extends Car { // 소방차
    void water (){ // 물을 뿌리는 기능
        System.out.println("water!!! ");
    }
}

