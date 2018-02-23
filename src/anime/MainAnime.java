/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anime;

import java.util.Scanner;

/**
 *
 * @author Alumnos
 */
public class MainAnime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion=0;
        Scanner teclado = new Scanner(System.in);
        String nombreAnime="";
        String horarioAnime="";
        String estudioAnime="";
        do{
            try {
            System.out.println("Menu");
            System.out.println("Opcion #1 -- Estudios");
            System.out.println("Opcion #2 -- Televisora");
            System.out.println("Opcion #3 -- Salir");
            opcion=teclado.nextInt();
            System.out.println("==>");
            switch(opcion){
                case 1:
                    System.out.println("Menu de Estudios")  ;
                    System.out.println("Ingrese Nombre del Anime");
                    nombreAnime=teclado.nextLine();
                    System.out.println("Ingrese horario del Anime --(<Inicio - Fin>) || (<16-20>)--");
                    horarioAnime=teclado.nextLine();
                    System.out.println("Ingrese Estudio del Anime");
                    estudioAnime=teclado.nextLine();
                    break;
                case 2:
                    System.out.println("Menu de Estudios");
                    break;
                case 3:
                    System.out.println("Menu de Estudios");
                    break;
                default:
                    System.out.println("Ingrese un valor no nimerico");
            }
            }catch(Exception ex){    
            
            
            }
        }while(opcion!=3);
       
    }
    
}
