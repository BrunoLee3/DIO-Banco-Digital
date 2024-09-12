public class ContaPoupanca extends Conta{

    private static final double RENDIMENTO = 0.3;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("EXTRATO CONTA POUPANCA");
        super.imprimirInfoConta();
    }

    public void checarRendimento(int meses){
        double saldoNovo = (getSaldo() * RENDIMENTO * meses) + getSaldo();
        System.out.println(String.format("Previsao de saldo da poupanca em %d meses: %.2f", meses, saldoNovo));
    }
}
