package fruit;

public class Test3 {
    public static void main(String[] args) {
        FruitMark3 fruitMark3=new FruitMark3();
        double totalPrice= fruitMark3.calculateTotalPrice(2,3,5);//传入水果的斤数
        if(totalPrice==-1){
            System.out.println("水果数量有误！！！");
            return;
        }
        if (totalPrice<(2+3+5)*8||totalPrice>(2+3+5)*20*0.8){//价格不能小于全是苹果的价格，不能大于全是草莓打折后的价格
            System.out.println("价格不能小于全是苹果的价格，不能大于全是芒果的价格，总价格有误！！！");
        }else{
            if(totalPrice==(2*8+13*3+5*20*0.8)){//函数计算值与手工计算值对照
                System.out.println("顾客C购买水果的总价为："+totalPrice);
            }
            else{
                System.out.println("总价格验算不正确，总价格有误！！！");
            }
        }
    }
}
