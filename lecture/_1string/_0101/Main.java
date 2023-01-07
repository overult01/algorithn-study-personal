package lecture._1string;

import java.util.Scanner;

// 230107
public class Main {

    public int solution(String input1, char c){
        int answer = 0;

        // 대소문자 상관없이 비교하기 위해서 둘 다 소문자로 맞춰줌
        input1 = input1.toLowerCase();
        c = Character.toLowerCase(c);

        // toCharArray: String에서 문자 한 개인 char로 분리
        for (char one : input1.toCharArray()){
            if (one == c){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        char c = in.next().charAt(0); // char 형으로 문자 1개만 받음

        Main T = new Main();
        System.out.println(T.solution(input1, c));
    }
}
