import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Liczba zarejestrowanych osób to " + Osoba.counter);

        //obiekt utworzony przy pomocy konstruktora bezparametrowego
        Osoba osoba1 = new Osoba();
        osoba1.Wypisz("Jan");

        //Dane wpisywane z klawiatury potrzebne do obiektu osoba2
        System.out.print("Podaj id: ");
        int id = scanner.nextInt();

        System.out.print("Podaj imię: ");
        String imie = scanner.next();

        //obiekt utworzony przy pomocy konstruktora z podanymi 2 parametrami
        Osoba osoba2 = new Osoba(id,imie);
        osoba2.Wypisz("Jan");

        //obiekt utworzony przy pomocy konstruktora kopiującego
        Osoba osoba3 = new Osoba(osoba2);
        osoba3.Wypisz("Jan");

        System.out.println("Liczba zarejestrowanych osób to " + Osoba.counter);
        //

    }
}
