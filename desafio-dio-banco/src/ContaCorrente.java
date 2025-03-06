public class ContaCorrente extends Conta {


    public ContaCorrente(Cliente cliente, TipoConta tipoConta) {
        super(cliente, tipoConta);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        imprimirInformacoesComuns();
    }

}
