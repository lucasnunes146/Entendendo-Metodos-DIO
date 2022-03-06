package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Lista {
    public static void main(String[] args) {
        //List<Object> notas = new ArrayList<>();
        //ArrayList<Double> notas1 = new ArrayList<>();
        //notas.add(10d);
        // notas1.add(3.5);
        //notas2.add(9d);
        //notas3.add(10d);
        //System.out.println(notas);
        //System.out.println(notas1);
        //System.out.println(notas2);
        //System.out.println(notas3);

        //List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        //List<Double> notas = new java.util.ArrayList<>(List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6)); //lista imutável
        ArrayList<Double> notas = new ArrayList<>();
        notas.add(1d);
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.6);
        notas.add(11d);
        notas.add(56d);
        notas.add(5d);
        System.out.println(notas);

        System.out.println("posição nota 5:"+ notas.indexOf(5d));
        notas.remove(5d);
        System.out.println("posição nota 5:"+ notas.indexOf(5d));
        System.out.println("adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);
        System.out.println("substitua a nota 7 pela nota 6: ");
        notas.set(notas.indexOf(7d), 6d);
        System.out.println(notas);
        System.out.println("verique se a nota 5 está presente: "+notas.contains(5d));
        for (Double nota: notas) System.out.println(nota);
        System.out.println("exiba a terceira nota adicionada: "+notas.get(2));
        System.out.println("exiba a menor nota: "+ Collections.min(notas));
        // collections implementam a interface Comparable
        System.out.println("exiba a maior nota: "+ Collections.max(notas));
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("exiba a soma dos valores: "+soma);
        System.out.println("exiba a média das notas: "+(soma/notas.size()));
        System.out.println("remova a nota 0: "+notas.remove(0d));
        System.out.println(notas);
        System.out.println("remova a nota na posição 0: "+ notas.remove(0));
        System.out.println(notas);
        System.out.println("remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);
        System.out.println("apague toda a lista: ");
        notas.clear();
        System.out.println(notas);
        System.out.println("a lista está vazia? "+notas.isEmpty());

    }
}
