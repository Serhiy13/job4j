package Tests;

import condition.SqArea;
import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {
    @Test
    public void sqare () {
       double expected = 2.0;
       double out = SqArea.square(6, 2);
       Assert.assertEquals(expected, out, 0.1);
    }
}
