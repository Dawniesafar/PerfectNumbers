import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class isPerfectTest {

    @Test
    public void isNotPerfectTest() {
        // Arrange
        int number = 500;
        FindPerfectNr input = new FindPerfectNr();

        // Act & Assert
        assertFalse(input.isPerfect(number));
    }

    @Test
    public void isPerfectTest() {
        // Arrange
        int number = 6;
        FindPerfectNr input = new FindPerfectNr();

        // Act & Assert
        assertTrue(input.isPerfect(number));
    }
}
