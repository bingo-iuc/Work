/**
 * @author cuibingbing
 * @Description:
 * @create 2024-03-22 17:04
 *
 * 提子，15元，优惠条件：如果满200元，再减20元
 *
 */
public class FruitMark5 extends FruitMark2 {
    private double raisins;
    private static double raisinsPricePerKg = 15;

    public FruitMark5() {
    }


    public double getRaisins() {
        return raisins;
    }

    public void setRaisins(double raisins) {
        this.raisins = raisins;
    }

    public static double getRaisinsPricePerKg() {
        return raisinsPricePerKg;
    }

    public static void setRaisinsPricePerKg(double raisinsPricePerKg) {
        FruitMark5.raisinsPricePerKg = raisinsPricePerKg;
    }

    /**
     * @return * @return double
     * @Description:计算购买水果的总价
     * @param: apples
     * @param: strawberries
     * @param: mangoes:芒果价格打八折,提子，15元，优惠条件：如果满200元，再减20元
     */
    public double calculateTotalPrice(double apples, double strawberries, double mangoes,double raisins) {
        if (apples < 0 || strawberries < 0 || mangoes < 0|| raisins < 0) {
            return -1; // 返回一个负值表示错误
        }
        double totalPrice = (apples * FruitMark4.getApplePricePerKg()) +
                (strawberries * FruitMark4.getStrawberryPricePerKg()) +
                (mangoes * FruitMark4.getMangoPricePerKg() * 0.8) +
                (raisins * raisinsPricePerKg);
        if (totalPrice >= 100) {
            totalPrice = totalPrice - 10;
            if(totalPrice >= 200){
                totalPrice = totalPrice - 20;
            }
        }
        return totalPrice;
    }
}