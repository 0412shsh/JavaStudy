package ch7;

public class PointTest2 {
    public static void main(String[] args) {
    Point3D2 p3 = new Point3D2();
        System.out.println("p3.x="+p3.x);
        System.out.println("p3.y="+p3.y);
        System.out.println("p3.z="+p3.z);
    }
}

class Point2 {
    int x= 10;
    int y= 20;

    public Point2(int x, int y) {
        // 생성자 첫 줄에서 다른 생성자를 호출하지 않기 때문에 컴파일러가 super(); 를 자동으로 삽입한다.
        // 부모 클래스는 Object 클래스
        this.x = x;
        this.y = y;
    }
}

class Point3D2 extends Point2{
    int z = 30;

    //생성자
    Point3D2(){
        this(100,200,300);
    }
    //오버로딩
    Point3D2(int x, int y, int z){
        super(x,y); //Point2(int x, int y)를 호출한다.
        this.z =z;
    }

}