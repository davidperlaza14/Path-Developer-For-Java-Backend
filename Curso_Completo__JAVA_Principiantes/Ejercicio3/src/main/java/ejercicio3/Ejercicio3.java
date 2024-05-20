/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author davidperlaza14
 */
public class Ejercicio3 {

    public static void main(String[] args) throws IOException {
        System.out.print("Ingrese el primer numero: ");
        Double numero = Double.valueOf(cargarNumero());
        
//        Boolean esPar = (numero % 2) == 0;
        
        Boolean esPar = (numero / 2) == Math.round(numero / 2);
        
        if (esPar) {
            System.out.println("El numero es par");
        } else
            System.out.println("El numero es impar");
        
    }
    
    private static Integer cargarNumero() throws IOException{
        InputStreamReader capturandoTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturandoTeclado);
        String strNumero = buffer.readLine();
        Integer numero = Integer.parseInt(strNumero);
        return numero;
    }
}
