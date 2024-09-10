public class Aluno {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Aluno(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public boolean eMenorDeIdade() {
        return idade < 18;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
        System.out.println("IMC: " + calcularIMC());
        System.out.println("Menor de idade: " + (eMenorDeIdade() ? "Sim" : "Não"));
    }

}
