package modulo2;

public class B3 {
    class Pessoa {
        String nome;
        int idade;
        String profissao;

        public Pessoa(String nomeInicial, int idadeInicial) {
            nome = nomeInicial;
            idade = idadeInicial;
            this.profissao = "Não especificada";
            System.out.println("Pessoa " + nome + " de " + idade + " anos criada.");
        }

        public Pessoa(String nomeInicial, int idadeInicial, String profissaoInicial) {
            nome = nomeInicial;
            idade = idadeInicial;
            profissao = profissaoInicial;
            System.out.println("Pessoa " + nome + " de " + idade + " anos, profissional " + profissao + ", criada.");
        }

        void apresentar() {
            System.out.println("Nome: " + nome + ", Idade: " + idade + ", Profissão: " + profissao);
        }

        public static void main(String[] args) {
            B3 b3Intance = new B3();
            Pessoa pessoa1 = b3Intance.new Pessoa("Alice", 28);
            pessoa1.apresentar();

            Pessoa pessoa2 = b3Intance.new Pessoa("Bob", 35, "Engenheiro");
            pessoa2.apresentar();
        }
    }
}
