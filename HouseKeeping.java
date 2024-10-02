public class HouseKeeping implements HotelService {
    private int roomNumber;

    public HouseKeeping(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String serve() {
        return "Cleaning room number: " + roomNumber;
    }
}