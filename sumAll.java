import java.util.Scanner;

public class sumAll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = input.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        System.out.println("Sum of numbers from 1 to " + num + " is: " + sum);
    }
}
