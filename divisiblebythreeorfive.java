package conditionals;

import java.util.Scanner;

public class divisiblebythreeorfive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        if ((num % 3 == 0) || (num % 5 == 0)) {
            System.out.println("The number is divisible by either 3 or 5 ");
        } else {
            System.out.println("The number is not divisible by 3 or 5");
        }
    }
}

