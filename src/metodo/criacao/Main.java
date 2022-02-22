package metodo.criacao;

public class Main {
    public static void main(String[] args) {
        //calculadora
        System.out.println("Exercício Calculadora\n---------");
        Calculadora.somar(3,6);
        Calculadora.subtrair(9, 1.8);
        Calculadora.dividir(7, 8);
        Calculadora.multiplicar(5, 2.5);
        System.out.println("----------\n");

        //mensagem
        System.out.println("Mensagem\n----------");
        BomDiaTardeNoite.obterMensagem(9);
        BomDiaTardeNoite.obterMensagem(14);
        BomDiaTardeNoite.obterMensagem(1);
        System.out.println("----------\n");

        //empréstimo
        System.out.println("Exercício empréstimo\n---------");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
        System.out.println("----------\n");

    }
}
