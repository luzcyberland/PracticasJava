/*
Trabajo Practico Nro: 1 
Alumna: Luz Benitez
Ejercicio Nro 7
Enunciado: 
 Crear un array de 20 posiciones con números enteros entre 1001 y 9999 generados aleatoriamente, de
tal forma que no se repita ningún elemento. Además, no puede haber ningún elemento que sea múltiplo
de la posición que a partir de la posición 2. Imprimir la posición y el array generado. 
 */
package trabajopractico1;
public class TrabajoPractico1 {
    public static void main(String[] args) {
        int[] vector = new int[20];
        int aleatorio;

        //defino y genero numeros dentro del rango que cumplan la primera condicion para los dos primeros elementos de array

        for (int i = 0; i < 2; i++) {
            do {
                aleatorio = (int) (Math.random() * (9999 - 1001) + 1001);
            } while (comprobarNumero(vector, i, aleatorio));
            vector [i] = aleatorio;
        }
        //por separado se generan los numeros para los demas elementos de las posiciones siguientes que deben cumplir las dos condiciones del enunciado
        for (int i = 2; i < vector.length; i++) {
            do {
                aleatorio = (int) (Math.random() * (9999 - 1001) + 1001);
            } while ((comprobarNumero(vector, i, aleatorio)) || aleatorio % i == 0);
            vector [i] = aleatorio;

        }
        //Impresión de los elementos e índices
        for (int i = 0; i < vector.length; i++) {
            System.out.print("| " + i);
            System.out.print("| " + vector[i]);
            System.out.print("\n");
        }
    }
    //Este metodo me permite comprobar que los numeros generados no sean duplicados, simplemente compara el vector en la posicion i con el  numero aleatorio

    private static boolean comprobarNumero(int[] vector, int index, int aleatorio) {
        for (int i = 0; i < index; i++) {
            if (vector[i] == aleatorio) return true;
                    }
        return false;
    }
}
  

