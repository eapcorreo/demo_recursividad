
package demo_recursividad;

import java.io.IOException;
import java.util.Scanner;
// import static materia_prog1.ejemplo_factorial.factorial;

/**
 * 
 *   neuquen
 *   
 * 
 *   arbol
 * 
 *   lobra
 * 
 * 
 *   
 * @author eperez50
 */
public class ejemplo_palindromo {
   
    public static void main(String[] ar) throws IOException {

        System.out.println("Calculo de palindromo");
        System.out.println("Ingrese un texto:");
        String texto="";        
        Scanner sc = new Scanner(System.in);
        texto = sc.nextLine(); 
        // n = Integer.parseInt(texto);
        
        ejemplo_palindromo ep = new ejemplo_palindromo();
        
        System.out.println("");
        System.out.println("Es palindromo iter: " + texto + ": " + ep.isPalindrome_iter(texto));

        System.out.println("");
        System.out.println("");
        System.out.println("Es palindromo recur: " + texto + ": " + ep.isPalindrome_recur(texto));
        
    }
    
    
    public boolean isPalindrome_iter(String text) {
        int i = 0;
        int length = text.length();
        int maxPair = length / 2;
        while (i < maxPair && text.charAt(i) == text.charAt(length-1-i)) {
            i = i + 1;
        }
        // If not found, isPalindrome is true    
        return (i == maxPair);
    }

    public boolean isPalindrome_recur(String text) {
        if (text.length() <= 1) {
            return true;
        } else {
            char first = text.charAt(0);
            char last = text.charAt(text.length() - 1);
            String inner = removeExtrems(text);
            return (first == last) && isPalindrome_recur(inner);
        }    
    }
 
    public String removeExtrems(String text) {
        //    Ejercicio    para    el    lector   
        String retText="";
        // neuquen
        retText = text.substring(1);

        System.out.println("retText 1: " + retText);
        
        
        // euquen
        retText = retText.substring(0,retText.length()-1);
        // euque

        System.out.println("retText 2: " + retText);

        return retText;
    }

}




















//         retText = text.substring(1);
//         retText = retText.substring(0,retText.length()-1);
        
        // System.out.println("retText:" + retText);
