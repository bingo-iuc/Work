package fruit;

import org.junit.Test;

public class Test4 {
    public static void main(String[] args) {
        FruitMark4 fruitMark4=new FruitMark4();
        double[][] numbers={{2,3,2.81},{4,4,1},{4,4,2},{-1,-1,-1},{-1,1,1},{1,-1,-1},{1,1,-1}};//用二维数组存储水果数量
        //测试总结小于100时金额是否正确
        for (int i = 0; i <numbers.length ; i++) {
            double totalPrice= fruitMark4.calculateTotalPrice(numbers[i][0],numbers[i][1],numbers[i][2]);//传入水果的斤数
            if(totalPrice==-1){
                System.out.println("水果数量有误！！！");
                continue;
            }
            exceptTotalPrices(numbers[i][0],numbers[i][1],numbers[i][2],totalPrice);
        }
    }
    /**
     * @Description:对函数计算结果进行判断
     * @param: num1
     * @param: num2
     * @param: num3
     * @param: totalPrice
     * @return * @return void
    */
    public static void exceptTotalPrices(double num1,double num2,double num3,double totalPrice){
        double exceptTotalPrice=num1*8+num2*13+num3*16;
        if (exceptTotalPrice>=100){
            System.out.println("购买总金额满100元，立减10元，"+"原价为："+exceptTotalPrice);
            exceptTotalPrice=exceptTotalPrice-10;
            System.out.println("优惠后价格为："+exceptTotalPrice);
        }
        if (totalPrice<(num1+num2+num3)*8-10||
                totalPrice>(num1+num2+num3)*20*0.8){//价格不能小于全是苹果满100-10的价格，不能大于全是草莓打折的价格
            System.out.println("价格不能小于全是苹果的价格，不能大于全是芒果的价格，总价格有误！！！");
        }else{
            if(totalPrice==exceptTotalPrice){//函数计算值与手工计算值对照
                System.out.println("顾客D购买水果的总价为："+totalPrice);
            }
            else{
                System.out.println("总价格验算不正确，总价格有误！！！");
            }
        }
    }
    @Test
    public void test6(){
        System.out.println(9.26*8+8*13+2*20*0.8+1*15-10);
        System.out.println(Math.round(9.26*8+8*13+2*20*0.8-10));
    }


}
