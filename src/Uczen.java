import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Uczen implements OsobaEdukacyjna {
    private String imie;
    private String nazwisko;
    private int wiek;
    private String klasa;
    static int liczbauczniow = 0;

    List<Kurs> kursy;

    public Uczen(String imie, String nazwisko, int wiek, String klasa) {
        if (imie == null || imie.isEmpty() || nazwisko == null || nazwisko.isEmpty() || wiek < 0 || wiek > 120) {
            throw new IllegalArgumentException("Nieprawidłowe dane ucznia");
        }

        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.klasa = klasa;
        this.kursy = new ArrayList<>();
        liczbauczniow++;
    }

    public void dodajkurs(Kurs kurs){
        kursy.add(kurs);
    }

    public List<String> pokaznazwekursu(){
        return kursy.stream().map(Kurs::getNazwa).collect(Collectors.toList());
    }

    @Override
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    @Override
    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getKlasa() {
        return klasa;
    }

    public void setKlasa(String klasa) {
        this.klasa = klasa;
    }

    @Override
    public String toString() {
        return "Uczen{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ", klasa='" + klasa + '\'' +
                '}';
    }

    public static int podajliczbeuczniow(){
        return liczbauczniow;
    }
}
