import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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


    KlasaLekcyjna A1 = new KlasaLekcyjna("1A");
    KlasaLekcyjna C1 = new KlasaLekcyjna("1C");
    KlasaLekcyjna E1 = new KlasaLekcyjna("1E");
    KlasaLekcyjna A2 = new KlasaLekcyjna("2A");
    KlasaLekcyjna C2 = new KlasaLekcyjna("2C");
    KlasaLekcyjna A3 = new KlasaLekcyjna("3A");
    KlasaLekcyjna B3 = new KlasaLekcyjna("3B");
    KlasaLekcyjna A4 = new KlasaLekcyjna("4A");
    KlasaLekcyjna C4 = new KlasaLekcyjna("4C");

    A1.przypiszUcznia(u13);
    C1.przypiszUcznia(u6);
    E1.przypiszUcznia(u5);
    E1.przypiszUcznia(u7);
    E1.przypiszUcznia(u8);
    E1.przypiszUcznia(u9);
    A2.przypiszUcznia(u2);
    C2.przypiszUcznia(u4);
    A3.przypiszUcznia(u12);
    B3.przypiszUcznia(u15);
    A4.przypiszUcznia(u3);
    A4.przypiszUcznia(u11);
    C4.przypiszUcznia(u14);


    A1.przypiszNauczyciela(n1);
    E1.przypiszNauczyciela(n2);
    C1.przypiszNauczyciela(n3);
    A2.przypiszNauczyciela(n4);
    C2.przypiszNauczyciela(n5);
    A3.przypiszNauczyciela(n3);
    B3.przypiszNauczyciela(n2);
    A4.przypiszNauczyciela(n1);
    C4.przypiszNauczyciela(n4);


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

        System.out.println("Nauczyciele w klasie 1A: " + A1.getNauczyciele());


        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj w panelu sterowania szkołą");

        int wybor;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Wyświetl uczniów");
            System.out.println("2. Wyświetl nauczycieli");
            System.out.println("3. Wyświetl liczby uczniów i nauczycieli");
            System.out.println("4. Wyświetl nauczycieli danej dyscypliny");
            System.out.println("5. Wyświetl uczniów danego przedmiotu");
            System.out.println("6. Statystyki średniego wieku uczniów i nauczycieli");
            System.out.println("7. Najstarszy uczeń");
            System.out.println("8. Najmłodszy nauczyciel");
            System.out.println("0. Wyjście");
            System.out.print("Twój wybór: ");

            wybor = scanner.nextInt();

            switch (wybor) {
                case 1:
                    szkola.wyswietlUczniowKlasy();
                    break;

                case 2:
                    szkola.wyswietlNauczycieli();
                    break;

                case 3:
                    System.out.println("Liczba uczniów: " + Uczen.podajliczbeuczniow());
                    System.out.println("Liczba nauczycieli: " + Nauczyciel.podajliczbenauczycieli());
                    break;

                case 4:
                    System.out.print("Podaj dyscyplinę (np. Matematyka): ");
                    String dyscyplina = scanner.next();
                    szkola.wyswietlNauczycieliDyscypliny(dyscyplina);
                    break;

                case 5:
                    System.out.print("Podaj przedmiot (np. Fizyka): ");
                    String przedmiot = scanner.next();
                    szkola.wyswietlUczniowPrzedmiotu(przedmiot);
                    break;
                case 6:
                    System.out.println("Statystyki średniego wieku uczniów i nauczycieli:");
                    System.out.println("Średni wiek uczniów: " + szkola.obliczSredniWiekUczniow());
                    System.out.println("Średni wiek nauczycieli: " + szkola.obliczSredniWiekNauczycieli());
                    break;

                case 7:
                    System.out.println("Najstarszy uczeń:");
                    System.out.println(szkola.znajdzNajstarszegoUcznia());
                    break;

                case 8:
                    System.out.println("Najmłodszy nauczyciel:");
                    System.out.println(szkola.znajdzNajmlodszegoNauczyciela());
                    break;
                case 0:
                    System.out.println("Wyjście z programu.");
                    break;

                default:
                    System.out.println("Nieprawidłowy wybór. Spróbuj ponownie.");
            }

        } while (wybor != 0);

        scanner.close();
    }

    }
