package a;

import java.util.Scanner;

public class ex30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[5];

        System.out.print("Enter a 5 digit number: ");
        int x = input.nextInt();

        for (int i = 4; i >= 0; --i) {
            num[i] = x % 10;
            x /= 10;
        }

        for (int i : num) {
            System.out.printf("%d   ", i);
        }
        System.out.println();
    }
}