import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day11_HourGlass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
       Integer max_sum = Integer.MIN_VALUE;
        int sum=0;

        for (int m=0;m<4;m++){
            int temp =0;
            while(temp<4){
                for(int p=m;p<=m+2;p++){
                     for(int n=temp;n<=temp+2;n++){
                         if((p==m+1 && n==temp) || (p==m+1 && n==temp+2))
                             continue;
                         else
                             sum += arr[p][n];
                }
            }
                if(sum>max_sum)
                    max_sum = sum;
                temp++;
                sum=0;
        }
        }  
        System.out.println(max_sum);
    }
}

