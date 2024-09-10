public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta(123321, "GABRIEL DIAS", 1200.00);
        Conta conta2 = new Conta(67878, "ANA RODRIGUES", 35.00);

        conta1.exibirInformacoes();
        System.out.println();
        conta2.exibirInformacoes();
        System.out.println();

        conta1.depositar(200.00);
        conta1.sacar(150.00);

        conta2.depositar(-50.00);
        conta2.sacar(600.00);

        System.out.println();
        conta1.exibirInformacoes();
        System.out.println();
        conta2.exibirInformacoes();
    }
}
