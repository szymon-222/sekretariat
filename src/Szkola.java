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

    public void wyswietlUczniowKlasy() {
        for (Uczen uczen : uczens) {
            System.out.println(uczen);
        }
    }

    public void wyswietlNauczycieli() {
        for (Nauczyciel nauczyciel : nauczyciels) {
            System.out.println(nauczyciel);
        }
    }
    public void wyswietlNauczycieliDyscypliny(String dyscyplina) {
        for (Nauczyciel nauczyciel : nauczyciels) {
            if (nauczyciel.getPrzedmiot().equalsIgnoreCase(dyscyplina)) {
                System.out.println(nauczyciel);
            }
        }
    }

    public void wyswietlUczniowPrzedmiotu(String przedmiot) {
        for (Uczen uczen : uczens) {
            if (uczen.pokaznazwekursu().contains(przedmiot)) {
                System.out.println(uczen);
            }
        }
    }
    public double obliczSredniWiekUczniow() {
        if (uczens.isEmpty()) {
            return 0.0;
        }

        double sumaWieku = 0.0;
        for (Uczen uczen : uczens) {
            sumaWieku += uczen.getWiek();
        }

        return sumaWieku / uczens.size();
    }

    public double obliczSredniWiekNauczycieli() {
        if (nauczyciels.isEmpty()) {
            return 0.0;
        }

        double sumaWieku = 0.0;
        for (Nauczyciel nauczyciel : nauczyciels) {
            sumaWieku += nauczyciel.getWiek();
        }

        return sumaWieku / nauczyciels.size();
    }

    public Uczen znajdzNajstarszegoUcznia() {
        if (uczens.isEmpty()) {
            return null;
        }

        Uczen najstarszyUczen = uczens.get(0);
        for (Uczen uczen : uczens) {
            if (uczen.getWiek() > najstarszyUczen.getWiek()) {
                najstarszyUczen = uczen;
            }
        }

        return najstarszyUczen;
    }

    public Nauczyciel znajdzNajmlodszegoNauczyciela() {
        if (nauczyciels.isEmpty()) {
            return null;
        }

        Nauczyciel najmlodszyNauczyciel = nauczyciels.get(0);
        for (Nauczyciel nauczyciel : nauczyciels) {
            if (nauczyciel.getWiek() < najmlodszyNauczyciel.getWiek()) {
                najmlodszyNauczyciel = nauczyciel;
            }
        }

        return najmlodszyNauczyciel;
    }





}
