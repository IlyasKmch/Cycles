import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import services.CountRestMonthService;

public class CountRestMonthServiceTest {
    @Test
    public void testFirstExample() {
        CountRestMonthService service = new CountRestMonthService();

        int expected = 3;
        int actual = service.calculate(10_000, 3_000,
                20_000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSecondExample() {
        CountRestMonthService service = new CountRestMonthService();

        int expected = 2;
        int actual = service.calculate(100_000, 60_000,
                150_000);
        Assertions.assertEquals(expected, actual);
    }
}
