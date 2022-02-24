package arrays;

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        //objetos
        Scanner sc = new Scanner(System.in);
        String[] consoantes = new String[6]; // array é um objeto
        //variável
        int qtdConsoantes = 0;
        //processamento
        for(int i = 0; i < consoantes.length; i++){
            System.out.print("Letra: ");
            String letra = sc.next();

            if (!(letra.equalsIgnoreCase("a") | /*equals compara o valor de inserido com o valor da posição
            do array(vetor). Já o ignore case vai ignorar caso o valor seja variável, como por exemplo, maiúsculo ou
            minúsculo*/
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))){
                consoantes[i] = letra;
                qtdConsoantes++;
            }
        }
        System.out.println("\n");
        //processamento e saída
        System.out.print("Consoantes: ");
        for (String consoante : consoantes) {
            if(consoante != null)
                System.out.print(consoante + " ");
        }
        System.out.println("\n");
        System.out.println("Quantidade de consoantes: "+qtdConsoantes);
    }
}
