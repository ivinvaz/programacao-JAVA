package modulo3;

public class C3 {
    public abstract class FormaGeometrica {
        private String cor;
    
        public FormaGeometrica(String cor) {
            this.cor = cor;
        }
    
        // Método concreto
        public String getCor() {
            return cor;
        }
    
        public void setCor(String cor) {
            this.cor = cor;
        }
    
        // Método abstrato  
        public abstract double calcularArea();
    }

    public interface Imprimivel {
        void imprimir();
    }

    public class Carro implements Imprimivel {
        private String modelo;
    
        public Carro(String modelo) {
            this.modelo = modelo;
        }
    
        public String getModelo() {
            return modelo;
        }
    
        @Override
        public void imprimir() {
            System.out.println("Carro: Modelo = " + modelo);
        }
    }
}
