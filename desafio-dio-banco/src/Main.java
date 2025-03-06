public class Main {
    public static void main(String[] args) {

        Banco dioBank = new Banco("DIO BANK");

        Cliente ezequiel = new Cliente();
        ezequiel.setNome("Ezequiel");

        Conta contaCorrente = new ContaCorrente(ezequiel, TipoConta.CORRENTE);
        dioBank.adicionarConta(contaCorrente);
        Conta poupanca = new ContaPoupanca(ezequiel, TipoConta.POUPANCA);
        dioBank.adicionarConta(poupanca);

        contaCorrente.depositar(100.0);
        contaCorrente.transferir(100.0, poupanca);

        contaCorrente.imprimirExtrato();
        poupanca.imprimirExtrato();

        System.out.println();
        dioBank.imprimeContas();


    }
}
