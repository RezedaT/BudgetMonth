import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.BudgetService.BudgetService;

public class BudgetServiceTest {
    @Test
    void shouldCalculateMonth3() {
        BudgetService service = new BudgetService();
// подготавливаем данные:
        int income = 10_000;
        int expense = 3_000;
        int threshold = 20_000;
        int expected = 3;
        // вызываем целевой метод:
        int actual = service.calculate(income, expense, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonth2() {
        BudgetService service = new BudgetService();
// подготавливаем данные:
        int income = 100_000;
        int expense = 60_000;
        int threshold = 150_000;
        int expected = 2;
        // вызываем целевой метод:
        int actual = service.calculate(income, expense, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}
