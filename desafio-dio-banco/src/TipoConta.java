public enum TipoConta {

    CORRENTE("Corrente"),
    POUPANCA("Poupança");

    private final String nomeExibicao;

    TipoConta(String nomeExibicao) {
        this.nomeExibicao = nomeExibicao;
    }

    @Override
    public String toString() {
        return nomeExibicao;
    }

}
