package sobrecarga;

public class Main {
    public static void main(String[] args) {
        System.out.println("Área de Quadrilateros");
        Quadrilatero.area(10);
        Quadrilatero.area(5d, 5d);
        Quadrilatero.area(10,15,15);
        Quadrilatero.area(5f,5f);

    }
}
