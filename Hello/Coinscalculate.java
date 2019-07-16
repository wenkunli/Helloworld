public class Coinscalculate {
    public static void main(String[] args) {
        int coinsnum = 0;
        int nickelnum = 0;
        int dimenum = 0;
        int quarternum = 0;
        int loonienum = 0;
        int twoonienum = 0;
        int value = 185;

        while (value > 100) {
            value -= Coins.getLoonie();
            loonienum++;
        }
        System.out.println(loonienum);
    }
}
