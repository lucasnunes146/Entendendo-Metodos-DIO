    package exceptions;

    import javax.swing.*;
    import java.io.*;

    public class CheckedExceptions {
        public static void main(String[] args) {
            String nomeDoArquivo = "romance-blake-crouch.txt";

            try {
                imprimirArquivoNoConsole(nomeDoArquivo);
            } catch (FileNotFoundException e){ //exception da classe específica da classe File
                e.printStackTrace();
                JOptionPane.showInputDialog(null,
            "Ocorreu um erro inesperado! Entre em contato com o suporte!"+ e.getCause());
            } catch (IOException e) {
                //e.printStackTrace();
                JOptionPane.showInputDialog(null,
            "Revise o nome do arquivo que você deseja imprimir!"+ e.getCause());
            } finally {
                System.out.println("Chegou no finally!");
            }

            System.out.println("Apesar da exception ou não, o programa continua...");
        }
        public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException{
            File file = new File(nomeDoArquivo);

            BufferedReader br = new BufferedReader(new FileReader(file.getName()));
            String line = br.readLine();

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            do{
                bw.write(line);
                bw.newLine();
                line=br.readLine();
            } while (line != null);
            bw.flush();
            bw.close();
        }
    }
