import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class isPerfectTest {

    @Test
    public void isNotPerfectNumberTest() {
        // Arrange
        int number = 500;
        FindPerfectNr findPerNr = new FindPerfectNr();

        // Act & Assert
        assertFalse(findPerNr.isPerfect(number));
    }

    @Test
    public void isPerfectNumberTest() {
        // Arrange
        int number = 6;
        FindPerfectNr findPerNr = new FindPerfectNr();

        // Act & Assert
        assertTrue(findPerNr.isPerfect(number));
    }

    @Test
    public void returnListOfPerfectNumbers() {
        // Arrange
        int[] input = new int[]{1, 2, 3, 4, 5, 6};
        FindPerfectNr findPerNr = new FindPerfectNr();

        // Act
        List<Integer> result = findPerNr.perfectNumbers(input);

        // Assert
        assertEquals(result.size(), 1);
        assertEquals(result.get(0), 6);
    }
}
