package clase6;
import java.util.*;
public class NumerosMayorMenor {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        Scanner ingresoDato = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        num1 = ingresoDato.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = ingresoDato.nextInt();
        System.out.println("Ingrese el tercer número: ");
        num3 = ingresoDato.nextInt();

        if (num1 > num2 && num1 > num3) {
            if (num2 > num3) {
                System.out.println("El número mayor es: "+  num1 + " el número menor es: " + num3);
            } else {
                System.out.println("El número mayor es: " + num1 + " el número menor es: " + num2);
            }
        } else if(num2 > num1 && num2 > num3) {
            if (num1 > num3) {
                System.out.println("El número mayor es: "+  num2 + " el número menor es: " + num3);
            } else {
                System.out.println("El número mayor es: "+  num2 + " el número menor es: " + num1);
            }
        } else {
            if (num1 > num2) {
                System.out.println("El número mayor es: "+  num3 + " el número menor es: " + num2);
            } else {
                System.out.println("El número mayor es: "+  num3 + " el número menor es: " + num1);
            }
        }
    }
}
