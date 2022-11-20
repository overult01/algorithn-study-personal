package _2array._0206;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// 221120
// 뒤집은 소수
// 실패(뒤집는 부분에서 실패)

public class Main{

  public String solution(int n, String input2) {

    // 결과 담을 Buffer
    StringBuffer resultBuffer = new StringBuffer();
    String[] origin = input2.split(" ");

    int rev = 0;

    for (int i = 0; i < n; i++) {
      // 1. 뒤집는다
      rev = reverse(origin[i]);

      // 2. 소수 여부 판별
      if(eratos(rev)){ // 소수가 맞으면
        resultBuffer.append(rev + " ");
      }
    }

    return resultBuffer.toString();
  }

    // 2. 메서드 - 에라토스테네스의 체
    public Boolean eratos(int n){

    // 소수 여부
      Boolean result = true;

      // 2부터 n까지의 모든 배수 걸러내기
      for(int i = 2; i <= (n/2 + 1); i++){
        if (n % i == 0){
          result = false;
        }
      }
      if (n == 2){
        result = true;
      }
      return result;
    }

  // 1. 메서드 - 뒤집는다(아마 앞의 0제거도 가능할듯)
  public int reverse(String x) {

    System.out.println("reverse origin = " + x);

    // 자릿수대로 분할
    String[] spt = x.split("");
    String resultStr = "";
    for (int i = spt.length-1; i <=0; i--){
      resultStr += spt[i]; // 거꾸로 뒤집은 값
      System.out.println(spt[i]);
    }
//
//    // 뒤집은 값을 저장할 리스트(순서o) 생성
//    List<Integer> list = new ArrayList<Integer>();
//    int num = 0;
//    for (int i = 1; i <= Integer.parseInt(x); i = i * 10) {
//      // 몫
//      num = Integer.parseInt(x) / i;
//      list.add(num);
//    }
//
//    StringBuffer resultBuffer = new StringBuffer();
//    for (int i = list.size()-1; i >= 0; i -- ) {
//      System.out.println(list.get(i));
//      resultBuffer.append(list.get(i));
//    }
//
//    String resultStr = resultBuffer.toString();
//
    System.out.println("reverse => " + resultStr);
    return Integer.parseInt(resultStr);
  }

  public static void main(String []args){
    Main T = new Main();

    Scanner in = new Scanner(System.in);
    String input1 = in.nextLine();

    // 입력받은 개수
    int n = Integer.parseInt(input1);

    // 입력받은 배열
    String input2 = in.nextLine();

    System.out.println(T.solution(n, input2));
  }
}