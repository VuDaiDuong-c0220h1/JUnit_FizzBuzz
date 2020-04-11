import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void checkFizzBuzz() {
        int number = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzz.checkFizzBuzz(number);
        assertEquals(expected, result);
    }
}