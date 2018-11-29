package triangle.negative;

import com.epam.triangle.Triangle;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Negative {

    @Test(groups = "existence", dataProvider = "less0", dataProviderClass = NegativeProvider.class)
    public void less0(double a, double b, double c){
        Triangle tr1 = new Triangle(a, b, c);
        Assert.assertEquals(false, tr1.checkTriangle());
        Assert.assertEquals("a<=0", tr1.getMessage());
        Triangle tr2 = new Triangle(b, a, c);
        Assert.assertEquals(false, tr2.checkTriangle());
        Assert.assertEquals("b<=0", tr2.getMessage());
        Triangle tr3 = new Triangle(c, b, a);
        Assert.assertEquals(false, tr3.checkTriangle());
        Assert.assertEquals("c<=0", tr3.getMessage());
    }

    @Test(groups = "existence", dataProvider = "equal0", dataProviderClass = NegativeProvider.class)
    public void equal0(double a, double b, double c){
        Triangle tr1 = new Triangle(a, b, c);
        Assert.assertEquals(false, tr1.checkTriangle());
        Assert.assertEquals("a<=0", tr1.getMessage());
        Triangle tr2 = new Triangle(b, a, c);
        Assert.assertEquals(false, tr2.checkTriangle());
        Assert.assertEquals("b<=0", tr2.getMessage());
        Triangle tr3 = new Triangle(c, b, a);
        Assert.assertEquals(false, tr3.checkTriangle());
        Assert.assertEquals("c<=0", tr3.getMessage());
    }

   /* @Test(groups = "existence", dataProvider = "twoLessThird", dataProviderClass = NegativeProvider.class)
    public void twoLessThird(double a, double b, double c){
        Triangle tr1 = new Triangle(a, b, c);
        Assert.assertEquals("a+b<=c", tr1.checkTriangle());
        Triangle tr2 = new Triangle(a, c, b);
        Assert.assertEquals("a+c<=b", tr2.checkTriangle());
        Triangle tr3 = new Triangle(c, b, a);
        Assert.assertEquals("c+b<=a", tr3.checkTriangle());
    }

*/
}
