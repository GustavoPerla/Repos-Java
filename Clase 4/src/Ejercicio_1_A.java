
public class Ejercicio_1_A {

	public static void main(String[] args) {
		int vec[] = new int[] {Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2])};
		
		char letra;
		letra = args[3].charAt(0);
		
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
