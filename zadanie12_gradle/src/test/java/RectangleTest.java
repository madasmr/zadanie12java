import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.example.Rectangle;

public class RectangleTest {

    @DataProvider
    public Object[] dataProviderCreation(){
        return new Object[][]{ {0.5}, {1}, {0.5}, {1} };
    }

    @Test(dataProvider = "dataProviderCreation")
    void creation(double value) throws Exception{
        Rectangle rectangle = new Rectangle(value, 2);
        Assert.assertNotNull(rectangle);

        rectangle = new Rectangle(2, value);
        Assert.assertNotNull(rectangle);

        rectangle = new Rectangle(2, value);
        Assert.assertNotNull(rectangle);

        rectangle = new Rectangle(value, 2);
        Assert.assertNotNull(rectangle);
    }

    @Test
    void perimeter() throws Exception{
        Rectangle rectangle = new Rectangle(1,2);

        Assert.assertEquals(6, rectangle.Perimeter());
    }

    @Test
    void area() throws Exception {
        Rectangle rectangle = new Rectangle(1,2);

        Assert.assertEquals(2, rectangle.Area());
    }

    @DataProvider
    public Object[][] dataProviderNegativeOrZeroCreation(){
        return new Object[][]{ {-1}, {0}, {-1}, {0} };
    }

    @Test(dataProvider = "dataProviderNegativeOrZeroCreation",expectedExceptions = Exception.class, expectedExceptionsMessageRegExp = "Сторона прямоугольника не может быть меньше или равна нулю")
    void exception (double value) throws Exception {
        Rectangle rectangle = new Rectangle(value, 2);
        rectangle = new Rectangle(value, 2);
        rectangle = new Rectangle(2, value);
        rectangle = new Rectangle(2, value);
    }
}
