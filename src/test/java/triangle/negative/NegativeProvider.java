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

    @DataProvider(name = "nullSide")
    public Object[][] nullSide(){
        return new Object[][]{
                {null, 2, 3}
        };
    }

    @DataProvider(name = "textSide")
    public Object[][] textSide(){
        return new Object[][]{
                {"vnfvf", 2, 3}
        };
    }

    @DataProvider(name = "rectang")
    public Object[][] rectang(){
        return new Object[][]{
                {2, 4, 5}
        };
    }

    @DataProvider(name = "equil")
    public Object[][] equil(){
        return new Object[][]{
                {3, 4, 2}
        };
    }

    @DataProvider(name = "isosc")
    public Object[][] isosc(){
        return new Object[][]{
                {3, 3, 5}
        };
    }

}
