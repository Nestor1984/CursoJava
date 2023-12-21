/*
 */
package _5_Casting;

public class Conversiones {

    public static void main(String[] args) {
        
        // Convertimos cadena de texto a entero
        String texto = "7";
        int numero;
        
        numero = Integer.parseInt(texto);
        System.out.println(numero);
        
        // Convertimos cadena de texto a double
        String texto2 = "25";
        double numero2;
        
        numero2 = Double.parseDouble(texto2);
        System.out.println(numero2);
        
        // Convertimos entero a cadena de texto 
        int numero3 = 67;
        String texto3;
      
        texto3 = String.valueOf(numero3);
        System.out.println(texto3);
        
    }
    
}
