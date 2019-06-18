import java.util.Scanner;

public class Helloworld {
    public static void main (String[] args)
    {
        System.out.println("Hello");
        System.out.println("Please enter the type of product received");
        Scanner scanner1 = new Scanner(System.in);
        String producttype = scanner1.nextLine();
        System.out.println("Please enter the cost to us for each");
        Scanner scanner2 = new Scanner(System.in);
        Integer cost = scanner2.nextInt();

        System.out.println("Please enter the Brand Name");
        Scanner scanner3 = new Scanner(System.in);
        String brandname = scanner3.nextLine();
        System.out.println("Please enter the Number in shipment");
        Scanner scanner4 = new Scanner(System.in);
        Integer numberinshipment = scanner4.nextInt();
        System.out.println("Shipment Summary");
        System.out.println("The new product is  " + producttype);
        System.out.println("This shipment included  " + numberinshipment + "  from  " + brandname );
        System.out.println("The total Value of the shipment was   " + cost*numberinshipment);
       // int intger =Integer.parseInt(cost * numberinshipment);
        System.out.println("Total cost including GST is  "+ Math.round(cost*numberinshipment*1.05f) );


    }
}
