package JavaInput.java;
import java.sql.SQLOutput;
import java.util.Scanner;
public class findremaindersecondmethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dividend: ");
        int a=sc.nextInt();
        System.out.println("Enter the divisor: ");
        int b=sc.nextInt();
        int R=a%b;
        System.out.println("The remainder when "+a + "is divided by" + b + "is: "+R);
    }
}
