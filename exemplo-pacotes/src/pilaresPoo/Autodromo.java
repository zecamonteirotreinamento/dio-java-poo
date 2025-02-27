package pilaresPoo;

public class Autodromo {
    public static void main(String[] args) {
        
        Carro jeep = new Carro();
        jeep.setChassi("546854684");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("656657265");
        z400.ligar();

        Veiculo coringa = jeep;
        coringa.ligar();

    }
}
