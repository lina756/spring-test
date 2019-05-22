class Merchant {

    public Number actionPrice(double price) {
        return price * 0.8;
    }

}

public class NaiveMerchant extends Merchant {

    public Double actionPrice(double price) {
        return 0.7 * price;
    }

    public static void main(String[] args) {
        Merchant merchant = new NaiveMerchant();
        Number price = merchant.actionPrice(1);
        System.out.println(price);
    }

}
