/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo_recursividad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author eperez50
 */
public class ejemplo_factorial {

    public static void main(String[] ar) throws IOException {
        int n;
        System.out.println("Calculo de factorial");
        System.out.println("Ingrese un entero:");
        String texto = "";
        Scanner sc = new Scanner(System.in);
        texto = sc.nextLine();
        n = Integer.parseInt(texto);

        System.out.println("\n \t" + n + "!= " + factorial_iter(n));

        System.out.println("\n \t" + n + "!= " + factorial_recur(n));

    }

    static long factorial_recur(int n) {
        if (n <= 1) {
            return 1;
        } else {
            long resultado = n * factorial_recur(n - 1);
            return resultado;
        }
    }

    static long factorial_iter(int n) {

        long fact = 1;
        for (long i = 1; i <= n; i++) {
            fact = i * fact;
        }
        return fact;

    }

}
