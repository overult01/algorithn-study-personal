package _2array._0202;

import java.util.Scanner;

// 221107
// 보이는 학생 
// 539ms
// 40MB

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input1 = in.nextLine();
        String input2 = in.nextLine();
        String[] arr_input2 = input2.split(" ");

        int result = 1; // 맨 처음 학생 포함

        int temp = Integer.parseInt(arr_input2[0]);

        // 어떻게 하면 앞의 사람보다 더 멀쩡히 이겨야 하는 환경때문 이었을 지도.
        for ( int i = 1; i < arr_input2.length; i ++){
            if(temp < Integer.parseInt(arr_input2[i])) {
                temp = Integer.parseInt(arr_input2[i]);
                result += 1;
            }
        }

        System.out.println(result);
    }
}