package ch7;

public class BindingTest3 {
    public static void main(String[] args) {
        Parent4 p = new Child4();
        Child4 c = new Child4();

        System.out.println("p.x = "+p.x);   // 100
        p.method(); // 200, 100, 200
        System.out.println();
        System.out.println("c.x = "+c.x); // 200
        c.method(); // 200, 100, 200

    }
}
class Parent4 {
    int x = 100;

    void method(){
        System.out.println("Parent Method");
    } // method
} //Parent4 클래스

class Child4 extends Parent4 {
    int x = 200;

    void method(){
        System.out.println("x= "+x);
        System.out.println("super.x = "+super.x);
        System.out.println("this.x = "+this.x);
    } //method
} // Child4 클래스

