package ch7;

final class Singleton {
    private static Singleton s = new Singleton(); //접근제어자 private

    private Singleton() {
        System.out.println("싱글톤입니다.");
    }

    // 인스턴스를 생성하지 않고 호출될 수 있어야하므로 static 이어야한다.
    public static Singleton getInstance() {
        if (s == null)
            s = new Singleton();
            return s;
        }

    } // 싱글톤 클래스

    public class SingletonTest {
        public static void main(String[] args) {
            // Singleton s = new Singleton(); 에러!!
            Singleton s = Singleton.getInstance();
        }
    }

