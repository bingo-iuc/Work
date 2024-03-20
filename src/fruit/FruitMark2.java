package fruit;

public class FruitMark2 extends FruitMark1 {
    private double mangoes;//芒果数量
    private static double mangoPricePerKg=20;//芒果单价

    public FruitMark2() {
    }

    public FruitMark2(int apples, int strawberries, int mangoes) {
        super(apples, strawberries);
        this.mangoes = mangoes;
    }

    public double getMangoes() {
        return mangoes;
    }

    public void setMangoes(int mangoes) {
        this.mangoes = mangoes;
    }

    public static double getMangoPricePerKg() {
        return mangoPricePerKg;
    }

    public static void setMangoPricePerKg(double mangoPricePerKg) {
        FruitMark2.mangoPricePerKg = mangoPricePerKg;
    }
    /**
     * @Description:计算购买水果的总价
     * @param: apples
     * @param: strawberries
     * @param: mangoes
     * @return * @return double
     */
    public  double calculateTotalPrice(double apples,double strawberries,double mangoes){
        if (apples < 0 || strawberries < 0||mangoes<0) {
            return -1; // 返回一个负值表示错误
        }
        double totalPrice = (apples * FruitMark2.getApplePricePerKg()) +
                (strawberries * FruitMark2.getStrawberryPricePerKg())+
                (mangoes*mangoPricePerKg);
        return totalPrice;
    }
}
