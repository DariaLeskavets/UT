package triangle.negative;

import com.epam.triangle.Triangle;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Negative {

    @Test(groups = "existence", dataProvider = "less0", dataProviderClass = NegativeProvider.class)
    public void less0(double a, double b, double c){
        Triangle tr1 = new Triangle(a, b, c);
        Assert.assertFalse(tr1.checkTriangle());
        Assert.assertEquals("a<=0", tr1.getMessage());
        Triangle tr2 = new Triangle(b, a, c);
        Assert.assertFalse(tr2.checkTriangle());
        Assert.assertEquals("b<=0", tr2.getMessage());
        Triangle tr3 = new Triangle(c, b, a);
        Assert.assertFalse(tr3.checkTriangle());
        Assert.assertEquals("c<=0", tr3.getMessage());
    }

    @Test(groups = "existence", dataProvider = "equal0", dataProviderClass = NegativeProvider.class)
    public void equal0(double a, double b, double c){
        Triangle tr1 = new Triangle(a, b, c);
        Assert.assertFalse(tr1.checkTriangle());
        Assert.assertEquals("a<=0", tr1.getMessage());
        Triangle tr2 = new Triangle(b, a, c);
        Assert.assertFalse(tr2.checkTriangle());
        Assert.assertEquals("b<=0", tr2.getMessage());
        Triangle tr3 = new Triangle(c, b, a);
        Assert.assertFalse(tr3.checkTriangle());
        Assert.assertEquals("c<=0", tr3.getMessage());
    }

    @Test(groups = "existence", dataProvider = "twoLessThird", dataProviderClass = NegativeProvider.class)
    public void twoLessThird(double a, double b, double c){
        Triangle tr1 = new Triangle(a, b, c);
        Assert.assertFalse(tr1.checkTriangle());
        Assert.assertEquals("a+b<=c", tr1.getMessage());
        Triangle tr2 = new Triangle(a, c, b);
        Assert.assertFalse(tr2.checkTriangle());
        Assert.assertEquals("a+c<=b", tr2.getMessage());
        Triangle tr3 = new Triangle(c, b, a);
        Assert.assertFalse(tr3.checkTriangle());
        Assert.assertEquals("b+c<=a", tr3.getMessage());
    }

}
