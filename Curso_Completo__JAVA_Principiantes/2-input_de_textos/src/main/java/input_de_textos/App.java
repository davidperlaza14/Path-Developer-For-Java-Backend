package input_de_textos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author davidperlaza14
 */
public class App {

    public static void main(String[] args) throws IOException {
        InputStreamReader capturandoTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturandoTeclado);
        
        System.out.print("Ingrese su edad: ");
        String strEdad = buffer.readLine();
        Integer edad = Integer.parseInt(strEdad);
        
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }
}
