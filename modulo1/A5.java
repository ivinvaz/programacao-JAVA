package modulo1;

public class A5 {
    public int somar(int a, int b) {
        int resultado = a + b;
        return resultado;
    }

    public double calcularAreaCirculo(double raio) {
        return Math.PI * raio * raio; 
    }

    public static void main(String[] args) {
        A5 calc = new A5();

        int soma = calc.somar(5, 3);
        System.out.println("A soma é: " + soma);

        double area = calc.calcularAreaCirculo(2.5);
        System.out.println("A área do círculo é: " + area);
    }
};
