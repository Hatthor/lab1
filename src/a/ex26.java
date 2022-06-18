package a;

import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        System.out.printf("Enter a: ");
        a = input.nextInt();
        System.out.printf("Enter b: ");
        b = input.nextInt();
        if (a % b == 0)
            System.out.println("The number " + a + " is multiple.");
        else
            System.out.println("The number " + a + " is not multiple.");

    }
}