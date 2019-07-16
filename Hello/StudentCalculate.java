public class StudentCalculate {
    private String name;
    private int height;
    int[] arrayheight;

    public StudentCalculate(int[] studentheight) {

        arrayheight = studentheight;
        }

    public int averageheight() {
    int average = 0;
    for(int i = 0; i < arrayheight.length; i++){
        average += arrayheight[i];
    }
        return average/arrayheight.length;
}
    /*public void average() {
        for(int i = 0; i<studentheight.length; i++){
            average =  average + studentheight[i];
        }
        this.average = average/studentheight.length;
    }*/

}
