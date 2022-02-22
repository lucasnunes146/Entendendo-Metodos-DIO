package sobrecarga;

public class Quadrilatero {
    public static void area(double lado){ /*basta calcular o valor de 1 lado x o outro, pois para ser quadarado, os
dois possuem o mesmo valor*/
        double areaQuadrado = lado * lado;
        System.out.printf("A área do quadrado, é: %.1f.\n", areaQuadrado);
    }
    public static void area(double lado1, double lado2){
        double areaRetangulo = lado1 * lado2;
        System.out.printf("A área do retângulo, é: %.1f.\n", areaRetangulo);
    }
    public static void area(double baseMenor, double altura, double baseMaior){
        double areaTrapezio = ((baseMaior+baseMenor)*altura)/2;
        System.out.printf("A área do trapézio, é: %.1f.\n", areaTrapezio);
    }
    public static void area(float diagonal1, float diagonal2){
        float areaLosango = (diagonal1 * diagonal2)/2;
        System.out.printf("A área do losango, é: %.1f.", areaLosango);
    }
}
