import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    protected List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void imprimeContas() {
        System.out.println("=== RELATÓRIO DE CONTAS ===");
        System.out.println("Nome Cliente / Tipo Conta / Agência / Número ");
        for (Conta c : contas) {
            System.out.println(c.cliente.getNome() + " / " + c.tipoConta + " / " + c.getAgencia() + " / " + c.getNumero());
        }
    }

}
