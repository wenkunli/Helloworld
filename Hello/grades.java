import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many integers you like to enter");
        int length = scanner.nextInt();
        System.out.println("Please enter the Integer");



        int nums[] = new int[length];
        double sum = 0;
        for(int i = 0;i < nums.length; i++){
            int integer = scanner.nextInt();
            nums[i] = integer;
            sum = sum + integer;
        }

      //  double avg = sum/grade.length;
      //  System.out.println("The average is " + avg);

        int target = 0;
        System.out.println("Please enter the target");
        target = scanner.nextInt();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    System.out.println(nums[i] + " " + nums[j] );
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
        }





}
