package ch11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {
    public static void main(String[] args) {
        final int LIMIT = 10; // 자르고자 하는 글자의 개수를 지정한다. 4
        String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
        int length = source.length();

        List list = new ArrayList(length/LIMIT + 10); // 크기를 약간 여유 있게 잡는다.

        for (int i = 0; i < length; i+=LIMIT) { // i = i+LIMIT
            if(i+LIMIT < length){ // i+10 이 소스 길이보다 작을 때
                list.add(source.substring(i,i+LIMIT)); // i부터 LIMIT까지 잘라 list에 추가
            } else
                list.add(source.substring(i)); // 인데스 i부터 뒤에 요소 모두 출력
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    } // main()
}
