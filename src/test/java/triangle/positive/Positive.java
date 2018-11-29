package triangle.positive;

import com.epam.triangle.Triangle;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Field;

public class Positive {

    @Test(groups = "existence", dataProvider = "exist", dataProviderClass = PositiveProvider.class)
    public void testConstr(double a, double b, double c){
        Triangle tr = new Triangle(a, b, c);
        Class<Triangle> triangleClass = Triangle.class;
        try {
            Field field1 = tr.getClass().getDeclaredField("a");
            field1.setAccessible(true);
            Double fieldValue1 = (Double) field1.get(tr);
            System.out.println(fieldValue1 + " " + a);
            Assert.assertEquals(a, fieldValue1);

            Field field2 = tr.getClass().getDeclaredField("b");
            field2.setAccessible(true);
            Double fieldValue2 = (Double) field2.get(tr);
            System.out.println(fieldValue2 + " " + b);
            Assert.assertEquals(b, fieldValue2);

            Field field3 = tr.getClass().getDeclaredField("c");
            field3.setAccessible(true);
            Double fieldValue3 = (Double) field3.get(tr);
            System.out.println(fieldValue3 + " " + c);
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
        Assert.assertEquals(true, tr1.checkTriangle(), String.valueOf(0.01));
    }

    @Test(groups = "rectangle", dataProvider = "rectang", dataProviderClass = PositiveProvider.class)
    public void rect(double a, double b, double c){
        Triangle tr1 = new Triangle(a, b, c);
        Assert.assertEquals(8, tr1.detectTriangle(), 1);
        Triangle tr2 = new Triangle(c, b, a);
        Assert.assertEquals(8, tr2.detectTriangle(), 1);
        Triangle tr3 = new Triangle(a, c, b);
        Assert.assertEquals(8, tr3.detectTriangle(), 1);
    }

    @Test(groups = "equil", dataProvider = "equil", dataProviderClass = PositiveProvider.class)
    public void equil(double a){
        Triangle tr = new Triangle(a, a, a);
        Assert.assertEquals(3, tr.detectTriangle(), 1);
    }

    @Test(groups = "isosc", dataProvider = "isosc", dataProviderClass = PositiveProvider.class)
    public void isosc(double a, double b){
        Triangle tr1 = new Triangle(a, a, b);
        Assert.assertEquals(2, tr1.detectTriangle(), 1);
        Triangle tr2 = new Triangle(a, b, a);
        Assert.assertEquals(2, tr2.detectTriangle(), 1);
        Triangle tr3 = new Triangle(b, a, a);
        Assert.assertEquals(2, tr3.detectTriangle(), 1);
    }

    @Test(groups = {"rectangle", "isosc"}, dataProvider = "rect_isosc", dataProviderClass = PositiveProvider.class)
    public void rect_isosc(double a, double b){
        Triangle tr = new Triangle(a, a, b);
        Assert.assertEquals(10, tr.detectTriangle(), 1);
    }

}
