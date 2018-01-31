import java.io.*;
import java.util.*;

public class Day10_Binary_Numbers {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String str = Integer.toBinaryString(n);
		int count=1;
		int max=1;
		int len = str.length();

		for(int i=0;i<len-1;i++){
			if(str.charAt(i)=='1'){
				for(int j=i+1;j<len;j++){
					if(str.charAt(j)=='1')
						count++;
					else
						break;
				}
			}
			if(count>max)
				max=count;
			count=1;


		}

		System.out.println(max==1?1:max);
		sc.close();
	}
}