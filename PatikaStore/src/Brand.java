import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Brand {

    private int brandId;
    private String brandName;

    public Brand(int brandId, String brandName) {
        this.brandId = brandId;
        this.brandName = brandName;
    }

    public static List<Brand> getBrands() {
        List<Brand> brands = new ArrayList<>();
        brands.add(new Brand(1, "Samsung"));
        brands.add(new Brand(2, "Lenovo"));
        brands.add(new Brand(3, "Apple"));
        brands.add(new Brand(4, "Huawei"));
        brands.add(new Brand(5, "Casper"));
        brands.add(new Brand(6, "Asus"));
        brands.add(new Brand(7, "HP"));
        brands.add(new Brand(8, "Xiaomi"));
        brands.add(new Brand(9, "Monster"));

        return brands;
    }

    public static void printBrands() {
        var brands = getBrands();
        Collections.sort(brands, new Comparator<Brand>() {
            @Override
            public int compare(Brand o1, Brand o2) {
                return o1.brandName.compareTo(o2.brandName);
            }
        });
        for (int i = 0; i < brands.size(); i++) {
            System.out.println("Brand ID :" + brands.get(i).brandId + ", Brand Name :" + brands.get(i).brandName);

        }
    }


    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
