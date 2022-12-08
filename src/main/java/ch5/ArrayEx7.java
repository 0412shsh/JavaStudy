package ch5;

public class ArrayEx7 {
    public static void main(String[] args) {
        int [] numArr = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i; // 배열을 0부터 ~ 9의 값으로 초기화한다.
            System.out.println(numArr[i]);
        }
        System.out.println();
        for (int i = 0; i < 100; i++) {
            int n = (int)(Math.random()*10); //0-9중의 한 값을 넣는다.
            int tmp = numArr[0];
            numArr[0]=numArr[n];
            numArr[n]=tmp; // numArr[0]과 numArr[n] 의 값을 바꾼다.
        }
        for (int i = 0; i < numArr.length; i++) {
            System.out.println(numArr[i]);
        }
    }
}
