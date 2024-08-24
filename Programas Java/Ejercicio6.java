import java.util.Scanner;
public class Ejercicio6{
	public static void main(String[]args){
		int suma=0, contador=1, numero;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese los numeros que desea sumar, para finalizar ingrese un cero");
		do{
			System.out.print(contador+". ");
			numero = scanner.nextInt();
			contador++;
			suma+=numero;
		}while(numero!=0);
		System.out.println("La suma de los numeros ingresados es: "+suma);
	}
}