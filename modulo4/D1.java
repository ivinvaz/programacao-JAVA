package modulo4;

public class D1 {
        public static void verificarIdade(int idade) {
            if (idade < 0) {
                throw new IllegalArgumentException("A idade não pode ser negativa.");
            } else if (idade < 18) {
                throw new RuntimeException("Acesso negado. Menores de idade não permitidos.");
            } else {
                System.out.println("Acesso permitido.");
            }
        }
    
        public static void main(String[] args) {
            try {
                verificarIdade(15);
            } catch (RuntimeException e) {
                System.err.println("Erro: " + e.getMessage());
            }
    
            try {
                verificarIdade(-5);
            } catch (IllegalArgumentException e) {
                System.err.println("Erro: " + e.getMessage());
            }
        }
}