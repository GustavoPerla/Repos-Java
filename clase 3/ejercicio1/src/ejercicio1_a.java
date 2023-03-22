
public class ejercicio1_a {

	public static void main(String[] args) {
		String palabra = "Holaaaaa que tal?";
		char letra = 'a';
		int cont = 0;
		
		for(int i=0;i<palabra.length();i++) {
			if(palabra.charAt(i)==letra) {
				cont++;
			}
		}
		
		System.out.println(cont);
	}

}
