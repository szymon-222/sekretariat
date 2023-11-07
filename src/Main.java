import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    Szkola szkola = new Szkola();

    Nauczyciel n1 = new Nauczyciel("Adam","Adamowicz", 84,"Matematyka");
    Nauczyciel n2 = new Nauczyciel("Piotr","Piotrowski",20,"Fizyka");
    Nauczyciel n3 = new Nauczyciel("Marcin","Marcinowski",30,"Polski");
    Nauczyciel n4 = new Nauczyciel("Michał","Mach",40,"Muzyka");
    Nauczyciel n5 = new Nauczyciel("Kamil","Warak",55,"Historia");

    szkola.dodajnauczyciela(n1);
    szkola.dodajnauczyciela(n2);
    szkola.dodajnauczyciela(n3);
    szkola.dodajnauczyciela(n4);
    szkola.dodajnauczyciela(n5);

    Kurs kursmatematyki = new Kurs("Matematyka",n1);
    Kurs kursfizyczny = new Kurs("Fizyka",n2);
    Kurs kurspolskiego = new Kurs("Polski",n3);
    Kurs kursmuzyczny = new Kurs("Muzyka",n4);
    Kurs kurshistoryczny = new Kurs("Historia",n5);

    Uczen u1 = new Uczen("Marek","Markowicz",17, "1B");
    Uczen u2 = new Uczen("Wojciech","Wojciechowski",34, "2A");
    Uczen u3 = new Uczen("Paweł","Pawłowski",14, "4A");
    Uczen u4 = new Uczen("Michał","Michałowski",12, "2C");
    Uczen u5 = new Uczen("Dominik","Dominikowski",15, "1E");
    Uczen u6 = new Uczen("Borys","Borysowski",15, "1C");
    Uczen u7 = new Uczen("Adam","Dominikowski",15, "1E");
    Uczen u8 = new Uczen("Piotr","Dominikowski",15, "1E");
    Uczen u9 = new Uczen("Karol","Dominikowski",15, "1E");
    Uczen u10 = new Uczen("Karol","Karolowski",18, "2A");
    Uczen u11 = new Uczen("Michał","Michań",17, "4A");
    Uczen u12 = new Uczen("Piotr","Awalok",15, "3A");
    Uczen u13 = new Uczen("Tadeusz","Tarka",17, "1A");
    Uczen u14 = new Uczen("Mateusz","Dresowski",19, "4C");
    Uczen u15 = new Uczen("Kamil","Kawal",20, "3B");

    KlasaLekcyjna klasa1A = new KlasaLekcyjna("1A");
    KlasaLekcyjna klasa1B = new KlasaLekcyjna("1B");
    KlasaLekcyjna klasa2A = new KlasaLekcyjna("2A");
    KlasaLekcyjna klasa2B = new KlasaLekcyjna("2B");
    KlasaLekcyjna klasa3A = new KlasaLekcyjna("3A");

    klasa1A.przypiszNauczyciela(n1);
    klasa1A.przypiszNauczyciela(n2);
    klasa1B.przypiszNauczyciela(n3);
    klasa2A.przypiszNauczyciela(n4);
    klasa2B.przypiszNauczyciela(n5);

    u1.dodajkurs(kursfizyczny);
    u2.dodajkurs(kursmatematyki);
    u3.dodajkurs(kursmatematyki);
    u4.dodajkurs(kursmuzyczny);
    u5.dodajkurs(kursmatematyki);
    u6.dodajkurs(kurspolskiego);
    u7.dodajkurs(kurshistoryczny);
    u8.dodajkurs(kursfizyczny);
    u9.dodajkurs(kurspolskiego);
    u10.dodajkurs(kursfizyczny);
    u11.dodajkurs(kursmuzyczny);
    u12.dodajkurs(kurshistoryczny);
    u13.dodajkurs(kursfizyczny);
    u14.dodajkurs(kurspolskiego);
    u15.dodajkurs(kurshistoryczny);

    szkola.dodajucznia(u1);
    szkola.dodajucznia(u2);
    szkola.dodajucznia(u3);
    szkola.dodajucznia(u4);
    szkola.dodajucznia(u5);
    szkola.dodajucznia(u6);
    szkola.dodajucznia(u7);
    szkola.dodajucznia(u8);
    szkola.dodajucznia(u9);
    szkola.dodajucznia(u10);
    szkola.dodajucznia(u11);
    szkola.dodajucznia(u12);
    szkola.dodajucznia(u13);
    szkola.dodajucznia(u14);
    szkola.dodajucznia(u15);

    List<OsobaEdukacyjna> osoby = new ArrayList<>();
        osoby.add(new Uczen("Marek", "Markowicz", 17, "1B"));
        osoby.add(new Nauczyciel("Adam", "Adamowicz", 84, "Matematyka"));


        for (OsobaEdukacyjna osoba : osoby) {
            System.out.println("Imię: " + osoba.getImie());
            System.out.println("Nazwisko: " + osoba.getNazwisko());
            System.out.println("Wiek: " + osoba.getWiek());
        }

        System.out.println("Liczba uczniów: " + Uczen.podajliczbeuczniow());
        System.out.println("Liczba nauczycieli: " + Nauczyciel.podajliczbenauczycieli());

        szkola.posortujuczniowpoimieniu();
        System.out.println("Posortowani uczniowie: " + szkola.uczens);

        szkola.sortujnauczycielipoimieniu();
        System.out.println("Posortowani nauczyciele: " + szkola.nauczyciels);

        System.out.println("Nauczyciele w klasie 1A: " + klasa1A.getNauczyciele());


    }
}