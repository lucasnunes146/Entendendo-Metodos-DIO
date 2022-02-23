package estruturarepeticao;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] valores = new int[5];

        int maior = 0, soma = 0;
        double media = 0;

        for (int i = 0; i < 5; i++){
            System.out.println("Número: ");
            valores[i] = sc.nextInt();
            soma += valores[i];

            if (valores[i] > maior){
                maior = valores[i];
            }
            media = (double) soma/5;
        }
        System.out.println("Maior: "+maior);
        System.out.println("Média: "+media);
    }
}
