package ch7;

public class PointTest {
    public static void main(String[] args) {
    Point3D1 p3 = new Point3D1(1,2,3);

    }
}

class Point1 {
    int x, y;

    Point1(int x, int y){
        this.x = x; // 포인트를 직접 설정해줄 수 있다.
        this.y = y;
    }

    public Point1() {

    }

    String getLoacation(){
        return "x : "+x+", y : "+y;
    }
}

class Point3D1 extends Point1 {
    int z;

    //생성자
    Point3D1(int x, int y, int z) {
        super();
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    String getLoacation() {
        return "x : "+x+", y : "+y+", z: "+z;
    }
}

