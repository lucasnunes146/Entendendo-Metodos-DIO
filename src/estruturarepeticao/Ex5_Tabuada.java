package estruturarepeticao;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int multiplicador = sc.nextInt();

        for(int i = 0; i <= 10; i++)System.out.println(multiplicador+" X " + i + " = " + (multiplicador*i));
    }
}
