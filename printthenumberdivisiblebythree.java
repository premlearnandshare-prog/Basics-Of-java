package BasicsOfLoop;

import java.util.Scanner;

public class printthenumberdivisiblebythree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            if(i%3==0) {
                System.out.println(i);
            }
        }
    }
}
