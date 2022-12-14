package ch5;

public class ArrayEx3 {
    public static void main(String[] args) {
        int [] arr = new int[5];

        //배열 arr에 1-5를 저장한다.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
            System.out.println("[변경전]");
            System.out.println("arr.length : "+arr.length);

            for (int j = 0; j < arr.length; j++) {
                System.out.println("arr["+j+"]"+arr[j]);
            }

            int [] tmp = new int[arr.length*2];

            //배열 arr에 저장된 값들을 배열 tmp에 복사한다.
            for (int j = 0; j < arr.length; j++) {
                tmp[j] = arr[j];
            }
            arr = tmp; // tmp에 저장된 값을 arr에 저장한다. (주소값)

            System.out.println("[변경후]");
            System.out.println("arr.length : "+arr.length);
            for (int j = 0; j < arr.length; j++) {
                System.out.println("arr["+j+"]"+arr[j]);
            }

        }
    }

