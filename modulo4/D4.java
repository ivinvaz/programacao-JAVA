package modulo4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class D4 {
    public static void main(String[] args) {
        Map<String, String> capitais = new HashMap<>();
        capitais.put("Brasil", "Brasília");
        capitais.put("Argentina", "Buenos Aires");
        capitais.put("Uruguai", "Montevidéu");

        Set<String> paises = capitais.keySet();
        for (String pais : paises) {
            System.out.println("País: " + pais);
        }
    }
}
