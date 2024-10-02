public class HotelApp {

    public static void main(String[] args) {
        HotelService valet = new Valet("KYR 208");
        HotelService houseKeeping = new HouseKeeping(28);
        HotelService cart = new Cart(8);

        FrontDesk frontDesk = new FrontDesk(valet, houseKeeping, cart);

        System.out.println(frontDesk.valetService());
        System.out.println(frontDesk.houseKeepingService());
        System.out.println(frontDesk.cartService());  
    }
}