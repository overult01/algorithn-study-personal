package _2array._0206_teacher;

import java.util.ArrayList;
import java.util.Scanner;

// 뒤집은 소수 (선생님 풀이)
// 221120

public class Main {
    // 메서드 - 소수 판별
    public boolean isPrime(int num){
        if (num == 1) return false;
        for (int i = 2; i < num; i++){ // 2부터 자기자신-1까지 수에서 약수가 있으면 소수가 아님
            if (num % i == 0) return false;
        }

        // 위의 for문에서 약수가 없다는 건 소수라는 것
        return true;
    }

    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();

        // 배열의 숫자를 한 개씩 꺼내기
        for (int i = 0; i < n; i++){
            int temp = arr[i];

            // 1. 숫자 뒤집기
            int res = 0;
            while (temp > 0){
                int t = temp % 10; // 일의 자리 수 구하기
                res = res * 10 + t; // 방금 일의 자리수로 구한 t를 한 자리수씩 앞으로 이동(어차피 맨 앞에 t가 0이면 res계산 결과도 0이므로 무시가 된다)
                temp = temp / 10; // temp에 담긴 수를 한 자리씩 자르기 (temp가 0 보다 작아지기 전 멈춤)
            }

            // 2. 소수 판별
            if (isPrime(res)) answer.add(res);
        }

        return answer;
    }

    public static void main(String[] args){

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i ++){
            arr[i] = kb.nextInt();
        }
        // 소수인 수들만 출력
        for (int x : T.solution(n, arr)){
            System.out.print(x + " ");
        }
  }
}