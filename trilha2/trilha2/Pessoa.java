public class Pessoa {
    private String nome;
    private String dtNascimento;
    private Universidade universidade;

    public Pessoa(String nome, String dtNascimento, Universidade universidade) {
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.universidade = universidade;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dtNascimento;
    }

    public Universidade getUniversidade() {
        return universidade;
    }

    public String informacoes() {
        return nome + " nasceu em " + dtNascimento + " e trabalhou na universidade " + universidade.getNome();
    }
}
