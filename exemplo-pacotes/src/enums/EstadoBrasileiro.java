package enums;

public enum EstadoBrasileiro {

    SAO_PAULO("SP", "São Paulo", 11),
    RIO_JANEIRO("RJ", "Rio de Janeiro", 12),
    PIAUI("PI", "Piauí", 13), 
    MARANHAO("MA", "Maranhao", 14),
    CEARA ("CE", "Ceará", 15);

    private String nome;
    private String sigla;
    private int codigoIbge;

    private EstadoBrasileiro(String sigla, String nome, int codigoIbge) {
        this.nome = nome;
        this.sigla = sigla;
        this.codigoIbge = codigoIbge;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public int getCodigoIbge() {
        return codigoIbge;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }

}
