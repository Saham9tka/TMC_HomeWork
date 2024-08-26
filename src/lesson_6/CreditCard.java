package lesson_6;

class CreditCard {
    private String accountNumber;
    private double balance;

    public CreditCard(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Пополнение карты " + accountNumber + " на сумму " + amount);
        } else {
            System.out.println("Сумма пополнения должна быть положительной!");
        }
    }

    // Метод для снятия суммы с карточки
    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("Снятие с карты " + accountNumber + " суммы " + amount);
        } else {
            System.out.println("Недостаточно средств или неправильная сумма для снятия!");
        }
    }

    public void displayInfo() {
        System.out.printf("Карта %s: Баланс = %.2f\n", accountNumber, balance);
    }
}
