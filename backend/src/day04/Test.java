package day04;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int list[ ] = new int[0];
        int menu = 0;
        boolean a = true;
        while(a){
            System.out.print("현재 배열 [크기: " + list.length + "]:");
            if(list.length == 0) { System.out.println("비어있음");}
            else {System.out.println(Arrays.toString(list) ); }
            System.out.println("1.요소 추가| 2. 인덱스로 삭제| 0. 종료");
            menu = scan.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("추가할 정수값: ");
                    int num = scan.nextInt();       // 정수 값 받기
                    int temp[ ] = new int[list.length+1];   // 새로운 배열 
                    if(list.length >= 1){
                        for(int i = 0; i < list.length; i++){
                        temp[i] = list[i];      // 새 배열에 값 옮기기
                        }
                    }
                    temp[temp.length-1] = num;  // 받은 정수 값 넣기
                    list = temp;        // 원래 배열에 다시 넣기
                    break;
                case 2:
                    System.out.print("삭제할 인덱스 번호 0 ~" + (list.length-1) + "를 입력하세요: ");
                    int num2 = scan.nextInt(); // 삭제할 인덱스
                    int temp2[ ] = new int[list.length-1];
                    int l = 0;
                    for(int k = 0; k < list.length-1; k++){
                        
                        if( k != num2 ){
                            temp2[l] = list[k];
                        }
                        
                    }
                    list = temp2;

                    break;

                case 0:
                    a = false;
                    break;
            
                default:
                    break;
            }

        }
        


    
    } // main end
} // class end
