
import java.util.Scanner;

public class ejercicio1_b {
	public static void main(String[] args) {
		Scanner leer = 	new Scanner(System.in);
		
		int num1=2,num2=8,num3=5,opcion;
		int ord[] = new int [3];
		
		System.out.println("Ingrese\n1: si quiere ingresarr numeros descendientes\n2: si quiere numeros ascendentes\nIngrese su opcion:");
		do{
			opcion = leer.nextInt();
			switch(opcion) {
			case 1:
				if(num1>num2 && num1>num3) {
					ord[0]=num1;
						if(num2>num3) {
							ord[1]=num2;
							ord[2]=num3;
						}else {
							ord[1]=num3;
							ord[2]=num2;
						}
				}else { 
					if(num2>num3 && num2>num1) {
						ord[0]=num2;
						if(num1>num3) {
							ord[1]=num1;
							ord[2]=num3;
						}else {
							ord[1]=num3;
							ord[2]=num1;
						}
					}
				}
			break;
			case 2:
				if(num1<num2 && num1<num3) {
					ord[0]=num1;
						if(num2<num3) {
							ord[1]=num2;
							ord[2]=num3;
						}else {
							ord[1]=num3;
							ord[2]=num2;
						}
				}else { 
					if(num2<num3 && num2<num1) {
						ord[0]=num2;
						if(num1<num3) {
							ord[1]=num1;
							ord[2]=num3;
						}else {
							ord[1]=num3;
							ord[2]=num1;
						}
					}
				}
			break;
			default:
				System.out.println("Numero incorrecto, Vuelva a ingresar...\n");
			}
		}while(opcion<1 || opcion>2);
		leer.close();
		for(int i=0;i<ord.length;i++) {
			System.out.println("\nNumero " + (i+1) + ": " + ord[i]);			
		}
		System.out.println("\nFin del programa");
	}
}
