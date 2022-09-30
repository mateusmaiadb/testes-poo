public class Pessoa {
    private String nome;
    private int dataNascimento;
    private int anoAtual;

    public int getAnoAtual() {
        return anoAtual;
    }

    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }

    private double altura;

    public Pessoa(String nome, int dataNascimento, double altura, int anoAtual) {
        this.nome = nome;
        this.anoAtual = anoAtual;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public static int CalculaIdadePessoa(Pessoa pessoa) {

        int soma = 0;

        soma = (pessoa.getAnoAtual() - pessoa.getDataNascimento());

        System.out.println(pessoa.getNome() + " tem " + soma + " anos");

        return soma;
    }
}
