import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day09_Recursion {

    static int factorial(int n) {
        // Complete this function
        int num =n;
        int fact=1;
        fact = (num==1?1:(num*factorial(num-1)));
        return fact;
    }

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int result = factorial(n);
    System.out.println(result);
    }
}

