
import java.util.Scanner;

public class Ejercicio_2_A {

	public static void main(String[] args) {
		String frase = "Hola como andas?";
		String Desplazamiento = new String();
		int lugares,opcion;
		
		System.out.println("Ingrese la cantidad de lugares a desplazar:");
		Scanner leer = new Scanner(System.in);
		lugares= leer.nextInt();
		
		System.out.println("Ingrese si quiere adelantar o retroceder:\n1: Retroceder\n2: Adelantar\nIngrese su opcion:");
			do{
				opcion=leer.nextInt();
				if(opcion<1 || opcion >2) {
					System.out.println("Numero incorrecto vuelva a ingresar....\n");
				}
			}while(opcion<1 || opcion >2);
		leer.close();
		
		for(int i = 0; i<frase.length();i++) {
			if(opcion==1) {
				Desplazamiento += (char) (frase.charAt(i)-lugares);
			}else {
				Desplazamiento += (char) (frase.charAt(i)+lugares);
			}
		}
		
		System.out.println(Desplazamiento);
	}

}
