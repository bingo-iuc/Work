public class FruitMark1 {
    private double apples;//苹果数量
    private static double applePricePerKg=8;//苹果单价
    private double strawberries;//草莓数量
    private static double strawberryPricePerKg=13 ;//草莓单价

    public FruitMark1() {
    }

    public FruitMark1(double apples,  double strawberries) {
        this.apples = apples;
        this.strawberries = strawberries;
    }

    public double getApples() {
        return apples;
    }

    public void setApples(double apples) {
        this.apples = apples;
    }

    public static double getApplePricePerKg() {
        return applePricePerKg;
    }

    public static void setApplePricePerKg(double applePricePerKg) {
        FruitMark1.applePricePerKg = applePricePerKg;
    }

    public double getStrawberries() {
        return strawberries;
    }

    public void setStrawberries(double strawberries) {
        this.strawberries = strawberries;
    }

    public static double getStrawberryPricePerKg() {
        return strawberryPricePerKg;
    }

    public static void setStrawberryPricePerKg(double strawberryPricePerKg) {
        FruitMark1.strawberryPricePerKg = strawberryPricePerKg;
    }
    /**
     * @Description:
     * @param: apples
     * @param: strawberries
     * @return * @return double
    */
    public  double calculateTotalPrice(double apples,double strawberries){
        if (apples < 0 || strawberries < 0) {
            return -1; // 返回一个负值表示错误
        }
        double totalPrice = (apples * applePricePerKg) + (strawberries * strawberryPricePerKg);
        return totalPrice;
    }
}
