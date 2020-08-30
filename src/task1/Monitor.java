package task1;

public class Monitor extends Device {
   private int resolutionX;
    private int resolutionY;


    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionY=resolutionY;
        this.resolutionX=resolutionX;
    }
    public String toString ()
    {
        return ("manufacturer:" + this.manufacturer + "price:" + price + "serialNumber:" + serialNumber + "X:" + resolutionX + "Y:" + resolutionY) ;
    }
    @Override
    public boolean equals(Object obj) {

        if (obj != null && obj.getClass() == this.getClass()) {
            Monitor dev = (Monitor) obj;
            boolean resolutionX = this.resolutionX == dev.resolutionX;
            boolean resolutionY = this.resolutionY == dev.resolutionY;
            return resolutionX & resolutionY;
        }

        return false;
    }

    @Override
    public int hashCode() {
        int result=37;
        result = 37 * result + resolutionX;
        result = 37 * result + resolutionY;
        return result;
    }
}
