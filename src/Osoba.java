public class Osoba {
    //zmienne klasy Osoba
    private int id;
    private String imie_osoby;
    static int counter = 0;

    //konstruktor bezparametrowy
    Osoba(){
        this.id = 0;
        this.imie_osoby = "";
        counter++;
    }

    //konstruktor z 2 parametrami
    Osoba(int id, String imie_osoby){
        this.id = id;
        this.imie_osoby = imie_osoby;
        counter++;
    }

    //konstruktor kopiujący
    Osoba(Osoba osoba){
        this.id = osoba.id;
        this.imie_osoby = osoba.imie_osoby;
        counter++;
    }

    //metoda wypisująca dane i sprawdzająca czy podano dane
    public void Wypisz(String imie_osoby){
        if(this.imie_osoby==""){
            System.out.println("Brak danych");
        }else{
            System.out.println("Cześć " + imie_osoby +", mam na imię " + this.imie_osoby)
            ;
        }


    }

}
