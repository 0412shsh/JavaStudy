package ch9;

import java.security.cert.PolicyNode;

class Circle implements Cloneable {
    Poin p; // 원점
    double r; // 반지름

    Circle(Poin p, double r) {
        this.p = p;
        this.r = r;
    }

    public Circle shallowCopy(){ // 얇은 복사
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {}
        return (Circle)obj;
    }

    public Circle deepCopy(){ // 깊은 복사
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {}
        Circle c = (Circle)obj;
        c.p = new Poin(this.p.x, this.p.y);
        return c;

    }

    @Override
    public String toString() {
        return "Circle{" +
                "p=" + p +
                ", r=" + r +
                '}';
    }
}

class Poin {
    int x,y;

    Poin(int x, int y) { // 생성자, 변수 초기화
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "Poin{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

public class ShallowDeepCopy {
    public static void main(String[] args) {
        Circle c1 = new Circle(new Poin(1,1),2.0);
        Circle c2 = c1.shallowCopy();
        Circle c3 = c1.deepCopy();

        System.out.println("c1 = "+c1);
        System.out.println("c2 = "+c2);
        System.out.println("c3 = "+c3);

        c1.p.x = 9;
        c1.p.y = 9;

        System.out.println("= c1의 변경후 =");
        System.out.println("c1 = "+c1);
        System.out.println("c2 = "+c2);
        System.out.println("c3 = "+c3);

    }
}
