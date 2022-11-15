package _2array._0204;

import java.util.*;
// 피보나치 수열
// 221115
// 풀이시간: 30(배열, 리스트 때문에)
// 151ms
// 27MB

public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String input = in.nextLine();
    int n = Integer.parseInt(input);

    // 배열
    int[] result = new int[n];

    result[0] = 1;
    result[1] = 1;

    System.out.print("1 1");

    for (int i = 2; i < n; i++){
      result[i] = result[i-2] + result[i-1];
      System.out.print(" " + result[i]);
    }
    return;
    // 오답
//    LinkedList<Integer> arr = new ArrayList<Integer>();
//    arr.add(1);
//    arr.add(1);
//
//    System.out.print("1 1");
//    for (int i = 2; i < n; i++){
//      arr.add(arr.indexOf(i-2)+arr.indexOf(i-1));
//      System.out.print(" " + arr.indexOf(i));
//    }
  }
}