package clase_1;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		int vehiculos, inmuebles;
		char embarcacion;
		float ingresos;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese los ingresos mensuales totales del hogar:");
		do {
			ingresos = leer.nextFloat();
			if(ingresos<1) {
				System.out.println("El ingreso debe ser mayor a 0\nVuelva a ingresar...\n");
			}				
		}while(ingresos<1);
		
		System.out.println("¿Cuantos vehiculos con antiguedad menor a 5 años hay?");
		do {
			vehiculos = leer.nextInt();
			if(vehiculos<0) {
				System.out.println("El ingreso debe ser mayor o igual a 0\nVuelva a ingresar...\n");
			}
		}while(vehiculos<0);
		
		System.out.println("Ingrese la cantidad de inmuebles que tienen:");
		do {
			inmuebles=leer.nextInt();
			if(inmuebles<0) {
				System.out.println("El ingreso debe ser mayor o igual a 0\nVuelva a ingresar...\n");
			}
		}while (inmuebles<0);
		
		System.out.println("Posee embarcaciones y/o aeronaves de lujo y/o es titular de activos societarios que demuestren capacidad economica plena:\nS: Si\nN: No\n");
		do {
			embarcacion= leer.next().charAt(0);//Leer caracter
			embarcacion= Character.toUpperCase(embarcacion);//Pasar carater a mayuscula
			if(embarcacion!='S' && embarcacion!='N') {
				System.out.println("Letra incorrecta\nVuelva  ingresar....\n");
			}
		}while(embarcacion!='S' && embarcacion!='N');
		
		leer.close();
		
		if(ingresos>=489083 || vehiculos>=3 || inmuebles>=3 || embarcacion=='S') {
			System.out.println("Usted pertenece al segmento de ingresos altos...");
		}
		
		System.out.println("Buen dia!");		
	}

}
