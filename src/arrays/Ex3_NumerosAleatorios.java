package arrays;

import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random(); // gerar números aleatórios

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Numeros Aleatórios: ");
        for ( int numero: numerosAleatorios) {
            System.out.print(numero+" ");
        }

        System.out.println("\nAntecessor dos Números Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero-1)+" ");
        }

        System.out.println("\nSucessor dos Números Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero+1)+" ");
        }
    }
}
