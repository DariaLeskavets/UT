package triangle.negative;

import org.testng.annotations.DataProvider;

public class NegativeProvider {

    @DataProvider(name = "less0")
    public static Object[][] less0(){
        return new Object[][]{
                {-1.0, 2.0, 3.0}
        };
    }

    @DataProvider(name = "equal0")
    public Object[][] equal0(){
        return new Object[][]{
                {0.0, 2.0, 3.0}
        };
    }

    @DataProvider(name = "twoLessThird")
    public Object[][] twoLessThird(){
        return new Object[][]{
                {1.0, 2.0, 10.0}
        };
    }

    @DataProvider(name = "exceptions")
    public Object[][] exceptions(){
        return new Object[][]{
                {Double.POSITIVE_INFINITY, 1.0, 2.0},
                {1.0, Double.POSITIVE_INFINITY, 2.0},
                {1.0, 2.0, Double.POSITIVE_INFINITY},
                {Double.NEGATIVE_INFINITY, 1.0, 2.0},
                {1.0, Double.NEGATIVE_INFINITY, 2.0},
                {1.0, 2.0, Double.NEGATIVE_INFINITY}
        };
    }

}
