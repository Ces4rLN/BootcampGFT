package JavaGFT.exerciciosArrays;
import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random aleatorio = new Random();

        int[] numerosAleatorios = new int[20];

        for( int i = 0; i < numerosAleatorios.length ; i++){
            int numero = aleatorio.nextInt(100);
            numerosAleatorios[i] = numero;
        }
        
        System.out.print("Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
            
        }

        System.out.print("\nSucessores dos Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero + 1) + " ");
            
        }

        System.out.print("\nAntecessores dos Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero - 1) + " ");            
        }
    }    
}
