package fruit;

public class Test1 {
    public static void main(String[] args) {
        FruitMark1 fruitMark1=new FruitMark1();
        double totalPrice= fruitMark1.calculateTotalPrice(2,3);//传入水果的斤数
        if (totalPrice<(2+3)*8||totalPrice>(2+3)*13){//价格不能小于全是苹果的价格，不能大于全是草莓的价格
            System.out.println("价格不能小于全是苹果的价格，不能大于全是草莓的价格，总价格有误！！！");
        }else{
            if(totalPrice==(2*8+13*3)){//函数计算值与手工计算值对照
                System.out.println("顾客A购买水果的总价为："+totalPrice);
            }
            else{
                System.out.println("总价格验算不正确，总价格有误！！！");
            }
        }
    }
}
