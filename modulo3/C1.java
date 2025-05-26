package modulo3;

public class C1 {
    // Classe pai 
    class Animal {
        private String nome;

        public Animal(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }

        public void emitirSom() {
            System.out.println("Som genérico de animal");
        }
    }

    // Classe filha (subclasse)
    class Cachorro extends Animal {
        public Cachorro(String nome) {
            super(nome);
        }

        @Override // Indica que este método está sobrescrevendo
        public void emitirSom() {
            System.out.println("Au au!");
        }
    }

    //intanceOf
}
