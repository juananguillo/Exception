/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08convertircadenav2;

/**
 *
 * @author Johan Manuel
 */
public class Entero{

    public Entero() {}

    public static int pedirEntero(String c){
        //int entero = 0;
        
        return Integer.parseInt(c);
        
//        try {
//            entero = Integer.parseInt(c);            
//        } catch (NumberFormatException nf) {
//            System.out.println("Error al convertir la cadena de carácteres entero a números enteros: " + nf.getMessage());
//        }
//        return entero;
    }

    public static int pedirEnteroV2(String c2) throws Exception {
        int entero       = 0;
        String cadena    = c2;
        boolean negativo = false;
        boolean caracter = false;
        final String min_value = (Integer.toString(Integer.MIN_VALUE)).substring(1); //2147483648
        final String max_value = (Integer.toString(Integer.MAX_VALUE)); //2147483647

        //Si el entero es negativo
        if (cadena.charAt(0) == '-') {
            negativo = true;
            cadena = cadena.substring(1);
            if (cadena.compareTo(min_value) > 0 || cadena.length() > min_value.length()) {
                caracter = true;
            }
        } else {
            if (cadena.compareTo(max_value) > 0 || cadena.length() > max_value.length()) {
                caracter = true;
            }
        }

        char[] charArray = cadena.toCharArray();

        int mult = 1;
        char digito;

        for (int j = 0; j < charArray.length; j++) {
            digito = charArray[charArray.length - 1 - j];

            if (digito >= '0' && digito <= '9') {
                entero = entero + (Character.getNumericValue(digito) * mult);
                mult = mult * 10;
            } else {
                caracter = true;
            }
        }
        if (caracter) {
            throw new Exception("Número incorrecto.");
        }
        return negativo ? -entero : entero;
    }

}
