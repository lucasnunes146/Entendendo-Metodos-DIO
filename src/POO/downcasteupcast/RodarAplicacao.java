package POO.downcasteupcast;

public class RodarAplicacao {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        // upcast (implícito)
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        /* downcast (explícito) - pode dar erro caso haja tipos de dados inexistentes na classe mãe,
        * isso deve ser avitado*/
        Gerente gerente1 = (Gerente) new Funcionario();
        Vendedor vendedor1 = (Vendedor) new Funcionario();
    }
}
