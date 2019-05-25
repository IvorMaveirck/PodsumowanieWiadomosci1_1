import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void test1 (){
        String name = "Jan Ul";
        int expected = 0;
        Assert.assertEquals(expected,Main.nameModulo(name));
    }

    @Test
    public void test2 (){
        String name = "Paweł Knapik";
        int expected = 1;
        Assert.assertEquals(expected,Main.nameModulo(name));
    }

    @Test
    public void test3 (){
        String name = "Artur Lukas";
        int expected = 0;
        Assert.assertEquals(expected,Main.nameModulo(name));
    }

}
