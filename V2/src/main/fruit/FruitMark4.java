public class FruitMark4 extends FruitMark2 {

    /**
     * @Description:计算购买水果的总价
     * @param: apples
     * @param: strawberries
     * @param: mangoes:芒果价格打八折
     * @return * @return double
     */
    public  double calculateTotalPrice(double apples,double strawberries,double mangoes){
        if (apples < 0 || strawberries < 0||mangoes<0) {
            return -1; // 返回一个负值表示错误
        }
        double totalPrice = (apples * FruitMark4.getApplePricePerKg()) +
                (strawberries * FruitMark4.getStrawberryPricePerKg())+
                (mangoes* FruitMark4.getMangoPricePerKg()*0.8);
        if(totalPrice>=100){
            totalPrice=totalPrice-10;
        }
        return totalPrice;
    }
}
