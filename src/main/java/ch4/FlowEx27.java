package ch4;

import java.util.Scanner;

public class FlowEx27 {

    public static void main(String[] args) {
        int num;
        int sum = 0;
        boolean flag = true; //while문의 조건식으로 사용될 변수
        Scanner sc = new Scanner(System.in);

        System.out.println("합계를 구할 수자를 입력하세요(끝내려면 0입력) ");

        while(flag) {
            System.out.println(">>");

            String tmp = sc.nextLine();
            num = Integer.parseInt(tmp);

            if (num != 0) {
                sum += num; // num이 0아니면, sum에 더한다.
            } else {
                flag = false; // num이 0이면, flag의 값을 false로 변경             }
            }
        }
        System.out.println("합계 : "+sum);
    }
}
