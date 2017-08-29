import org.junit.Assert;
import org.junit.Test;

/**
 * Created by fin_tech_2014 on 8/22/17.
 */
public class App1Test extends Application {

    @Test
    public void test1() {
        Assert.assertTrue(2 > 3);
    }

    @Test
    public void test2() {
        Assert.assertTrue(2 < 3);
    }

}
