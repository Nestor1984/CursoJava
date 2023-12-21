/*

 */
package _6_VariablesDeTexto;

public class VariablesDeTexto {

    public static void main(String[] args) {
        
        String texto = "hola";
        System.out.println(texto.toUpperCase()); // Metodo para convertir a mayusculas
        
        String texto2 = "HOLA";
        System.out.println(texto2.toLowerCase()); // Metodo para convertir a minusculas
        
        String texto3 = "HOLA";
        System.out.println(texto3.contains("K")); // Metodo para si un caracter esta en la palabra
        
        String texto4 = "HELLO";
        System.out.println(texto4.charAt(1)); // Metodo para que nos devuelva un caracter ubicada en cierta posicion
        
        String texto5 = "HELLO";
        texto5=texto5+"Nestor"; // Primera forma de concatenar
        System.out.println(texto5);
        
        String texto6 = "HELLO";
        texto6+="Nestor"; // Segunda forma de concatenar
        System.out.println(texto6);
        
    }
    
}
