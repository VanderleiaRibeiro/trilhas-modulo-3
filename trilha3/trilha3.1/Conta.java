public class Conta {
    private int numeroConta;
    private String nomeCliente;
    private double saldo;

    public Conta(int numeroConta, String nomeCliente, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Saldo Atual: R$" + saldo);
    }
}