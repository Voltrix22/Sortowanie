package Sortowanie;

import java.util.ArrayList;

public class Sortowanie implements PotrzebneMetody {

    public Sortowanie(){

    }

    ArrayList<Integer> listaZasadnicza = new ArrayList<>();
    ArrayList<Integer> listaMW = new ArrayList<>();
    ArrayList<Integer> listaWM = new ArrayList<>();

    @Override
    public void addToList(int liczba) {
        listaZasadnicza.add(liczba);
    }

    @Override
    public void showList() {
        System.out.println();
        System.out.println("LISTA LICZB PODANYCH PRZEZ UŻYTKOWNIKA");
        System.out.println("--------------------------------------");
        for(int tmp: listaZasadnicza){
            System.out.println(tmp);
        }
        System.out.println("--------------------------------------");
    }

    @Override
    public void sortMW() {

        while(listaMW.size() != 10){

            int liczbaMW = 100;

            for(int tmp: listaZasadnicza){
                if(listaMW.contains(tmp) == false&&liczbaMW>tmp){
                    liczbaMW = tmp;
                }
            }
            listaMW.add(liczbaMW);
        }
        System.out.println();
        System.out.println("LICZBY UŁOŻONE W KOLEJNOŚCI OD NAJMNIEJSZEJ DO NAJWIĘKSZEJ");
        System.out.println("----------------------------------------------------------");
        System.out.println(listaMW);
        System.out.println("----------------------------------------------------------");
        System.out.println();
    }

    @Override
    public void sortWM() {
        while(listaWM.size() != 10){

            int liczbaWM = -100;

            for(int tmp: listaZasadnicza){
                if(listaWM.contains(tmp) == false&&liczbaWM<tmp){
                    liczbaWM = tmp;
                }
            }
            listaWM.add(liczbaWM);
        }
        System.out.println();
        System.out.println("LICZBY UŁOŻONE W KOLEJNOŚCI OD NAJWIĘKSZEJ DO NAJMNIEJSZEJ");
        System.out.println("----------------------------------------------------------");
        System.out.println(listaWM);
        System.out.println("----------------------------------------------------------");
        System.out.println();
    }













}
