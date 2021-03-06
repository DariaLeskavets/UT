package triangle.positive;

import com.epam.triangle.Triangle;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Field;

public class Positive {

    @Test(groups = "existence", dataProvider = "exist", dataProviderClass = PositiveProvider.class)
    public void testConstr(double a, double b, double c){
        Triangle tr = new Triangle(a, b, c);
        try {
            Field field1 = tr.getClass().getDeclaredField("a");
            field1.setAccessible(true);
            Double fieldValue1 = (Double) field1.get(tr);
            Assert.assertEquals(a, fieldValue1);

            Field field2 = tr.getClass().getDeclaredField("b");
            field2.setAccessible(true);
            Double fieldValue2 = (Double) field2.get(tr);
            Assert.assertEquals(b, fieldValue2);

            Field field3 = tr.getClass().getDeclaredField("c");
            field3.setAccessible(true);
            Double fieldValue3 = (Double) field3.get(tr);
            Assert.assertEquals(c, fieldValue3);

        } catch (NoSuchFieldException  e){
            e.printStackTrace();
        } catch (IllegalAccessException e){
            e.printStackTrace();
        }
    }

    @Test(groups = "existence",dataProvider = "exist", dataProviderClass = PositiveProvider.class)
    public void more0(double a, double b, double c){
        Triangle tr1 = new Triangle(a, b, c);
        Assert.assertTrue(tr1.checkTriangle());
    }

    @Test(groups = "existence", dataProvider = "overflow", dataProviderClass = PositiveProvider.class)
    public void overflow(double a, double b, double c){
        Triangle tr1 = new Triangle(a, b, c);
        Assert.assertTrue(tr1.checkTriangle());
        Triangle tr2 = new Triangle(a, c, b);
        Assert.assertTrue(tr2.checkTriangle());
        Triangle tr3 = new Triangle(b, c, a);
        Assert.assertTrue(tr3.checkTriangle());
    }

    @Test(groups = "rectangle", dataProvider = "rectang", dataProviderClass = PositiveProvider.class)
    public void rect(double a, double b, double c){
        Triangle tr = new Triangle(a, b, c);
        Assert.assertEquals(8, tr.detectTriangle(), 1);
    }

    @Test(groups = "equil", dataProvider = "equil", dataProviderClass = PositiveProvider.class)
    public void equil(double a){
        Triangle tr = new Triangle(a, a, a);
        Assert.assertEquals(3, tr.detectTriangle(), 1);
    }

    @Test(groups = "isosc", dataProvider = "isosc", dataProviderClass = PositiveProvider.class)
    public void isosc(double a, double b, double c){
        Triangle tr = new Triangle(a, b, c);
        Assert.assertEquals(2, tr.detectTriangle(), 1);
    }

    @Test(groups = {"rectangle", "isosc"}, dataProvider = "rect_isosc", dataProviderClass = PositiveProvider.class)
    public void rect_isosc(double a, double b, double c){
        Triangle tr = new Triangle(a, b, c);
        Assert.assertEquals(10, tr.detectTriangle(), 1);

    }

    @Test(groups = "ordinary", dataProvider = "ordinary", dataProviderClass = PositiveProvider.class)
    public void ordinary(double a, double b, double c){
        Triangle tr = new Triangle(a, b, c);
        Assert.assertEquals(4, tr.detectTriangle(), 1);
    }

    @Test(groups = "square", dataProvider = "rectang", dataProviderClass = PositiveProvider.class)
    public void checkSquare(double a, double b, double c){
        Triangle tr = new Triangle(a, b, c);
        Assert.assertEquals(6.00, tr.getSquare(), 0.1);
    }

}
