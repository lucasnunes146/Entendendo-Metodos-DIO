package metodo.criacao;
/*
 Calcule as 4 operações básicas: soma, subtração, multiplicação e divisão. Sempre 2 valores devem ser passados.
 */
class Calculadora {
    public static void somar(double a, double b){
        double resultado = a + b;
        System.out.printf("A soma de "+a+" e "+b+" = %.1f\n",resultado);
    }
    public static void subtrair(double a, double b){
        double resultado = a - b;
        System.out.printf("A subtração de "+a+" e "+b+" = %.1f\n", resultado);
    }
    public static void dividir(double a, double b){
        double resultado = a / b;
        System.out.printf("A soma de "+a+" e "+b+" = %.1f\n", resultado);
    }
    public static void multiplicar(double a, double b){
        double resultado = a * b;
        System.out.printf("A soma de "+a+" e "+b+" = %.1f\n", resultado);
    }

}
