import java.util.Scanner;

public class Ejercicio1_C {

	public static void main(String[] args) {
		int vec[] = new int [] {4,9,6,3,8,7,15,46};
		int x,suma=0;
		
		System.out.println("Ingrese un numero natural:\n");
		Scanner leer = new Scanner (System.in);
		x=leer.nextInt();
		leer.close();
		for(int i=0;i<vec.length;i++) {
			if(vec[i]>x) {
				suma+=vec[i];
			}
		}
		System.out.println("la seuma de los numeros mayores que "+ x + " es: "+ suma);
	}

}
