package JavaInput.java;
import java.util.Scanner;
public class squareofanumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x=sc.nextInt();
        int s = x*x;
        System.out.println("The square of "+ x +" is: "+s);
    }
}
