package clase7;
import java.util.*;
public class Ejercicios {
    /*Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.*/
    public static void main(String[] args) {
        int[] listaNumeros = new int[5];
        int numero;
        Scanner ingresoDato = new Scanner(System.in);
        for(int i = 0; i < listaNumeros.length; i++) {
            System.out.println("Ingrese un número: ");
            numero = ingresoDato.nextInt();
            listaNumeros[i] = numero;
        }
        for(int i = 0; i < listaNumeros.length; i++) {
            if (i == 0)
                System.out.print("[" + listaNumeros[i] + ", ");
            else if(i == listaNumeros.length -1)
                System.out.println(listaNumeros[i] + "]");
            else
                System.out.print(listaNumeros[i] +", ");
        }

       /* Después de realizar el ejercicio anterior, agregar que muestre el número mayor y el número menor.*/
        int mayor = listaNumeros[0];
        int menor = listaNumeros[0];
        for (int i = 1; i < listaNumeros.length; i++) {
            if (menor > listaNumeros[i])
                menor = listaNumeros[i];
            if (mayor < listaNumeros[i])
                mayor = listaNumeros[i];
        }
        System.out.println("EL número mayor de la lista es: " + mayor);
        System.out.println("El número menor de la lita es: " + menor);

        /*sacar promedio*/
        int suma = 0;
        double promedio;
        for (int i = 0; i < listaNumeros.length; i++) {
            suma += listaNumeros[i];
        }
        promedio = suma / listaNumeros.length;
        System.out.println("El promedio de la suma de lo elementos es: " + promedio);
    }
}
