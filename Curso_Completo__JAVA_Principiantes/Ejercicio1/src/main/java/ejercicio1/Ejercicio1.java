package ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author davidperlaza14
 */
public class Ejercicio1 {

    public static void main(String[] args) throws IOException {
        // Con este codigo pedimos un número
        System.out.print("Ingrese el primer numero: ");
        Integer numero1 = cargarNumero();
        
        System.out.print("Ingrese el segundo numero: ");
        Integer numero2 = cargarNumero();
        
        System.out.print("Ingrese el tercer numero: ");
        Integer numero3 = cargarNumero();
        
        // Con este codigo calculamos el numero mayor y el nnumero menor
        calcularNumeroMayor(numero1, numero2, numero3);
        calcularNumeroMenor(numero1, numero2, numero3);
        
        
        
    }
    
    /**
     * 
     * @return 
     */
    private static Integer cargarNumero() throws IOException{
        InputStreamReader capturandoTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturandoTeclado);
        String strNumero = buffer.readLine();
        Integer numero = Integer.parseInt(strNumero);
        return numero;
    }
    
    
    
    private static void calcularNumeroMayor(Integer numero1, Integer numero2, Integer numero3){
        Integer numeroMayor = numero1;
        
        if (numero2 > numeroMayor) {
            numeroMayor = numero2;
        }
        
        if (numero3 > numeroMayor) {
            numeroMayor = numero3;
        }
        
        System.out.println("El numero mayor es: " + numeroMayor);
        
        
    }
        
        
    private static void calcularNumeroMenor(Integer numero1, Integer numero2, Integer numero3){
        Integer numeroMenor = numero1;

        if (numero2 < numeroMenor) {
            numeroMenor = numero2;
        }

        if (numero3 < numeroMenor) {
            numeroMenor = numero3;
        }

        System.out.print("El numero menor es: " + numeroMenor);
        }
        
        
    
}
