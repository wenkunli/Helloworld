import java.util.Scanner;

public class Largestnumber {
    public static void main (String[] args)
    {

        System.out.println("Please enter the first Integer");
        Scanner scanner = new Scanner(System.in);
        int firstinteger = scanner.nextInt();
        System.out.println("Please enter the second Integer");
        int secondinteger = scanner.nextInt();
        System.out.println("Please enter the third Integer");
        int thirdinteger = scanner.nextInt();
        if(firstinteger>secondinteger)
        {
            if(firstinteger>thirdinteger)
            {
                System.out.println(firstinteger);
            }
            else
            {
                System.out.println(thirdinteger);
            }

        }
        else
        {
            if(secondinteger>thirdinteger)
            {
                System.out.println(secondinteger);
            }
            else
            {
                System.out.println(thirdinteger);
            }
        }
       /* if((firstinteger>secondinteger)&&(firstinteger>thirdinteger))
        {
            System.out.println(firstinteger);
        }
        else
         {
             System.out.println(thirdinteger);
         }
         */

    }


}
