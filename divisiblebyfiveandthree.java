package conditionals;

import java.util.Scanner;

public class divisiblebyfiveandthree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        //if (num % 15== 0) <-- it is also true
        if ((num % 3==0) && (num % 5 == 0)) {
            System.out.println("The number is divisible by 3 and 5 ");
        }
        else {
            System.out.println("The number is not divisible by 3 and 5");
        }
        // && --> logical and
        // || --> logical or

    }
}
