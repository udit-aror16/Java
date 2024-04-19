//Program to sum all odd numbers from 1 to all specified number N.

import java.util.*;

public class prog5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your number : ");
        int num = sc.nextInt();
        int sum = oddSum(num);
        System.out.println("Odd sum till " + num + " is : " + sum);
    }
    public static int oddSum (int num){
        int sum=0;
        int i=1;
        while (i<=num) {
            sum+=i;
            i+=2;
        }
        return sum;
    }
}
