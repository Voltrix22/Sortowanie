package Sortowanie;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        boolean zakonczenie = true;
        int liczbaDoPodania = 1;
        int liczba;
        int wybor;

        Scanner input = new Scanner(System.in);

        Sortowanie sort = new Sortowanie();

        System.out.println("WITAJ W MASZYNIE DO SORTOWANIA LICZB");
        System.out.println("------------------------------------");
        System.out.println();
        System.out.println("Podaj 10 liczb w przedziale od -100 do 100");
        System.out.println("--------------");

        //PODANIE LICZB TO LISTY
        while (sort.listaZasadnicza.size() != 10) {

            System.out.println("Liczba "+liczbaDoPodania+" : ");
            try {
                liczba = input.nextInt();

            }
            catch (InputMismatchException e){
                liczba = 1000;
                input.nextLine();
            }
            if(!sort.listaZasadnicza.contains(liczba)&&(liczba>=-100&&liczba<=100)){
                sort.addToList(liczba);
                liczbaDoPodania++;
            }
            else {
                System.out.println();
                System.out.println("ZOSTAŁA PODANA ZŁA CYFRA/ZNAK LUB CYFRA JUŻ ISTNIEJE W LIŚCIE");
            }
            System.out.println("--------------");
        }

        //MENU WYBORÓW
        while (zakonczenie) {
            System.out.println();
            System.out.println("Co chcesz zrobic?");
            System.out.println();
            System.out.println("1 - pokaż listę liczb w kolejności podanej przez ciebie");
            System.out.println("2 - pokaż listę liczb podanych przez ciebie w kolejności od najmniejszej do największej");
            System.out.println("3 - pokaż listę liczb podanych przez ciebie w kolejności od największej do najmniejszej");
            System.out.println("4 - zakończenie programu");

            try {
                wybor = input.nextInt();
            }
            catch(InputMismatchException e) {
                input.nextLine();
                wybor = 0;
            }

            switch (wybor) {
                case 1:
                    sort.showList();
                    break;
                case 2:
                    sort.sortMW();
                    break;
                case 3:
                    sort.sortWM();
                    break;
                case 4:
                    zakonczenie = false;
                    System.out.println();
                    System.out.println("-------------------------------------");
                    System.out.println("DZIĘKUJEMY ZA SKORZYSTANIE Z PROGRAMU");
                    break;
                    default:
                        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                        System.out.println("ZOSTAŁ PODANY NIEWŁAŚCIWY ZNAK");
                        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            }
        }
    }
}
