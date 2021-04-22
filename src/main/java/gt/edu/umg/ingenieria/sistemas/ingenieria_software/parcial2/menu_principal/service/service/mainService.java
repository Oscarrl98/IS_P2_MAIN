package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.menu_principal.service.service;

import java.util.Arrays;
import java.util.Scanner;
/*
import gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.bubble_sort;
import gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.heap_sort;
import gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.insertion_sort;
import gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.quick_sort;
import gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.selection_sort;*/

public class mainService {
    private static mainService instance;
    private mainService(){

    }

    public static mainService getInstance(){
        if(instance == null){
            return new mainService();
        }
        return instance;
    }

    public void principalMain(){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese las palabras separadas por espacios");
        String  words= teclado.nextLine();
        String[] arr = words.split(" ");
        mainSorts sorts = mainSorts.getInstance();
        sorts.runMenuSorts(arr);

    }

}
