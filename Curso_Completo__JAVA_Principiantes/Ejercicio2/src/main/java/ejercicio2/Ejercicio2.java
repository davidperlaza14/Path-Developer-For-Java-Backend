package ejercicio2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author davidperlaza14
 */
public class Ejercicio2 {

    public static void main(String[] args) throws IOException {
        
        System.out.print("Ingrese el primer numero: ");
        Integer numero1 = cargarNumero();
        
        System.out.print("Ingrese el segundo numero: ");
        Integer numero2 = cargarNumero();
        
        System.out.print("Ingrese el tercer numero: ");
        Integer numero3 = cargarNumero();
        
        Integer sumatoria = numero1 + numero2 + numero3;
        Double numeroPromedio = Double.valueOf(sumatoria) / 3;
        System.out.println("El numero promedio es: " + numeroPromedio);
        
        
    }
    
    private static Integer cargarNumero() throws IOException{
        InputStreamReader capturandoTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturandoTeclado);
        String strNumero = buffer.readLine();
        Integer numero = Integer.parseInt(strNumero);
        return numero;
    }
}
