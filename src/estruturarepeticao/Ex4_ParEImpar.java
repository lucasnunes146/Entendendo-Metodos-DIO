package estruturarepeticao;

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int par = 0, impar = 0;

        System.out.println("Digite um número: ");
        int qtdNumeros = sc.nextInt();

        for (int i = 0; i < qtdNumeros; i++){
            System.out.println("Número: ");
            int valor = sc.nextInt();

            if (valor%2 == 0) par++;
            else impar++;
        }
        System.out.println("Pares: " + par);
        System.out.println("Ímpares: "+ impar);
    }
}
