import java.util.Arrays;

public class store {
    public static void main(String[] args) {
        //String[][][] productitems=new String[10][9][9];
        String[][][]productitems = {  { {"0","Guitars","750"}, {"1","Pianos","1400"}, {"2","Keyboards","600"} },
            { {"3","Trumpets","550"}, {"4","Saxophones","700"}, {"5","Drums","1200"} },
            { {"6","Banjos","500"}, {"7","Maracas","70"}, {"8","Flutes","325"} } };

        //System.out.println(Arrays.deepToString(productitems));

        System.out.println(productitems[0][0][0] + "" + productitems[0][0][1] + ""+ productitems[0][0][2]);
        System.out.println(productitems[0] .length+ "" + productitems[1] .length+ ""+ productitems[2].length);
        System.out.printf(productitems[0][0][0] + "" + productitems[0][0][1] + ""+ productitems[0][0][2]);
    }
}
