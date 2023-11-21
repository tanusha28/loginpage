import java.util.Scanner;

public class spynum{
    public static void main(String[] args) {
        int number, product = 1, sum = 0, D;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        number = sc.nextInt();

        int originalNumber = number; 

        while (number > 0) {
            D = number % 10;
            sum += D;
            product *= D;
            number = number / 10;
        }

        if (sum == product) {
            System.out.println("The given number " + originalNumber + " is a spy number.");
        } else {
            System.out.println("The given number " + originalNumber + " is not a spy number.");
        }

        sc.close();
    }
}

