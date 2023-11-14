import java.util.ArrayList;
import java.util.List;

public class KlasaLekcyjna {
    private String nazwa;
    private List<Nauczyciel> nauczyciele;
    private List<Uczen> uczniowie;

    public KlasaLekcyjna(String nazwa) {
        this.nazwa = nazwa;
        this.nauczyciele = new ArrayList<>();
        this.uczniowie = new ArrayList<>();
    }

    public void przypiszUcznia(Uczen uczen){
        uczniowie.add(uczen);
    }
    public List<Uczen> getUczniowie(){
        return uczniowie;
    }

    public void przypiszNauczyciela(Nauczyciel nauczyciel) {
        nauczyciele.add(nauczyciel);
    }

    public List<Nauczyciel> getNauczyciele() {
        return nauczyciele;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setNauczyciele(List<Nauczyciel> nauczyciele) {
        this.nauczyciele = nauczyciele;
    }

    public void setUczniowie(List<Uczen> uczniowie) {
        this.uczniowie = uczniowie;
    }
}
