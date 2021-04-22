package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.menu_principal.service.service;

import java.util.Scanner;

public class mainSorts {
    private static mainSorts instance;
    private mainSorts(){

    }

    public static mainSorts getInstance(){
        if(instance == null){
            return new mainSorts();
        }
        return instance;
    }

    int option;
    public void runMenuSorts(String[] arr) {
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("\nMENU Metodos de Ordenamiento de palabras");
            System.out.println("1)BubbleSort\n 2)HeapSort\n 3)InsertionSOrt\n 4)QuickSOrt\n 5)SelectionSort\n6)  SALIR");

            option = teclado.nextInt();
            switch (option) {
                case 1: {
/*
               bule bule= new bule();
                bule.bubbleSort1(arr);
                bule.printArray(arr);*/
                    
                }
                break;
                case 2: {
                /*HeapSortService heapSortService = new HeapSortService();
                heapSortService.sort(arr)*/
                }break;

                case 3: {
                    /*
                    InsertionSortService is = new InsertionSortService();
                    is.sort_sub(arr);
                    is.printArray(arr);*/

                }break;
                case 4: {
                    /*QuickSortService quickSortService= new QuickSortService();
                    quickSortService.sort(nombres);
                    quickSortService.printArray(nombres);*/
                }
                case 5: {
                    /*SelectionService a= new SelectinService()
                    a.sort(arr);
                    a.printArray(arr);*/
                }break;
                case 6: {
                    System.out.println("adios");
                }
                break;
                default: {
                    System.out.println("Opcion Invalida");
                }break;
            }
        } while (option != 6);
    }
}
