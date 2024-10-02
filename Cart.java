public class Cart implements HotelService {
    private int numberOfCarts;

    public Cart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
    }

    @Override
    public String serve() {
        return "Requesting " + numberOfCarts + " luggage cart(s).";
    }
}