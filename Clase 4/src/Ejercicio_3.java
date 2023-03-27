import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class Ejercicio_3 {

	public static void main(String[] args) throws IOException {
		String resultado;
		
		if(args[0].charAt(0) == 'c') {
			resultado = codificar(Integer.parseInt(args[1]),args[2]);
		}else {
			resultado = decodificar(Integer.parseInt(args[1]),args[2]);
		}
		
		Files.writeString(Paths.get(new File(args[3]).getAbsolutePath()),resultado);
		
		System.out.println("Termino correctamente");
	}
	
	private static String codificar(int lugares,String url) throws IOException {
		String frase = new String (Files.readAllBytes(Paths.get(new File(url).getAbsolutePath())));//hago un encode pasando todo el archivo a Bytes de un array
		String codi=new String();
		
		for(int i =0;i<frase.length();i++) {
			codi+=(char) (frase.charAt(i)+lugares);
		}
		return codi;
	}
	
	private static String decodificar(int lugares,String url) throws IOException {
		String deco=new String();
		String frase = new String (Files.readAllBytes(Paths.get(new File(url).getAbsolutePath())));//hago un encode pasando todo el archivo a Bytes de un array
		for(int i =0;i<frase.length();i++) {
			deco+=(char) (frase.charAt(i)-lugares);
		}
		return deco;
	}
}
