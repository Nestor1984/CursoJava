/*

 */
package _7_If_Else;

public class EstructuraSelectiva {

    public static void main(String[] args) {
        
        int numero = 10;
        
        // if + tab = if(true){}
        if (numero > 5) { // Si
            
            System.out.println("El numero es mayor que 5.");
            
        }else if (numero < 5) { // Sino si
            
            System.out.println("El numero es menor a 5.");
            
        }else{ // Sino
            
            System.out.println("Los numeros son iguales.");
            
        }
        
    }
    
}
