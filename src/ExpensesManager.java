public class ExpensesManager {

    double[] expenses;

    public ExpensesManager(double[] expenses) {
        this.expenses = expenses;
    }

    double saveExpense(double moneyBeforeSalary, double expense, int day) {
        moneyBeforeSalary -= expense;
        expenses[day - 1] = expenses[day - 1] + expense;
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
        if (moneyBeforeSalary < 1000) {
            System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
        }
        return moneyBeforeSalary;
    }

    double findMaxExpense() {
        double maxExpense = 0;
        for (double expense : expenses) {
            if (expense > maxExpense) {
                maxExpense = expense;
            }
        }
        return maxExpense;
    }

    void printAllExpenses() {
        for (int i = 0; i < expenses.length; i++) {
            System.out.println("День " + (i + 1) + ". Потрачено " + expenses[i] + " рублей");
        }
    }
}