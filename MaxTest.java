package condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMaxA1To2Then2() {
        int result = Max.maxA(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMaxB1To2Then2() {
        int result = Max.maxB(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenMaxC1To2Then2() {
        int result = Max.maxC(2, 2);
        assertThat(result, is(2));
    }
}
