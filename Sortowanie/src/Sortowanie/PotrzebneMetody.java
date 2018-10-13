package Sortowanie;

public interface PotrzebneMetody {

    void addToList(int liczba);
    //Metoda dodajaca liczby do listy

    void showList();
    //Metoda pokazująca listę

    /*
        M - najMniejsza
        W - najWiększa
         */

    void sortMW();
    //Sortowanie od najmniejszej do największej


    void sortWM();
    //Sortowanie od największej do najmniejszej

}
