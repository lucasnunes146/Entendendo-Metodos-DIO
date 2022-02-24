package POO.interfaces;

class Calculadora implements OperacaoMatematica{/* no implements você deve importar todos os métodos
da interface, conforme o caso abaixo*/

    @Override
    public void soma(double operando1, double operando2){
        System.out.println("Soma: " + operando1+operando2);
    }
    @Override
    public void subtracao(double operando1, double operando2){
        System.out.println("Subtração: " + (operando1-operando2));
    }
    @Override
    public void divisao(double operando1, double operando2){
        System.out.println("Divisão: " + operando1/operando2);
    }
    @Override
    public void multiplicacao(double operando1, double operando2){
        System.out.println("Soma: " + operando1*operando2);
    }
}
