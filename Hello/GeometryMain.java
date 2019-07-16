import java.sql.SQLOutput;
import java.util.Scanner;

public class GeometryMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many");
        int number = scanner.nextInt();
        String[] name = new String[number];
        double[] radius = new double[number];
        double[] height = new double[number];
        Circle circle;
        for(int i = 0; i < number; i++){

            name[i] = scanner.next();
            radius[i] = scanner.nextInt();
            height[i] = scanner.nextInt();
            if(height.equals(0)){
                circle = new Circle(name[i],radius[i]);
                System.out.println(circle.getName());
                System.out.println(circle.printArea());
                System.out.println(circle.printCircumference());
            }else {
                circle = new Circle(name[i],radius[i],height[i]);
                System.out.println(circle.getName());
                System.out.println(circle.printArea());
                System.out.println(circle.printCircumference());
                System.out.println(circle.printVolume());
            }

        }





    }
}
