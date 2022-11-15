package _2array._0203;

import java.util.Scanner;

// 221109
// 가위바위
// 168ms
// 27MB

public class Main {  
    public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String input1 = in.nextLine();
    String input2 = in.nextLine();
    String input3 = in.nextLine();

    String arrA[] = input2.split(" ");
    String arrB[] = input3.split(" ");

//    StringBuffer result = new StringBuffer();

    for(int i = 0; i < arrA.length; i++){
        if(arrA[i].equals("1") && arrB[i].equals("3")){        
           System.out.println("A");
        }
        else if(arrA[i].equals("3") && arrB[i].equals("1")){
           System.out.println("B");
        }
        else{            
            if(Integer.parseInt(arrA[i])>Integer.parseInt(arrB[i])){
             System.out.println("A");         
            }
            else if(Integer.parseInt(arrA[i])<Integer.parseInt(arrB[i])){
             System.out.println("B");         
            }
            else{
                System.out.println("D");
            }
        }
    }
    }
}
