import org.example.Main;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {

    @Test
    public void testSumZero(){
        int r1 = Main.sum(0, 0);

        Assert.assertEquals(r1, 0);

    }

    @Test
    public void testSumSomeNumber(){

        int r2 = Main.sum(5, 8);
        Assert.assertEquals(r2, 13);

    }

    @Test
    public void testSumMax(){

        int r3 = Main.sum(Integer.MAX_VALUE, 1);
        Assert.assertEquals(r3, Integer.MIN_VALUE);
    }

}
