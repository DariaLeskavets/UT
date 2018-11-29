package triangle.positive;

import org.testng.annotations.DataProvider;

public class PositiveProvider {

    @DataProvider(name = "exist")
    public Object[][] more0(){

        return new Object[][]{
                {2.0, 3.0, 4.0}
        };
    }

   /* @DataProvider(name = "twoMoreThird")
    public Object[][] twoMoreThird(){
        return new Object[][]{
                {"a", 4},
                {"b", 6},
                {"c", 3},
        };
    }*/

    @DataProvider(name = "rectang")
    public Object[][] rectang(){
        return new Object[][]{
                {3.0, 4.0, 5.0}
        };
    }

    @DataProvider(name = "equil")
    public Object[][] equil(){
        return new Object[][]{
                {7.0}
        };
    }

    @DataProvider(name = "isosc")
    public Object[][] isosc(){
        return new Object[][]{
                {3.0, 5.0}
        };
    }

    @DataProvider(name = "rect_isosc")
    public Object[][] rect_isosc(){
        return new Object[][]{
                {Math.sqrt(2.0), 2.0}
        };
    }
}
