public class Valet implements HotelService {
    private String plateNumber;

    public Valet(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public String serve() {
        return "Picking up vehicle with plate number: " + plateNumber;
    }
}
