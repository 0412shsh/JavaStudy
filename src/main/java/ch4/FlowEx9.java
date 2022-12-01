package ch4;

import java.util.Scanner;

public class FlowEx9 {
    public static void main(String[] args) {
        char grade = ' '; //등급 초기화
        System.out.println("당신의 점수를 입력하시오. (0~100) ");

        Scanner sc = new Scanner(System.in);
        int score= sc.nextInt(); //입력받은 숫자를 score에 저장

        switch(score) { // switch 조건식
            case 100: case 99: case 98: case 97: case 96:
            case 95: case 94: case 93: case 92: case 91: case 90:
                grade ='A';
                break;
            case 89: case 88: case 87: case 86:
            case 85: case 84: case 83: case 82: case 81: case 80:
                grade = 'B';
                break;
            case 79: case 78: case 77: case 76:
            case 75: case 74: case 73: case 72: case 71: case 70:
                grade ='C';
                break;
            default :
                grade ='F';

        }

        System.out.println(grade);

    }
}
