


public class Notebook extends BaseProduct{

    private int ram;
    private int storage;
    private double screenSize;


    public Notebook(int productId, String productName, double price, Brand brand, int discount, int stock, int ram, int storage, double screenSize) {
        super(productId, productName, price, brand, discount, stock);
        this.storage = storage;
        this.screenSize = screenSize;
        this.ram = ram;
    }




    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
}
