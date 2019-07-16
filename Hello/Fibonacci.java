import java.util.Scanner;

public class Fibonacci {
    public static void main (String[] args) {
        System.out.println("Please enter the Integer");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int a=0;
        int b=1;
        int c=0;
        int count=0;
        System.out.println(0);
        System.out.println(1);
        while(count<number-2){
            count++;
            a=b+c;
            c=b;
            b=a;
            System.out.println(a);
        }

    }
}
