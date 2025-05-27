package modulo4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class D3 {

    public static void main(String[] args) {
        // HashSet
        Set<Integer> hashSetDeInteiros = new HashSet<>();
        hashSetDeInteiros.add(10);
        hashSetDeInteiros.add(5);
        hashSetDeInteiros.add(15);
        hashSetDeInteiros.add(5);
        hashSetDeInteiros.add(2);

        System.out.println("HashSet de Inteiros:");
        System.out.println(hashSetDeInteiros);

        // TreeSet
        Set<Integer> treeSetDeInteiros = new TreeSet<>();
        treeSetDeInteiros.add(10);
        treeSetDeInteiros.add(5);
        treeSetDeInteiros.add(15);
        treeSetDeInteiros.add(5);
        treeSetDeInteiros.add(2);

        System.out.println("\nTreeSet de Inteiros:");
        System.out.println(treeSetDeInteiros);

        Map<String, Double> mapaDePrecos = new HashMap<>();
        mapaDePrecos.put("Notebook", 2500.00);
        mapaDePrecos.put("Mouse", 25.50);
        mapaDePrecos.put("Teclado", 75.00);
        mapaDePrecos.put("Monitor", 900.00);

        System.out.println("Mapa de Produtos e Preços (HashMap):");
        System.out.println(mapaDePrecos);
    }
}
