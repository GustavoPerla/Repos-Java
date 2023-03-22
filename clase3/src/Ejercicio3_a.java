
public class Ejercicio3_a {

	public static void main(String[] args) {
		String palabra ="hola que tal";
		char letra ='a';
		int cant;
		for(int i = 0; i<palabra.length(); i++) {
			if(palabra[i]=='a') {
				cant++;
			}
		}
		
		System.out.println(cant);
		
	}

}
