package modulo1;
import java.util.Scanner;
public class A4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i);
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Escreva um número: ");
        int numero = input.nextInt();
        System.out.println("Seu número é: " + numero);
        input.close();
    } 
}
