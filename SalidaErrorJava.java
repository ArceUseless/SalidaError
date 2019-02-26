/** Este programa ayuda a entender qu� es la salida estandar y la salida de error y c�mo manejarlas en java, se divide en tres bloques:
 *   - El primer bloque enviar� un mensaje de prueba por la salida estandar y la de error para ense�ar cuales son por defecto.
 *   - El segundo bloque generar� un fichero el cual ser� la nueva salida de error y se enviar�n de nuevo otros dos mensajes de prueba a cada salida.
 *   - El tercer bloque revertir� la salida de error a su estado original (la consola) y enviar� otros dos mensajes de prueba.
 *   
 *   Nota: En el bloque dos hay una linea comentada que provocar� una excepci�n, descomentela si quiere ver c�mo se env�a al fichero el mensaje de error de la excepci�n.
 *   
 * @author Rafael Jes�s Nieto Cardador
*/

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class SalidaErrorJava {
    public static void main(String[] args) throws FileNotFoundException{
    //Primer bloque
      
      //Enviamos mensajes por la salida estandar y de error
      System.err.println("Estamos enviando este mensaje a la salida de error.\n");
      System.out.println("Estamos enviando este mensaje a la salida estandar.");
      
    //Segundo bloque
      
      //Se crea un nuevo fichero de salida de datos
      FileOutputStream ficheroError = new FileOutputStream("error.txt");
      //Se cambia la salida de errores al fichero que hemos creado.
      System.setErr(new PrintStream(ficheroError));
      
      System.err.println("Estamos enviando este mensaje a la salida de error.");
      System.out.println("Estamos enviando este mensaje a la salida estandar.\n");
      
    //Tercer bloque
      
      //Hacemos que la salida de error sea la misma que la salida estandar
      System.setErr(new PrintStream(System.out));
        
      System.err.println("Estamos enviando este mensaje a la salida de error.");
      System.out.println("Estamos enviando este mensaje a la salida estandar.");
  }
}