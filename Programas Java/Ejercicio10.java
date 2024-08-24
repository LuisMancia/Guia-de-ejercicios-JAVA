import java.util.Scanner;
public class Ejercicio10{
	public static void main(String[]args){
		int positivos=0, negativos=0, ceros=0, numero, datoIngresado;
		Scanner scanner = new Scanner(System.in);
		
		do{
			System.out.print("\nIngrese la cantidad de datos a evaluar: ");
			numero = scanner.nextInt();
			if(numero<=0){
				System.out.print("Error: No se aceptan numeros negativos ni nulos.\n");
			}
		}while(numero<=0);
		System.out.println("\nIngrese los datos:\n");
		for(int i=1;i<=numero;i++){
			System.out.print(i+". ");
			datoIngresado = scanner.nextInt();
			if(datoIngresado==0) 
			{
				ceros++;
			}
			else
			{
				if(datoIngresado>0)
				{
					positivos++; 
				}
				else{
					if(datoIngresado<0){
						negativos++;
					}
				}
			
			}
		}
		System.out.println("\nPositivos: "+positivos);
		System.out.println("Negativos: "+negativos);
		System.out.println("Ceros: " +ceros);
	}
}