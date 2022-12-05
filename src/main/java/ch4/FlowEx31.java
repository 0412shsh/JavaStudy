package ch4;

public class FlowEx31 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10 ; i++) {
            if(i%3 == 0) // i가 3의 배수이면
                continue; //while문 끝으로 이동하여 다음 반복 실행 !!!
                System.out.println(i); // i가 3의 배수가 아닐 경우 i 출력

             //while문 끝

        }
    }
}
