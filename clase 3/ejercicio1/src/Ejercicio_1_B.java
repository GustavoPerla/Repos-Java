import java.util.Scanner;

public class Ejercicio_1_B {

	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		int num1,num2,num3,vec[] = new int [3],opcion;
		
		System.out.println("Ingrese un numero:");
		num1 = leer.nextInt();
		
		System.out.println("Ingrese un numero:");
		num2 = leer.nextInt();
		
		System.out.println("Ingrese un numero:");
		num3 = leer.nextInt();
		
		System.out.println("Ingrese como quiere ordenar los numeros:\n1: forma decreciente\n2: forma creciente\n");
		do{
			opcion = leer.nextInt();
			if(opcion != 1 && opcion!=2) {
				System.out.println("Numero incorrecto\nVuelva  ingresar....\n");
			}
		}while(opcion != 1 && opcion!=2);
		
		leer.close();
		
		if(opcion==1) {
			if(num1>num2) {
				if(num2>num3) {
					vec[0] = num1;
					vec[1] = num2;
					vec[2] = num3;
				}else {
					vec[0] = num1;
					vec[1] = num3;
					vec[2] = num2;
				}
			}else {
				if(num2>num3) {
					if(num1>num3) {
						vec[0] = num2;
						vec[1] = num1;
						vec[2] = num3;
					}else {
						vec[0] = num2;
						vec[1] = num3;
						vec[2] = num1;
					}
				}else {
					vec[0] = num3;
					vec[1] = num2;
					vec[2] = num1;
				}
			}
		}else{
			if(num1<num2) {
				if(num2<num3) {
					vec[0] = num1;
					vec[1] = num2;
					vec[2] = num3;
				}else {
					vec[0] = num1;
					vec[1] = num3;
					vec[2] = num2;
				}
			}else {
				if(num2<num3) {
					if(num1<num3) {
						vec[0] = num2;
						vec[1] = num1;
						vec[2] = num3;
					}else {
						vec[0] = num2;
						vec[1] = num3;
						vec[2] = num1;
					}
				}else {
					vec[0] = num3;
					vec[1] = num2;
					vec[2] = num1;
				}
			}
		}
		
		for(int i = 0;i < 3;i++) {
			System.out.println("Numero " + (i+1) + ": " + vec[i]);
		}
		
	}

}
