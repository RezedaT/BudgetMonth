import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.services.BudgetService.BudgetService;

public class BudgetServiceTest {
    @ParameterizedTest
//    @CsvSource({
//            "3, 10000, 3000, 20000",
//            "2, 100000, 60000, 150000"
//    })
    @CsvFileSource(files ="src/test/resources/BudgetService.csv")
    void shouldCalculateMonth3(int expected, int income, int expense, int threshold) {
        BudgetService service = new BudgetService();
        // подготавливаем данные:
//        int income = 10_000;
//        int expense = 3_000;
//        int threshold = 20_000;
//        int expected = 3;
        // вызываем целевой метод:
        int actual = service.calculate(income, expense, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    void shouldCalculateMonth2() {
//        BudgetService service = new BudgetService();
//        // подготавливаем данные:
//        int income = 100_000;
//        int expense = 60_000;
//        int threshold = 150_000;
//        int expected = 2;
//        // вызываем целевой метод:
//        int actual = service.calculate(income, expense, threshold);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        Assertions.assertEquals(expected, actual);
//    }
}
