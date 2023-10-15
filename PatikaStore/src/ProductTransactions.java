import mobilePhone.mobilePhone;

import java.util.*;
import java.util.Iterator;
import java.util.Scanner;





public class ProductTransactions {

    static ArrayList<Notebook> notebooks = new ArrayList<>();
    static ArrayList<MobilePhone> mobilePhones = new ArrayList<>();

    public void addNotebook( Notebook notebook){
        notebooks.add(notebook);
    }
    public void addMobilePhone( MobilePhone mobilePhone){
        mobilePhones.add(mobilePhone);
    }

    //Kullanıcı ürünleri benzersiz numaralarına göre silebilmeli.

    public void removeProduct(){
        System.out.println("Lütfen silmek istediğiniz ürün kategorisini seçin");
        System.out.println("1---Notebook");
        System.out.println("2---Telefon");
        Scanner input = new Scanner(System.in);
        int categoryNum = input.nextInt();

        if(categoryNum ==1){
            System.out.print("Id: ");
            int id = input.nextInt();
            Iterator<Notebook> iterator= notebooks.iterator();

            while (iterator.hasNext()){
                Notebook notebook = iterator.next();
                if(notebook.getProductId() == id){
                    iterator.remove();
                    System.out.println("Silme işlemi gerçekleşti");
                }
            }
           printNotebooks();

        }else if( categoryNum == 2){
            System.out.print("Id: ");
            int id = input.nextInt();
            Iterator<MobilePhone> iterator = mobilePhones.iterator();

            while (iterator.hasNext()) {
                MobilePhone phone = iterator.next();
                if (phone.getProductId() == id) {
                    iterator.remove(); // Güvenli bir şekilde koleksiyonu değiştir
                    System.out.println("Silme işlemi gerçekleşti");

                }

            }
          printMobilePhone();

        }

    }



    //Kullanıcı ürün ekleyebilmeli
    public void addProduct(){
        System.out.println("Eklemek istediğiniz ürün kategorisini seçin");
        System.out.println("1---Notebook");
        System.out.println("2---Telefon");
        Scanner input = new Scanner(System.in);
        int categoryNum = input.nextInt();

        if( categoryNum ==1) {

            System.out.print("id: ");
            int id = input.nextInt();

            System.out.print("Ürün ismi: ");
            String productName = input.next();

            System.out.print("Fiyat: ");
            double price = input.nextDouble();



            System.out.print("İndirim oranı: ");
            int discount = input.nextInt();

            System.out.print("Stok adeti: ");
            int stock = input.nextInt();

            System.out.print("Depolama: ");
            int storage = input.nextInt();

            System.out.print("Ekran boyutu: ");
            double screenSize = input.nextDouble();

            System.out.print("Ram: ");
            int ram = input.nextInt();


            Notebook computer = new Notebook(id, productName, price, BrandManager.getBrands().get(id), discount, stock, storage, (int) screenSize, ram);
            if (idCheckForPC(id)) {

                System.out.println("Ekleme başarılı");
                notebooks.add(computer);
                printNotebooks();
            } else {
                System.out.println("id çakışması sebebi ile eklenemedi");
            }
        } else if (categoryNum == 2) {//telefon

            System.out.print("id:");
            int id = input.nextInt();
            System.out.print("Ürün ismi:");
            String productName = input.next();
            System.out.print("Fiyat:");
            double price = input.nextDouble();
            System.out.print("marka id:");
            int brandId = input.nextInt();
            System.out.print("İndirim oranı:");
            int discount = input.nextInt();
            System.out.print("Stok adedi:");
            int stock = input.nextInt();
            System.out.print("Depolama:");
            int storage = input.nextInt();
            System.out.print("Ekran boyutu:");
            double screenSize = input.nextInt();
            System.out.print("Kamera:");
            int camera = input.nextInt();
            System.out.print("Batarya:");
            double battery = input.nextDouble();
            System.out.print("Ram:");
            int ram = input.nextInt();
            System.out.print("Renk:");
            String color = input.next();


            MobilePhone mobilePhone = new MobilePhone(id, productName, price, BrandManager.brands.get(brandId), discount, stock, storage, screenSize,camera,battery, ram, color);

            if (idCheckForPhone(id)) {
                System.out.println("Ekleme başarılı");
                mobilePhones.add(mobilePhone);
                printMobilePhone();
            } else {
                System.out.println("id çakışması sebebi ile eklenemedi");
            }

        }

    }

    public boolean idCheckForPC(int id) {
        for (Notebook computer : notebooks
        ) {
            if (computer.getProductId() == id) {
                return false;
            }
        }
        return true;
    }

    public boolean idCheckForPhone(int id) {
        for (MobilePhone phone : mobilePhones
        ) {
            if (phone.getProductId() == id) {
                return false;
            }
        }
        return true;
    }

    public void printNotebooks() {

        ArrayList<Notebook> brandNotebooks = new ArrayList<>(notebooks);
        Comparator<Notebook> brandNotebook = new Comparator<Notebook>() {
            @Override
            public int compare(Notebook o1, Notebook o2) {
                return Integer.compare(o1.getProductId(), o2.getProductId());
            }
        };

        brandNotebooks.sort(brandNotebook);


        System.out.println("Notebook Listesi");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |");
        System.out.println("----------------------------------------------------------------------------------------------------");
        for (Notebook computer : brandNotebooks) {
            System.out.format("| %-2d | %-30s | %-9.1f TL | %-9s | %-9d | %-6.1f | %-11d |%n",
                    computer.getProductId(),
                    computer.getProductName(),
                    computer.getPrice(),
                    computer.getBrand().getBrandName(),
                    computer.getStorage(),
                    computer.getScreenSize(),
                    computer.getRam());

        }
        System.out.println("----------------------------------------------------------------------------------------------------");
    }

    public void printComputersSortBrand() {
        ArrayList<Notebook> brandComputers = new ArrayList<>(notebooks);
        Comparator<Notebook> brandComputer = new Comparator<Notebook>() {
            @Override
            public int compare(Notebook o1, Notebook o2) {
                return o1.getBrand().getBrandName().compareTo(o2.getBrand().getBrandName());
            }
        };

        brandComputers.sort(brandComputer);

        System.out.println("Notebook Listesi(Marka)");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |");
        System.out.println("----------------------------------------------------------------------------------------------------");
        for (Notebook computer : brandComputers) {
            System.out.format("| %-2d | %-30s | %-9.1f TL | %-9s | %-9d | %-6.1f | %-11d |%n",
                    computer.getProductId(),
                    computer.getProductName(),
                    computer.getPrice(),
                    computer.getBrand().getBrandName(),
                    computer.getStorage(),
                    computer.getScreenSize(),
                    computer.getRam());

        }
        System.out.println("----------------------------------------------------------------------------------------------------");

    }

    public void printMobilePhone() {

        ArrayList<MobilePhone> brandPhones = new ArrayList<>(mobilePhones);
        Comparator<MobilePhone> brandPhone = new Comparator<MobilePhone>() {
            @Override
            public int compare(MobilePhone o1, MobilePhone o2) {
                return Integer.compare(o1.getProductId(), o2.getProductId());
            }
        };


        brandPhones.sort(brandPhone);


        System.out.println("Telefon Listesi(ID)");
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | Kamera    | Pil       | RAM       | Renk      | ");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        for (MobilePhone phone : brandPhones) {
            System.out.format("| %-2d | %-30s | %-9.1fTL | %-9s | %-9d | %-6.1f | %-8d | %-9.1f | %-9d | %-9s |%n",
                    phone.getProductId(),
                    phone.getProductName(),
                    phone.getPrice(),
                    phone.getBrand().getBrandName(),
                    phone.getStorage(),

                    phone.getRam(),
                    phone.getColor());

        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");

    }

    public void printPhonesSortBrand() {
        ArrayList<MobilePhone> brandPhones = new ArrayList<>(mobilePhones);
        Comparator<MobilePhone> brandPhone = new Comparator<MobilePhone>() {
            @Override
            public int compare(MobilePhone o1, MobilePhone o2) {
                return o1.getBrand().getBrandName().compareTo(o2.getBrand().getBrandName());
            }
        };


        brandPhones.sort(brandPhone);
        System.out.println("Telefon Listesi(Marka)");
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | Kamera    | Pil       | RAM       | Renk      | ");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
        for (MobilePhone phone : brandPhones) {
            System.out.format("| %-2d | %-30s | %-9.1fTL | %-9s | %-9d | %-6.1f | %-8d | %-9.1f | %-9d | %-9s |%n",
                    phone.getProductId(),
                    phone.getProductName(),
                    phone.getPrice(),
                    phone.getBrand().getBrandName(),
                    phone.getStorage(),

                    phone.getRam(),
                    phone.getColor());

        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------");
    }



}

