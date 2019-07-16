import java.util.Scanner;

public class Sumnumbers {
    public static void main (String[] args)
    {
        System.out.println("Please enter the Integer");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i;
        int result=0;
        for(i=0;i<=number;i++){
            result+=i;
        }
        System.out.println(result);
    }
}
