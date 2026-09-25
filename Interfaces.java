interface Payment {

    void pay();
}

class UPI implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment made using UPI");
    }
}

public class Interfaces {

    public static void main(String[] args) {

        Payment payment = new UPI();

        payment.pay();
    }
}
