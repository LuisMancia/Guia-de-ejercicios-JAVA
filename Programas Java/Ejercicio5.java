import java.util.Scanner;
public class Ejercicio5{
	public static void main(String[]args){
		char letra='Y';
		int suma=0, contador=1, numero;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese los numeros que desea sumar:");
		do{
			System.out.print(contador+". ");
			numero = scanner.nextInt();
			contador++;
			suma+=numero;
			System.out.print("Continuar(Y/N)? ");
			letra = scanner.next().charAt(0);
			if(letra == 'n' || letra == 'N'){
				break;
			}
		}while(letra=='y'||letra=='Y');
		System.out.println("La suma de los numeros ingresados es: "+suma);
	}
}