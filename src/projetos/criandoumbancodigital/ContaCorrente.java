package projetos.criandoumbancodigital;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato C/C ===");
        super.imprimirInfosComuns();
    }
}
