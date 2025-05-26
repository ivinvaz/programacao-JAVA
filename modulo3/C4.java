package modulo3;

public class C4 {
    public abstract class FormaGeometrica {
        private String cor;

        public FormaGeometrica(String cor) {
            this.cor = cor;
        }

        public String getCor() {
            return cor;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public abstract double calcularArea();
    }

    public interface Desenhavel {
        void desenhar();
    }

    public class Circulo extends FormaGeometrica implements Desenhavel {
        private double raio;

        public Circulo(String cor, double raio) {
            super(cor);
            this.raio = raio;
        }

        public double getRaio() {
            return raio;
        }

        @Override
        public double calcularArea() {
            return Math.PI * raio * raio;
        }

        @Override
        public void desenhar() {
            System.out.println("Desenhando um círculo de raio " + raio + " e cor " + getCor());
        }

        @Override
        public String toString() {
            return "Círculo [cor=" + getCor() + ", raio=" + raio + ", área=" + String.format("%.2f", calcularArea())
                    + "]";
        }
    }

    public static void main(String[] args) {
        C4 c4Instance = new C4();
        Circulo circulo = c4Instance.new Circulo("Verde", 7.0);
        System.out.println(circulo);
        circulo.desenhar();
    }
    
}