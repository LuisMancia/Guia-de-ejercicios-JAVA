import java.util.Scanner;

public class Ejercicio1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese un numero:");
		int numero = scanner.nextInt();
		if(numero%2==0){
			System.out.print("El numero es par.");
		}
		else {
			System.out.print("El numero es impar.");
		}
		scanner.close();
	}
}