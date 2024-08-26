package lesson_6;

// Главный класс
public class MyMain {
    public static void main(String[] args) {

        CreditCard card1 = new CreditCard("9864128942", 1000.00);
        CreditCard card2 = new CreditCard("8923235678", 500.00);
        CreditCard card3 = new CreditCard("6789428239", 300.00);

        card1.deposit(200.00);
        card2.deposit(150.00);
        card3.withdraw(50.00);

        card1.displayInfo();
        card2.displayInfo();
        card3.displayInfo();

        ATM atm = new ATM(10, 5, 3);
        atm.displayATMStatus();

        atm.addBills(5, 5, 2);
        atm.displayATMStatus();

        System.out.println("Попытка снять 270:");
        atm.withdraw(270);
        atm.displayATMStatus();

        System.out.println("Попытка снять 1000:");
        atm.withdraw(1000);
    }
}