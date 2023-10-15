public class MobilePhone extends BaseProduct{

    private int storage;
    private double screenSize;
    private double batteryPower;
    private int ram;
    private String color;


    public MobilePhone(int productId, String productName, double price, Brand brand, int discount, int stock, int storage, double screenSize, double batteryPower, double battery, int ram, String color) {
        super(productId, productName, price, brand, discount, stock);
        this.storage = storage;
        this.screenSize = screenSize;
        this.batteryPower = batteryPower;
        this.ram = ram;
        this.color = color;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getScreensize() {
        return screenSize;
    }

    public void setScreensize(double screensize) {
        this.screenSize = screensize;
    }

    public double getBatterypower() {
        return batteryPower;
    }

    public void setBatterypower(double batterypower) {
        this.batteryPower = batterypower;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
