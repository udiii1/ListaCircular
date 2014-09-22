package listacircular;

public class Celula {
    private Mensagem mensagem;
    private Celula proxima;

    public Celula(Mensagem mensagem) {
        this.mensagem = mensagem;
        this.proxima = null;
    }

    public Mensagem getMensagem() {
        return mensagem;
    }

    public void setMensagem(Mensagem mensagem) {
        this.mensagem = mensagem;
    }

    public Celula getProxima() {
        return proxima;
    }

    public void setProxima(Celula proxima) {
        this.proxima = proxima;
    }
}
