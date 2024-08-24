import java.util.Scanner;

public class Ejercicio3{
	public static void main(String[]args){
		Scanner scanner= new Scanner(System.in);
		System.out.println("Ingrese un caracter:");
		char letra = scanner.next().charAt(0);
		if(letra=='a'||letra=='A'||letra=='e'||letra=='E'||letra=='i'||letra=='I'||letra=='o'||letra=='O'||letra=='u'||letra=='U'){
			System.out.println("El caracter ingresado ("+letra+") es una vocal.");
		}
		else{
			System.out.println("El caracter ingresado ("+letra+") es una consonante.");
		}
	}
}