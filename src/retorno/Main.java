package retorno;

public class Main {
    public static void main(String[] args) {
        System.out.println("Área de Quadrilateros");
        double areaQuadrado = Quadrilatero.area(10);
        System.out.printf("A área do quadrado, é: %.1f.\n", areaQuadrado);
        double areaRetangulo = Quadrilatero.area(5d, 5d);
        System.out.printf("A área do retângulo, é: %.1f.\n", areaRetangulo);
        double areaTrapezio = Quadrilatero.area(10,15,15);
        System.out.printf("A área do trapézio, é: %.1f.\n", areaTrapezio);
        float areaLosango = Quadrilatero.area(5f,5f);
        System.out.printf("A área do losango, é: %.1f.\n", areaLosango);

    }
}
