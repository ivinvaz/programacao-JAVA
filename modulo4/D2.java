package modulo4;
import java.util.ArrayList;
import java.util.List;

public class D2 {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();

        palavras.add("Java");
        palavras.add("Python");
        palavras.add("C++");
        palavras.add( 2,"JavaScript");

        System.out.println(palavras);
        System.out.println(palavras.remove("Java"));
        System.out.println(palavras.remove(0));
        System.out.println(palavras.get(1));
        System.out.println(palavras.size());
        System.out.println(palavras.contains("C++"));
        System.out.println(palavras.indexOf("JavaScript"));
        System.out.println(palavras.isEmpty());
        System.out.println(palavras.set(0,"Novo"));
        System.out.println(palavras);
    }
}
