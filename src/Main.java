import java.util.*;

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("Siyah İnci", 120, "Tom Bird", "2004");
        Book b2 = new Book("Zambak", 120, "Ali Veli", "2002");
        Book b3 = new Book("Gri Kurt", 156, "Tolga Bayram", "1998");
        Book b4 = new Book("Leyla", 72, "Tanrıverdi Ok", "1996");
        Book b5 = new Book("Gizemli Köşk", 99, "Ayşe Billur", "2023");
        Book b6 = new Book("Race", 118, "Jack London", "1986");
        Book b7 = new Book("The Dog", 450, "Lack London", "2020");
        Book b8 = new Book("Gezegen", 220, "Tomy Hilfigier", "2001");
        Book b9 = new Book("Ayşe", 56, "Brianna West", "1985");
        Book b10 = new Book("Manidar", 300, "Jenny Lord", "2006");

        TreeSet<Book> kitap = new TreeSet<>();
        kitap.add(b1);
        kitap.add(b2);
        kitap.add(b3);
        kitap.add(b4);kitap.add(b5);kitap.add(b6);kitap.add(b7);kitap.add(b8);
        kitap.add(b9);
        kitap.add(b10);


        for(Book i : kitap)
        {
            System.out.println(i.getName()+" - "+i.getYazar());
        }
        System.out.println("***************");

        HashSet<Book> kitap2 = new HashSet<>();
        kitap2.add(b1);
        kitap2.add(b2);
        kitap2.add(b3);
        kitap2.add(b4);
        kitap2.add(b5);
        kitap2.add(b6);
        kitap2.add(b7);
        kitap2.add(b4);

        kitap2.stream().filter(i->i.getSayfaNo()>100).forEach(y-> System.out.println(y.getName() + " : "+ y.getSayfaNo()));




    }

}