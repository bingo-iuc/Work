import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

/**
 * @author cuibingbing
 * @Description:第一题
 * @create 2024-03-23 12:47
 */

public class Test1 {
    @DataProvider(name = "fruitData1")
    public Object[][] FruitData1() {
        return new Object[][] {
                {2, 3,2*8+13*3},
                {0, 0, 0},
                {-1,0,-1},
                {0,-1,-1},
                {-1,-1,-1},
        };
    }

    @Test(dataProvider = "fruitData1")
    public void test1(double apples,double strawberries,double excpetTotalPrice){
        FruitMark1 fruitMark1=new FruitMark1();
        double totalPrice= fruitMark1.calculateTotalPrice(apples,strawberries);//传入水果的斤数
        assertEquals(excpetTotalPrice, totalPrice,0.0001);//断言
    }
    /**
     * @Description:第二题
     * @param:
     * @return * @return java.lang.Object[][]
     * @author cuibingbing
     * @date 2024/3/23 13:44:58
    */
    @DataProvider(name = "fruitData2")
    public Object[][] FruitData2() {
        return new Object[][] {
                {2, 3,5,2*8+13*3+5*20},
                {0, 0, 0,0},
                {-1,0,0,-1},
                {0,-1,0,-1},
                {0,0,-1,-1},
                {-1,-1,-1,-1}
        };
    }
    @Test(dataProvider = "fruitData2")
    public void test2(double apples,double strawberries,double mangoes,double excpetTotalPrice){
        FruitMark2 fruitMark2=new FruitMark2();
        double totalPrice= fruitMark2.calculateTotalPrice(apples,strawberries,mangoes);//传入水果的斤数
        assertEquals(excpetTotalPrice, totalPrice,0.0001);//断言
    }

    /**
     * @Description:第三题
     * @param:
     * @return * @return java.lang.Object[][]
     * @author cuibingbing
     * @date 2024/3/23 13:44:58
     */
    @DataProvider(name = "fruitData3")
    public Object[][] FruitData3() {
        return new Object[][] {
                {2, 3,5,2*8+13*3+5*20*0.8},
                {0, 0, 0,0},
                {-1,0,0,-1},
                {0,-1,0,-1},
                {0,0,-1,-1},
                {-1,-1,-1,-1}
        };
    }
    @Test(dataProvider = "fruitData3")
    public void test3(double apples,double strawberries,double mangoes,double excpetTotalPrice){
        FruitMark3 fruitMark3=new FruitMark3();
        double totalPrice= fruitMark3.calculateTotalPrice(apples,strawberries,mangoes);//传入水果的斤数
        assertEquals(excpetTotalPrice, totalPrice,0.0001);//断言
    }

    /**
     * @Description:第四题
     * @param:
     * @return * @return java.lang.Object[][]
     * @author cuibingbing
     * @date 2024/3/23 13:44:58
     */
    @DataProvider(name = "fruitData4")
    public Object[][] FruitData4() {
        return new Object[][] {
                {2, 3,2.81,2*8+13*3+2.81*20*0.8},
                {4, 4, 1,(4*8+4*13+1*20*0.8-10)},
                {4, 4, 2,(4*8+4*13+2*20*0.8-10)},
                {0,0,0,0},
                {-1,0,0,-1},
                {0,-1,0,-1},
                {0,0,-1,-1},
                {-1,-1,-1,-1}
        };
    }
    @Test(dataProvider = "fruitData4")
    public void test4(double apples,double strawberries,double mangoes,double excpetTotalPrice){
        FruitMark4 fruitMark4=new FruitMark4();
        double totalPrice= fruitMark4.calculateTotalPrice(apples,strawberries,mangoes);//传入水果的斤数
        assertEquals(excpetTotalPrice, totalPrice,0.0001);//断言
    }

    /**
     * @Description:第五题
     * @param:
     * @return * @return java.lang.Object[][]
     * @author cuibingbing
     * @date 2024/3/23 13:44:58
     */
    @DataProvider(name = "fruitData5")
    public Object[][] FruitData5() {
        return new Object[][] {
                {2, 3,2.81,0,(2*8+13*3+2.81*20*0.8+0*0) },
                {4, 4, 1,0,(4*8+4*13+1*20*0.8+0*0)-10},
                {4, 4, 1,1,(4*8+4*13+1*20*0.8+1*15)-10},
                {8, 8, 2,0,(8*8+8*13+2*20*0.8+0*0)-10},
                {9.24, 8, 2,0,(9.24*8+8*13+2*20*0.8+0*0)-10},
                {9.25, 8, 2,0,(9.25*8+8*13+2*20*0.8+0*0)-10-20},
                {9.26, 8, 2,1,(9.26*8+8*13+2*20*0.8+1*15)-10-20},
                {0, 0, 0,0,0},
                {-1,0,0,0,-1},
                {0,-1,0,0,-1},
                {0,0,-1,0,-1},
                {0,0,0,-1,-1},
                {-1,-1,-1,-1,-1}
        };
    }
    @Test(dataProvider = "fruitData5")
    public void test5(double apples,double strawberries,double mangoes,double raisins,double excpetTotalPrice){
        FruitMark5 fruitMark5=new FruitMark5();
        double totalPrice= fruitMark5.calculateTotalPrice(apples,strawberries,mangoes,raisins);//传入水果的斤数
        assertEquals(excpetTotalPrice, totalPrice,0.0001);//断言
    }
}
