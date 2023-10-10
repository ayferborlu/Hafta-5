import java.util.Comparator;

public class KitapIsmineGore implements Comparator<Book> {

    @Override
    public int compare(Book i1, Book i2){
        return i1.getKitapIsmi().compareTo(i2.getKitapIsmi());
    }
}

