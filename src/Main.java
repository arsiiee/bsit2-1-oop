import java.util.Scanner;

public class inputNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0; 

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = input.nextInt();
            total += number;
        }

        // display total
        System.out.println("\nTotal Number: " + total);

        input.close();
    }
}
