//Program that prints the Multiplication table for a given number.
import java.util.*;

public class prog4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you want to print the multiplication table : ");
        int num=sc.nextInt();
        int pro;
        for(int i=1;i<=10;i++){
            pro = num * i;
            System.out.println(num + " * " + i +" = " + pro  );
        }
    }
}
