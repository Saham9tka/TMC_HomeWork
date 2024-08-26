package lesson_6;

class ATM {
    private int twenties , fifties, hundreds;

    public ATM(int twenties, int fifties, int hundreds) {
        this.twenties = twenties;
        this.fifties = fifties;
        this.hundreds = hundreds;
    }

    public void addBills(int twenties, int fifties, int hundreds) {
        this.twenties += twenties;
        this.fifties += fifties;
        this.hundreds += hundreds;
            System.out.println("Added: " + twenties + " Banknotes by 20, " + fifties + " Banknotes by 50, " + hundreds + " Banknotes by 100.");
    }

    public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("The amount must be positive!");
            return;
        }

        int originalAmount = amount;
        int numHundreds = Math.min(amount / 100, hundreds);
        amount -= numHundreds * 100;

        int numFifties = Math.min(amount / 50, fifties);
        amount -= numFifties * 50;

        int numTwenties = Math.min(amount / 20, twenties);
        amount -= numTwenties * 20;

        if (amount > 0) {
            System.out.println("Not enough bills to issue the amount: " + originalAmount);
            return;
        }

        hundreds -= numHundreds;
        fifties -= numFifties;
        twenties -= numTwenties;

            System.out.printf("Issued: %d купюра(ы) по 100, %d купюра(ы) по 50, %d купюра(ы) по 20\n", numHundreds, numFifties, numTwenties);
    }

    public void displayATMStatus() {
        System.out.println("Current status of the ATM:");
        System.out.printf("Banknotes by 20: %d\n", twenties);
        System.out.printf("Banknotes by 50: %d\n", fifties);
        System.out.printf("Banknotes by 100: %d\n", hundreds);
    }
}
