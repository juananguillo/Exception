/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08convertircadenav2;

import java.util.Scanner;

/**
 *
 * @author Johan Manuel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean repetir = false;
        Scanner sc = new Scanner(System.in);
        int numero;
        String cadena;
        do{
            try{
                System.out.println((Integer.toString(Integer.MAX_VALUE)));
                System.out.println("Introduce un número entero:");
                cadena = sc.nextLine();
                numero = Entero.pedirEntero(cadena);
                System.out.println("El número convertido vale: " + numero);
            }catch(Exception e){
                repetir = true;
                System.out.println("Exepción lanzada: " + e.getMessage());                
            }
        }while(repetir);
        sc.close();
    }
}
