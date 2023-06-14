package clase7;
import java.util.*;
public class Ejercicios {
    public static void ingresarNumerosEnArray (int[] arrayNumeros) {
        Scanner ingresoDato = new Scanner(System.in);
        for(int i = 0; i < arrayNumeros.length; i++) {
            System.out.println("Ingrese un número: ");
            int numero = ingresoDato.nextInt();
            arrayNumeros[i] = numero;
        }
    }
    public static void mostrarArray (int[] arrayNumeros) {
        for(int i = 0; i < arrayNumeros.length; i++) {
            if (i == 0)
                System.out.print("[" + arrayNumeros[i] + ", ");
            else if(i == arrayNumeros.length -1)
                System.out.println(arrayNumeros[i] + "]");
            else
                System.out.print(arrayNumeros[i] +", ");
        }
    }
    public static int mostrarElementoMayor (int[] arrayNumeros) {
        int mayor = arrayNumeros[0];
        for (int i = 1; i < arrayNumeros.length; i++) {
            if (mayor < arrayNumeros[i])
                mayor = arrayNumeros[i];
        }
        return mayor;
    }
    public static int mostrarElementoMenor (int[] arrayNumeros) {
        int menor = arrayNumeros[0];
        for (int i = 1; i < arrayNumeros.length; i++) {
            if (menor > arrayNumeros[i])
                menor = arrayNumeros[i];
        }
        return menor;
    }
    public static double promedio (int[] arrayNumeros) {
        int suma = 0;
        for (int arrayNumero : arrayNumeros) {
            suma += arrayNumero;
        }
        return (double) suma / arrayNumeros.length;

    }
    public static void main(String[] args) {
        int[] listaNumeros = new int[5];
        ingresarNumerosEnArray(listaNumeros);
        mostrarArray(listaNumeros);
        System.out.println("EL número mayor de la lista es: " + mostrarElementoMayor(listaNumeros));
        System.out.println("El número menor de la lita es: " + mostrarElementoMenor(listaNumeros));
        System.out.println("El promedio de la suma de lo elementos es: " + promedio(listaNumeros));
    }
}
