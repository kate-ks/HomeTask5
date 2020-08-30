package task1;

import java.util.Objects;

public class Device {
    protected String manufacturer;
    protected float price;
    protected String serialNumber;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String toString ()
    {
        return ("manufacturer:" + manufacturer + "price:" + price + "serialNumber:" + serialNumber) ;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj != null && obj.getClass() == this.getClass()) {
            Device dev = (Device) obj;
            boolean manufacturer = this.manufacturer == dev.manufacturer;
            boolean price = this.price == dev.price;
            boolean serialNumber = this.serialNumber == dev.serialNumber;
            return manufacturer & price & serialNumber;
        }

        return false;
    }

    @Override
    public int hashCode() {
        int result=37;
        result = 37 * result + manufacturer.hashCode();
        result = 37 * result + serialNumber.hashCode();
        result = 37 * result + Float.floatToRawIntBits(price);
        return result;
    }
}
