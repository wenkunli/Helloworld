public class Student {
    public static void main(String[] args) {
        int[] studentheight = {100,120};
        StudentCalculate studentCalculate = new StudentCalculate(studentheight);
        System.out.println(studentCalculate.averageheight());

       // studentCalculate.average();
    }
}
