import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Szkola {
    List<Uczen> uczens;
    List<Nauczyciel> nauczyciels;

    public Szkola(){
        uczens = new ArrayList<>();
        nauczyciels = new ArrayList<>();
    }

    public void dodajucznia(Uczen uczen){
        uczens.add(uczen);
    }

    public void dodajnauczyciela(Nauczyciel nauczyciel){
        nauczyciels.add(nauczyciel);
    }

    public void usunucznia(String imie, String nazwisko){
        uczens.removeIf(uczen -> uczen.getImie().equals(imie) && uczen.getNazwisko().equals(nazwisko));
    }

    public Uczen znajdzucznia(String imie){
        Optional<Uczen> uczenOptional = uczens.stream().filter(s -> s.getImie().equals(imie)).findFirst();
        return uczenOptional.orElse(null);
    }

    public void posortujuczniowpoimieniu(){
        uczens.sort(Comparator.comparing(Uczen::getImie));
    }

    public void usunNauczyciela(String imie, String nazwisko){
        for (var nauczyciel: nauczyciels) {
            if (nauczyciel.getImie().equals(imie) && nauczyciel.getNazwisko().equals(nazwisko)) uczens.remove(nauczyciel);
        }
    }

    public Nauczyciel znajdznauczyciela(String imie){
        Optional<Nauczyciel> nauczycielOptional = nauczyciels.stream().filter(t -> t.getImie().equals(imie)).findFirst();
        return nauczycielOptional.orElse(null);
    }

    public void sortujnauczycielipoimieniu(){
        nauczyciels.sort(Comparator.comparing(Nauczyciel::getImie));
    }




}
