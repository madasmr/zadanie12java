import org.example.Circle;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CircleTest {

    @DataProvider
    public Object[] dataProviderCreation(){
        return new Object[][]{ {1}, {0.5} };
    }

    @Test(dataProvider = "dataProviderCreation")
    void creation(double value) throws Exception{
        Circle circle = new Circle(value);

        Assert.assertNotNull(circle);
    }

    @Test
    void perimeter() throws Exception {
        Circle circle = new Circle(1);

        Assert.assertEquals(2*Math.PI, circle.Perimeter());
    }

    @Test
    void area() throws Exception {
        Circle circle = new Circle(1);

        Assert.assertEquals(Math.PI, circle.Area());
    }

    @DataProvider
    public Object[][] dataProviderNegativeOrZeroCreation(){
        return new Object[][]{ {-1}, {0} };
    }

    @Test(dataProvider = "dataProviderNegativeOrZeroCreation",expectedExceptions = Exception.class, expectedExceptionsMessageRegExp = "Радиус не может быть меньше или равен нулю")
    void exception(double value) throws Exception {
        Circle circle = new Circle(value);
    }

}
