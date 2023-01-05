package _2array._0207;

import java.util.Scanner;

// 221122
// 점수계산

public class Main {

  public int solution(int n, String input2) {

    String[] arrStr = input2.split(" ");
    int[] arr = new int[n];

    // 결과 담을 정수 배열
    for(int i = 0; i < n; i++){
      arr[i] = Integer.parseInt(arrStr[i]);
    }

    if (arrStr[0].equals(1)) {
      arr[0] = 1;
    }

    for (int i = 1; i < n; i++) {
      // 0이 아닌 경우에만
      if (arr[i] != 0){
        arr[i] = arr[i-1] + 1;
      }
      else {
        arr[i] = 0;
      }
    }

    int result = 0;
    for (int i = 0; i < n; i++) {
      result += arr[i];
    }

    return result;
  }
  public static int main(String[] args){
    Scanner in=new Scanner(System.in);
    String input1 = in.nextLine();
    int n = Integer.parseInt(input1);
    String input2 = in.nextLine();

    Main T = new Main();
    return T.solution(n, input2);
  }
}