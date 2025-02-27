package msnMessenger;

public abstract class ServicoMensagemInstantanea {

    public void enviarMensagem() {
        validarConexaoInternet();
        System.out.println("Enviando mensagem");
        salvarHistoricoMensagens();
    };

    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    };

    public void validarConexaoInternet() {
        System.out.println("Validando conexão com a internet");
    }

    public void salvarHistoricoMensagens() {
        System.out.println("Salvando histórico de mensagens");
    }

}
