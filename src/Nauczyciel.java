import java.util.ArrayList;
import java.util.List;

public class Nauczyciel {
    private String imie;
    private String nazwisko;
    private int wiek;
    private String przedmiot;
    static int liczbanauczycieli = 0;

    List<Kurs> kursy;

    public Nauczyciel(String imie, String nazwisko, int wiek, String przedmiot) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.przedmiot = przedmiot;
        this.kursy = new ArrayList<>();
        liczbanauczycieli++;
    }

    public void dodajkurs(Kurs kurs){
        kursy.add(kurs);
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getPrzedmiot() {
        return przedmiot;
    }

    public void setPrzedmiot(String przedmiot) {
        this.przedmiot = przedmiot;
    }

    @Override
    public String toString() {
        return "Nauczyciel{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ", przedmiot='" + przedmiot + '\'' +
                '}';
    }
    public static int podajliczbenauczycieli(){
        return liczbanauczycieli;
    }
}
