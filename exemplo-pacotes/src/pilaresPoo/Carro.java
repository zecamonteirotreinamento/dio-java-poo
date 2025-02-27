package pilaresPoo;

public class Carro extends Veiculo {

    @Override
    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO");
    }

    private void confereCombustivel() {
        System.out.println("Conferundo combustível...");
    }

    private void confereCambio() {
        System.out.println("Conferindo câmbio em P");
    }

}
