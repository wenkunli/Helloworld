import java.util.Scanner;

public class Integer {
    public static void main(String[] args) {

        System.out.println("Please enter the Integer");
        Scanner scanner = new Scanner(System.in);
        int integer = scanner.nextInt();
        // int number = Integer.parseInt(integer);
        System.out.println(Math.round(integer / 2));
        int integertest = integer++;
        System.out.println(Math.round(integer / 2) == Math.round(integertest / 2));
    }
}
