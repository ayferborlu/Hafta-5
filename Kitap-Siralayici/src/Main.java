import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("Hayal", 185, "Ayşe Kulin", 2023);
        Book b2 = new Book("Veda", 250, "Ayşe Kulin", 2022);
        Book b3 = new Book("Kaplanın Sırtında", 300, "Zülfü Livaneli", 2022);
        Book b4 = new Book("Dünyanın En Pis Sokağı", 130, "Tarık Buğra", 2020);
        Book b5 = new Book("Kök", 126, "Alp Paksoy", 2019);

        // A'dan Z'ye isme göre sıralama işlemi

        TreeSet<Book> books = new TreeSet<>(new KitapIsmineGore());
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);
//Tekrarlayıcı (iterator) List ve Set koleksiyonları üzerinde, bütün öğeleri tarayacak biçimde tekrarlanan eylemleri gerçekleştirmek için kullanılır.

        Iterator<Book> itr = books.iterator();
        System.out.println("A dan Z ye Sıralama: ");
        while (itr.hasNext()) {
            System.out.println(itr.next().getKitapIsmi());
        }

        System.out.println();
        // Kitap sayfa sayısına göre sıralama işlemi

        TreeSet<Book> books2 = new TreeSet<>(new KitapSayfaSayisinaGore());
        books2.add(b1);
        books2.add(b2);
        books2.add(b3);
        books2.add(b4);
        books2.add(b5);

        for( Book book:books2){
            System.out.println(book.getKitapIsmi()+" Sayfa Sayısı:  "+book.getSayfaSayisi());
    }
}}