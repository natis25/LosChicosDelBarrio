import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingrese un numero entero");
		int numero = lector.nextInt();
		//Natalia Urrutia
		if (numero >= 20 && numero <= 24) {
			System.out.println("Nati U.");
		//Daniela Oropeza
		} else if (numero < 0) {
			System.out.println("Dani Nicole.");
		}
		
	}

}

