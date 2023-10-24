public class Kurs {
    String nazwa;
    Nauczyciel nauczyciel;

    public Kurs(String nazwa, Nauczyciel nauczyciel) {
        this.nazwa = nazwa;
        this.nauczyciel = nauczyciel;
    }

    public String getNazwa() {
        return nazwa;
    }
}
