import java.util.Scanner;
public class Ejercicio7{
	public static void main(String[]args){
		int numero, factorial=1;
		Scanner scanner= new Scanner(System.in);
		System.out.print("Ingrese el numero del que se desea conocer el factorial: ");
		do{
			numero = scanner.nextInt();
			if(numero<0){
				System.out.println("Error: No se aceptan valores negativos.");
			}
		}while(numero<0);
		if(numero==0){
			System.out.print(numero+"! = 1");
		}
		else{
			for(int i=1;i<=numero;i++){
				factorial=factorial*i;
			}
			System.out.print(numero+"! = "+factorial);
		}
	}
}