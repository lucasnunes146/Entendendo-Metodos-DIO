package estruturarepeticao;

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota;
        while (true){
            System.out.println("Digite uma nota entre 0 e 10: ");
            nota = sc.nextInt();
            if (nota >=0 && nota <= 10) {
                System.out.println("nota válida");
                break;
            } else System.out.println("valor inválido, faça novamente");
        }
    }
}
