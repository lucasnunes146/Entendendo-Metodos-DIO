package metodo.criacao;

/*
 Calcule as 4 operações básicas: soma, subtração, multiplicação e divisão. Sempre 2 valores devem ser passados.
 */

import java.util.Scanner;

class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro valor: ");
        a = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        b= sc.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        double dividir = dividir(a, b);
        int multiplicar = multiplicar(a, b);

        System.out.println("soma: " + somar);
        System.out.println("subtração: " + subtrair);
        System.out.printf("divisão: %.2f\n", dividir);
        System.out.println("multiplicação: " + multiplicar);

    }
    private static int somar(int a, int b){
        return a + b;
    }
    private static int subtrair(int a, int b){
        return a - b;
    }
    private static double dividir(double a, double b){
        return a / b;
    }
    private static int multiplicar(int a, int b){
        return a * b;
    }

}
