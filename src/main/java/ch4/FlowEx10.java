package ch4;

import java.util.Scanner;

public class FlowEx10 {

    public static void main(String[] args) {
        int score = 0;
        char grade =' ';

        System.out.println("당신의 점수를 입력하세요. (0-100) > ");

        Scanner sc = new Scanner(System.in);
        String tmp = sc.nextLine(); // 화면을 통해 입력 받은 내용을 tmp에 저장
        score = Integer.parseInt(tmp); // 입력받은 문자열 (tmp) 를 숫자로 변환

        switch (score/10){ //10으로 나눠 몫으로 점수대 판별
            case 10: case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade ='C';
                break;
            default:
                grade = 'F';
        }
        System.out.println("당신의 학점은 "+grade+" 입니다.");
    }
}
