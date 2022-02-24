package POO.polimorfismo;

public class RodarPrograma {
    public static void main(String[] args) {
        ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};

        for (ClasseMae classe: classes){
            classe.metodo1(); /* ocorreu um polimorfismo, pois o método se comportou de acordo com o tipo
    de dado da ClasseFilha1, pois há uma instância de ClasseFilha1 no vetor criado em cima da classe tipo
    ClasseMae*/
        }

        System.out.println("");

        for (ClasseMae classe : classes) {
            classe.metodo2(); // não há, pois uma das classes não possui o método 2.
        }

        System.out.println("");

        ClasseFilha2 classeFilha2 = new ClasseFilha2();
        classeFilha2.metodo2(); // ocorreu apenas a sobrescrita
    }
}
