public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Mateus", 1994, 1.64, 2022);
        Pessoa pessoa1 = new Pessoa("Paloma", 1997, 1.65, 2022);

        Pessoa.CalculaIdadePessoa(pessoa);
        Pessoa.CalculaIdadePessoa(pessoa1);
    }
}
