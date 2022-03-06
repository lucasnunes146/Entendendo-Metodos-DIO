package projetos.criandoumbancodigital;

public class Main {
    private static Conta poupanca;

    public static void main(String[] args) {
        Cliente lucas = new Cliente();
        lucas.setNome("Lucas");

        IConta cc = new ContaCorrente(lucas); // ou Conta ou ContaCorrente
        IConta poupanca = new ContaPoupanca(lucas);// ou Conta ou ContaPoupanca

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
