
package chapter2.datatypes;
import java.util.Scanner;
public class takinginput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        float c=sc.nextFloat();
        System.out.printf("a+b+c= %.2f",(a+b+c));
    }
}
