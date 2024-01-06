package ru.netology.services.BudgetService;

public class BudgetService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int count = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // отдых
                money -= expenses;
                money /= 3;
                count++;
            } else {
                // работа
                money += income;
                money -= expenses;
            }
        }
        return count;

    }
}