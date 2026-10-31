package session_4.assigment_problems;

class Payment {
    public double pay(double amount) {
        System.out.println("Paid (cash): Rs " + amount);
        return amount;
    }
}

class CardPayment extends Payment {
    public double payWithProcessingFee(double amount) {
        double fee = amount * 0.02;
        double totalCharged = amount + fee;
        System.out.println("Charged (card, incl. fee): Rs " + totalCharged);
        return totalCharged;
    }
}

public class CanteenPaymentSettlement {
    private double totalCollected = 0.0;

    public void processTransaction(Payment payment, double amount) {
        if (payment instanceof CardPayment) {
            CardPayment cardPayment = (CardPayment) payment;
            this.totalCollected += cardPayment.payWithProcessingFee(amount);
        } else {
            this.totalCollected += payment.pay(amount);
        }
    }

    public double getTotalCollected() {
        return this.totalCollected;
    }

    public static void executeNightlyBatchRun() {
        Payment[] payments = {
            new CardPayment(),
            new Payment(),
            new CardPayment(),
            new Payment(),
            new CardPayment()
        };
        double[] amounts = {100.0, 50.0, 200.0, 75.0, 120.0};

        CanteenPaymentSettlement settlement = new CanteenPaymentSettlement();

        for (int i = 0; i < payments.length; i++) {
            settlement.processTransaction(payments[i], amounts[i]);
        }

        System.out.println("Total Collected: Rs " + settlement.getTotalCollected());
    }

    public static void main(String[] args) {
        executeNightlyBatchRun();
    }
}
