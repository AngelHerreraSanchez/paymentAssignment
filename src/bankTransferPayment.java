public class bankTransferPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println("Bank transfer payment of " + amount + " processed");
    }
}
