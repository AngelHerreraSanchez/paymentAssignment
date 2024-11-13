public class payPalPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("PayPal payment of " + amount + " processed");
    }
}
