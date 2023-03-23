package clase_1;

import java.util.Scanner;

public class Ejercicio_1_C {

	public static void main(String[] args) {
		int num1 = 5,num2 = 14,opcion;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese\n1: Para ver numeros pares\2: Para ver numeros impares\n");
		
		do {
			opcion = leer.nextInt();
			if(opcion!=1 && opcion!=2) {
				System.out.println("Numero incorrecto\nVuelva a ingresar...\n");
			}
		}while(opcion!=1 && opcion!=2);
		leer.close();
		
		while(num1<=num2) {
			if(opcion==1) {
				num1++;
					System.out.println(num1);
			}else{
				System.out.println(num1);
				num1++;
			}
			num1++;
		}
	}

}
