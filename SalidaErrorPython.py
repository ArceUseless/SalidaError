""" 
    Este programa ayuda a entender qué es la salida estandar y la salida de error y cómo manejarlas en java, se divide en tres bloques:
        - El primer bloque enviará dos mensajes de prueba por la salida estandar y la de error para enseñar cuales son por defecto.
        - El segundo bloque generará un fichero el cual será la nueva salida de error y se enviarán de nuevo otros dos mensajes de prueba a cada salida.
        - El tercer bloque revertirá la salida de error a su estado original (la consola) y enviará otros dos mensajes de prueba.
        
        Nota: En el bloque dos hay una linea comentada que provocará una excepción, descomentela si quiere ver cómo se envía al fichero el mensaje de error de la excepción.
    @author Rafael Jesús Nieto Cardador
"""
import sys
#Primer bloque

#Impresión por salida estandar
print("Salida estandar")
sys.stdout.write('Salida estandar\n'); sys.stdout.flush()
#Impresión por salida de error
print ('Salida de error', file=sys.stderr)
sys.stderr.write('Salida de error\n\n'); sys.stderr.flush()

#Segundo bloque

#Se cambia la salida de error y se abre la escritura del fichero
sys.stderr = open('error.txt', 'w')

#Impresión por salida estandar
print("Salida estandar 2\n"); sys.stderr.flush()
#Impresión por salida de error
#La linea de abajo es una excepción opcional, descomentela si quiere ver cómo influye
#a = 2/0
print ('Salida de error 2', file=sys.stderr); sys.stderr.flush()
#Se cierra la escritura del fichero
sys.stderr.close()
#Volvemos a dejar la salida de error como estaba
sys.stderr = sys.__stderr__

#Tercer bloque

#Impresión por salida estandar
print("Salida estandar 3"); sys.stderr.flush()
#Impresión por salida de error
print ('Salida de error 3', file=sys.stderr); 

