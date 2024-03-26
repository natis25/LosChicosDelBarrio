import java.util.random.RandomGenerator;

import Sebas.Random;

public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
        int numeroAleatorio = ((RandomGenerator) rand).nextInt(50);
        
        System.out.println("Número aleatorio: " + numeroAleatorio);
        
        if(numeroAleatorio>=45 && numeroAleatorio<=50) {
        	System.out.println("Hola Sebastian");
        }

	}

}
