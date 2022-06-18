package a;

import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.printf("Enter a integer number: ");
        num = input.nextInt();
        if (num % 2 == 0)
            System.out.println("The number " + num + " este even.");
        else
            System.out.println("Numarul " + num + " este odd");
    }
}