import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Book implements Comparable<Book>{

    private String name;
    private int sayfaNo;
    private String yazar;
    private String yayınTarihi;

    Book(String name, int sayfaNo, String yazar, String yayınTarihi){

        this.name = name;
        this.sayfaNo=sayfaNo;
        this.yazar= yazar;
        this.yayınTarihi=yayınTarihi;
    }

    public String getName() {
        return name;
    }

    public int getSayfaNo() {
        return sayfaNo;
    }

    public String getYazar() {
        return yazar;
    }

    public String getYayınTarihi() {
        return yayınTarihi;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSayfaNo(int sayfaNo) {
        this.sayfaNo = sayfaNo;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    public void setYayınTarihi(String yayınTarihi) {
        this.yayınTarihi = yayınTarihi;
    }




    @Override
    public int compareTo(Book o)
    {
        return getName().compareTo(o.getName());



    }
}
