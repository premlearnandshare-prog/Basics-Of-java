package BasicsOfLoop;

import java.util.Scanner;

public class printevennumberhundredtotwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        // method 1
        // even number
        for (int i = n; i >= 2; i-=2) {
            System.out.println(i);
        }
    }
}
