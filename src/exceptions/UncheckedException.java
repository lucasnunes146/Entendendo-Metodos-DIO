package exceptions;

import javax.swing.*;


public class UncheckedException {
    public static void main(String[] args) {
        boolean continueLooping = true;


        do {
            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");

            try{
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: "+resultado);
                continueLooping = false;
            } catch (ArithmeticException e){
                JOptionPane.showInputDialog(null, "Impossível dividir um número por 0.");
                e.printStackTrace();
            }
            catch (NumberFormatException e) {
                JOptionPane.showInputDialog(null, "Entrada inválida, informe um número inteiro!"+ e.getMessage());
                e.printStackTrace();
            } finally {
                System.out.println("Chegou no finally");
            }//opcional
        } while (continueLooping);

        System.out.println("Chegou até aqui...");
    }
    public static  int dividir(int a, int b){ return a/ b;}
}
