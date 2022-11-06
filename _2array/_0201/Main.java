package _2array._0201;

// 221106
// 큰 수 출력하기
// 풀이 소요시간: 30분
// 159ms
// 27MB

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input1 = in.nextLine();
        String input2 = in.nextLine();

        // 문자.spilt(" ") 가 공백으로 문자 구분
        String[] input2_arr = input2.split(" ");

        StringBuffer result = new StringBuffer();
        result.append(input2_arr[0]);

        for (int i = 1; i < input2_arr.length; i++) {
            if (Integer.parseInt(input2_arr[i-1]) < Integer.parseInt(input2_arr[i])) { // 본인이 직전 수보다 크면
                result.append(" " + Integer.parseInt(input2_arr[i]));
            }
        }

        System.out.println(result);
    }
}