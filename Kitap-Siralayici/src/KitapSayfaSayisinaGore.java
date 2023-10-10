import java.util.Comparator;

public class KitapSayfaSayisinaGore implements Comparator<Book> {

    @Override
    public int compare(Book i1, Book i2){
        return i1.getSayfaSayisi() + i2.getSayfaSayisi();
    }

}
