public class ValueCalculate {
    private int vehiclesvalue;
    private String vehiclesname;
    private String vehiclestype;
    private double finalvalue;

    public ValueCalculate(int vehiclesvalue, String vehiclesname, String vehiclestype) {
        this.vehiclesvalue = vehiclesvalue;
        this.vehiclesname = vehiclesname;
        this.vehiclestype = vehiclestype;
    }
    public double finalvalue(){
       double GTS;
       if(vehiclesvalue > 100000 && vehiclestype.toString() == "public transportation"){
           GTS = 0.1;
       }else if(vehiclesvalue < 100000 && vehiclesvalue > 50000 && vehiclestype.toString() == "public transportation"){
           GTS = 0.08;
       }else{
           if(vehiclesvalue > 100000 && vehiclestype.toString() != "public transportation"){
               GTS = 0.2;
       } else{
               GTS = 0.16;
           }
       }

       double additionalcost = 0;
    if(vehiclesvalue > 80000 && vehiclestype.toString() != "public transportation"){
        additionalcost = vehiclesvalue*0.05;
    }
        double additionaldiscount = 0;
    if(vehiclesvalue < 80000 ){
        additionaldiscount = vehiclesvalue*0.05;
    }
        return finalvalue = vehiclesvalue + vehiclesvalue * GTS + additionalcost - additionaldiscount;
    }
}
