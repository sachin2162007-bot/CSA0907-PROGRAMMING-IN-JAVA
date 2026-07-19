
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Then given number is Even" + num);
        } else {
            System.out.println("Then given number is Odd" +num);
        }

        sc.close();
    }
}