package _2array._0205;

import java.util.Scanner;

// 소수(에라토스테네스 체)
// 221115 #2
// 풀이시간: 실패

public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String input1 = in.nextLine();
    int n = Integer.parseInt(input1);

    // 2, 3, 5, 7로 떨어지는 수(나머지가 0) 모두 거르기

    int result = 0;
    for (int i = 0; i < n; i++) {
      int temp = i;

      while(temp < 2){
       temp = temp / 2;
       if (temp == 2){
         result += 1;
         continue;
       }

       while(temp < 3){
         temp = temp / 3;
         if (temp == 2){
           result += 1;
           continue;
         }

      }
    }



        // 오답
//    int result = 0;
//    for (int i = 2; i <= n; i ++){
//      if (i == 2 || i == 3 ||  i == 5 || i == 7) {
//        result += 1;
//      }
//      else if( i % 2 != 0){
//        if ( i % 3 != 0) {
//          if ( i % 5 != 0) {
//            if ( i % 7 != 0) {
//              result += 1;
//            }
//          }
//        }
//      }

    System.out.println(result);
    return ;

    // 에라토스테네스의 체
//    2부터 소수를 구하고자 하는 구간의 모든 수를 나열한다. 그림에서 회색 사각형으로 두른 수들이 여기에 해당한다.
//    2는 소수이므로 오른쪽에 2를 쓴다. (빨간색)
//            자기 자신을 제외한 2의 배수를 모두 지운다.
//    남아있는 수 가운데 3은 소수이므로 오른쪽에 3을 쓴다. (초록색)
//            자기 자신을 제외한 3의 배수를 모두 지운다.
//    남아있는 수 가운데 5는 소수이므로 오른쪽에 5를 쓴다. (파란색)
//            자기 자신을 제외한 5의 배수를 모두 지운다.
//    남아있는 수 가운데 7은 소수이므로 오른쪽에 7을 쓴다. (노란색)
//            자기 자신을 제외한 7의 배수를 모두 지운다.
//    소수들의 배수들을 다 지운다.
//    위의 과정을 반복하면 구하는 구간의 모든 소수가 남는다.

  }
}