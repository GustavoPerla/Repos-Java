import java.util.Scanner;


public class Ejercicio1_B {

	public static void main(String[] args) {
		int vec[] = new int[3];
		
		char letra;
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese 3 numeros:");
		vec[0] = leer.nextInt();
		vec[1] = leer.nextInt();
		vec[2] = leer.nextInt();
		
		System.out.println("Ingrese:\nA: Para mostra en forma ascendente\nD: Para mostrar en forma descendente\n Ingrese su opcion:");
		do {
			letra = leer.next().charAt(0);
			letra = Character.toLowerCase(letra);
			if(letra!='a' && letra !='d') {
				System.out.println("La letra ingresada es incorrecta... \nVuelva a ingresar...");
			}
		}while(letra!='a' && letra !='d');
		
		leer.close();
		
		if(letra=='a') {
			if(vec[0]<vec[1] && vec[0]<vec[2]) {
				if(vec[1]<vec[2]) {
					System.out.println(vec[0] + "\n" + vec[1] + "\n" + vec[2] + "\n" );
				}else {
					System.out.println(vec[0] + "\n" + vec[2] + "\n" + vec[1] + "\n" );
				}
			}else {
				if(vec[1]<vec[0] && vec[1]<vec[2]) {
					if(vec[0]<vec[2]) {
						System.out.println(vec[1] + "\n" + vec[0] + "\n" + vec[2] + "\n" );
					}else {
						System.out.println(vec[1] + "\n" + vec[2] + "\n" + vec[0] + "\n" );
					}
				}else {
					if(vec[2]<vec[0] && vec[2]<vec[1]) {
						if(vec[1]<vec[0]) {
							System.out.println(vec[2] + "\n" + vec[1] + "\n" + vec[0] + "\n" );
						}else {
							System.out.println(vec[2] + "\n" + vec[0] + "\n" + vec[1] + "\n" );
						}
					}
				}
			}
		}else {
			if(vec[0]>vec[1] && vec[0]>vec[2]) {
				if(vec[1]>vec[2]) {
					System.out.println(vec[0] + "\n" + vec[1] + "\n" + vec[2] + "\n" );
				}else {
					System.out.println(vec[0] + "\n" + vec[2] + "\n" + vec[1] + "\n" );
				}
			}else {
				if(vec[1]>vec[0] && vec[1]>vec[2]) {
					if(vec[0]>vec[2]) {
						System.out.println(vec[1] + "\n" + vec[0] + "\n" + vec[2] + "\n" );
					}else {
						System.out.println(vec[1] + "\n" + vec[2] + "\n" + vec[0] + "\n" );
					}
				}else {
					if(vec[2]>vec[0] && vec[2]>vec[1]) {
						if(vec[1]>vec[0]) {
							System.out.println(vec[2] + "\n" + vec[1] + "\n" + vec[0] + "\n" );
						}else {
							System.out.println(vec[2] + "\n" + vec[0] + "\n" + vec[1] + "\n" );
						}
					}
				}
			}
		}

	}

}
