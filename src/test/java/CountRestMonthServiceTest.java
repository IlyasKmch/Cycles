
import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
//import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.services.CountRestMonthService;

public class CountRestMonthServiceTest {

    @ParameterizedTest
//    @CsvSource({
//            "10000,3000,20000,3",
//            "100000,60000,150000,2"
//    })
    @CsvFileSource(files="src/test/resources/count.csv" )
    public void test (int income, int expenses, int threshold, int expected) {
        CountRestMonthService service = new CountRestMonthService();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
//   @Test
//    public void testFirstExample() {
//        CountRestMonthService service = new CountRestMonthService();
//
//        int expected = 3;
//        int actual = service.calculate(10_000, 3_000,
//                20_000);
//        Assertions.assertEquals(expected, actual);
//    }

   /* @Test
    public void testSecondExample() {
        CountRestMonthService service = new CountRestMonthService();

        int expected = 2;
        int actual = service.calculate(100_000, 60_000,
                150_000);
        Assertions.assertEquals(expected, actual);
    }*/
}
