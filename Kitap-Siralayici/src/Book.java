public class Book {
    private String KitapIsmi;
    private int SayfaSayisi;
    private String YazarIsmi;
    private int YayinTarihi;

    public Book(String kitapIsmi, int sayfaSayisi, String yazarIsmi, int yayinTarihi) {
        KitapIsmi = kitapIsmi;
        SayfaSayisi = sayfaSayisi;
        YazarIsmi = yazarIsmi;
        YayinTarihi = yayinTarihi;
    }

    public String getKitapIsmi() {
        return KitapIsmi;
    }

    public void setKitapIsmi(String kitapIsmi) {
        KitapIsmi = kitapIsmi;
    }

    public int getSayfaSayisi() {
        return SayfaSayisi;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        SayfaSayisi = sayfaSayisi;
    }

    public String getYazarIsmi() {
        return YazarIsmi;
    }

    public void setYazarIsmi(String yazarIsmi) {
        YazarIsmi = yazarIsmi;
    }

    public int getYayinTarihi() {
        return YayinTarihi;
    }

    public void setYayinTarihi(int yayinTarihi) {
        YayinTarihi = yayinTarihi;
    }
}
