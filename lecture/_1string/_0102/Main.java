package lecture._1string._0102;

import java.util.Scanner;

// 230107
public class Main {
    public String solution(String input){
        StringBuffer result = new StringBuffer();

        for (char c : input.toCharArray()){
            if (Character.isLowerCase(c)){
                result.append(Character.toUpperCase(c));
            }
            else{
                result.append(Character.toLowerCase(c));
            }
        }

        return result.toString();
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input = in.next();
        Main T = new Main();

        System.out.println(T.solution(input));
        return ;
    }
}
