public class Vehiclesvalue {
    public static void main(String[] args) {
        int[] vehiclesvalue = {110000,90000,50000};
        String[] vehiclesname = {"Toyota","Nissan","Ford"};
        String[] vehiclestype = {"public transportation","commercial","family"};
        for(int i = 0; i < vehiclesvalue.length; i++)
        {
        ValueCalculate valueCalculate = new ValueCalculate(vehiclesvalue[i],vehiclesname[i],vehiclestype[i]);
            System.out.println(valueCalculate.finalvalue());

         }
    }
}
