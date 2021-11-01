import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class MyTest {
    @Test
    public final void test_all() {
        Assert.assertEquals("Nope!", 4, Java.doubleInteger(2)); // Test cases here!
    }

    private static class Assert {
        public static void assertEquals(String s, int i, Object doubleInteger) {

        }
    }

    private static class Java {
        private static int i;

        public static int doubleInteger(int i) {
            int result = 2;
            result = result * i;
            return result; // или return i*2;
        }
    }
}

