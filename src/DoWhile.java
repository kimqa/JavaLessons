import java.util.Scanner;

public class DoWhile {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        do {
            System.out.print("ENTER :");
            value=scanner.nextInt();
        } while (value != 5);


        while (value!=5) {
            System.out.println("Enter your value");
            value  = scanner.nextInt();
        }
        System.out.println("value = 5");
    }
}
