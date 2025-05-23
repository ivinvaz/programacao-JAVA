package modulo2;

public class B2 {
    static class Pessoa {
        String nome;
        int idade;
    
        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }
    
        void apresentar() {
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade + " anos");
        }
    
        public static void main(String[] args) {
            B2.Pessoa pessoa1 = new B2.Pessoa("Maria", 30);
            pessoa1.apresentar();
    
            B2.Pessoa pessoa2 = new B2.Pessoa("João", 25);
            pessoa2.apresentar();
        }
    }
}
