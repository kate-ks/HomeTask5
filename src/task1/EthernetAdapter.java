package task1;

public class EthernetAdapter extends Device{
    private int speed;

    private String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber) {
        super(manufacturer, price, serialNumber);
    }


    public boolean equals(Object obj) {

        if (obj != null && obj.getClass() == this.getClass()) {
            EthernetAdapter dev = (EthernetAdapter) obj;
            boolean speed = this.speed == dev.speed;
            boolean mac = this.mac == dev.mac;
            return speed & mac;
        }

        return false;
    }

    @Override
    public int hashCode() {
        int result=37;
        result = 37 * result + speed;
        result = 37 * result + mac.hashCode();
        return result;
    }
}
