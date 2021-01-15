import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EvenAndOddNumbersTest {

    @Test
    void is5even() {
    boolean result = EvenAndOddNumbers.isEvenNumber(5);

    Assertions.assertFalse(result);
}
    @Test
    void is6even() {
        boolean result = EvenAndOddNumbers.isEvenNumber(6);

        Assertions.assertTrue(result);
    }

    @Test
    void is5odd() {
    boolean result = EvenAndOddNumbers.isOddNumber(5);

    Assertions.assertTrue(result);
    }
    @Test
    void is6odd() {
        boolean result = EvenAndOddNumbers.isOddNumber(6);

        Assertions.assertFalse(result);
    }



}

