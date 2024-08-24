import java.util.Scanner;
public class Ejercicio4{
	public static void main(String[]args){
		int contadorVocales=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese 10 caracteres:");
		for(int i=0;i<10;i++){
			System.out.print((i+1)+". ");
			char letra = scanner.next().charAt(0);
			if(letra=='a'||letra=='A'||letra=='e'||letra=='E'||letra=='i'||letra=='I'||letra=='o'||letra=='O'||letra=='u'||letra=='U'){
				contadorVocales+=1;
			}
		}
		System.out.println("El numero de vocales ingresadas es: "+contadorVocales);
	}
}