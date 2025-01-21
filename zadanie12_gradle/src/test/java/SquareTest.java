import org.example.Square;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SquareTest {

    @DataProvider
    public Object[] dataProviderCreation(){
        return new Object[][]{ {1}, {0.5} };
    }

    @Test(dataProvider = "dataProviderCreation")
    void creation(double value) throws Exception{
        Square square = new Square(value);

        Assert.assertNotNull(square);
    }

    @Test
    void perimeter() throws Exception {
        Square square = new Square(1);

        Assert.assertEquals(4, square.Perimeter());
    }

    @Test
    void area() throws Exception {
        Square square = new Square(1);

        Assert.assertEquals(1, square.Area());
    }

    @DataProvider
    public Object[][] dataProviderNegativeOrZeroCreation(){
        return new Object[][]{ {-1}, {0} };
    }

    @Test(dataProvider = "dataProviderNegativeOrZeroCreation",expectedExceptions = Exception.class, expectedExceptionsMessageRegExp = "Сторона квадрата не может быть меньше или равна нулю")
    void exception(double value) throws Exception {
        Square square = new Square(value);
    }
}
