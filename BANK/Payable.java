package BANK;

public interface Payable {
    public double calRemainingBalance();

    public void ProcessPayment();

    public void generatePaymentReceipt();

}
