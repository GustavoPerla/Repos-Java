
public class Ejercicio_1_A {

	public static void main(String[] args) {
		String frase = "Hola que talaaaaa?";
		char letra = 'a';
		int cont=0;
		
		for(int i = 0;i<frase.length();i++) {
			if(frase.charAt(i)==letra) {
				cont++;
			}
		}
		
		System.out.println("La cantidada de letras" + letra + " que hay en la frase es: " + cont);
	}

}
