import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        int numeroInicio, numeroFin, primo = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        do {
            numeroInicio = scanner.nextInt();
            if (numeroInicio <= 0) {
                System.out.println("Error: No se aceptan numeros negativos ni cero.");
            }
        } while (numeroInicio <= 0);
        numeroFin = numeroInicio + 100;// el enunciado dice "8. Determinar de 100 números cuantos son primos"
		//lo cual fue interpretado por mi como "los numeros primos dentro de un rango de 100 numeros a partir de un numero ingresado del teclado"
        for (int i = numeroInicio; i <= numeroFin; i++) {
            if (i == 1) {
                continue; // el numero uno no es primo y por eso no necesito que se hagan operaciones con el
            }
            boolean esPrimo = true;//se asume que desde el principio el numero que se evalua es primo
            for (int j=2;j<= Math.sqrt(i);j++) {//se usa la funcion de raiz cuadrada para optimizar la busqueda
                if (i % j == 0) { //si en algun momento se encuentra un divisor entonces se salta la iteracion 
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {//si al final del bucle el valor de la variable boobleana sigue siendo el mismo entonces el numero es primo
                primo++;// se suma el numero de veces que hubo primos al contador de primos
            }
        }
        System.out.println("La cantidad de numeros primos entre " + numeroInicio + " y " + numeroFin + " es: " + primo);
    }
}

