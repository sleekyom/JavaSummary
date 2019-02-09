package week12;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SecondBiggestOfAnArrayTestTest {
    @Test
    public void shouldGetSecondBiggest() {
        // given

        SecondBiggestOfAnArrayTest secondBiggestOfAnArrayTest = new SecondBiggestOfAnArrayTest();
        int array[] = {2, 16, 15, 4, 12, 65};
        int expected = 16;

        // when
        int actual = secondBiggestOfAnArrayTest.getSecondBiggest(array);

        // then
        Assert.assertEquals(expected, actual);
    }

}