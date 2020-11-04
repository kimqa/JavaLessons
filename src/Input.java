import java.util.Scanner;

public class Input {

    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("введите значение");
        String s1 = s.nextLine();
        System.out.println("вы ввели " + s1);
    }
}
