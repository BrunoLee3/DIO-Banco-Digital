public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Bruno");
        cliente.setScore(750);

        Conta contaCorrente = new ContaCorrente(cliente);
        ContaPoupanca contaPoupanca = new ContaPoupanca(cliente);

        Banco banco = new Banco();
        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);

        contaCorrente.depositar(200);
        contaCorrente.transferir(50, contaPoupanca);

        contaCorrente.imprimirExtrato();
        System.out.println();
        contaPoupanca.imprimirExtrato();

        System.out.println();
        contaPoupanca.checarRendimento(5);

        System.out.println();
        contaCorrente.solicitarCredito(cliente.getScore());

        System.out.println();
        banco.imprimirContas();

        banco.removerConta(contaPoupanca);
        System.out.println();
        banco.imprimirContas();

    }
}
