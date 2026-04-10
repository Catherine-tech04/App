import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testNormalPricing() {
        assertEquals(100, App.calculatePrice(100, 10, 20));
    }

    @Test
    void testSurgePricing() {
        assertEquals(150, App.calculatePrice(100, 30, 20));
    }

    @Test
    void testHighSurge() {
        assertEquals(250, App.calculatePrice(100, 50, 20));
    }
}