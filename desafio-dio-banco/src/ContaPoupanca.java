public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente, TipoConta tipoConta) {
        super(cliente, tipoConta);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        imprimirInformacoesComuns();
    }

}
