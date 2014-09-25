package listacircular;

public class IncluirFimRemover implements ListaCircular {

    private Celula inicio = null;
    private Celula fim = null;

    @Override
    public void indiceAtual(Mensagem mensagem) {
        Celula nova = new Celula(mensagem);
        if (inicio == null) {
            inicio = nova;
            fim = nova;
            fim.setProxima(inicio);
        } else {
            fim.setProxima(nova);
            fim = nova;
            fim.setProxima(inicio);
        }
        System.out.println("Numero inserido no fim da lista!!");
    }

    @Override
    public void indicePosterior(Mensagem mensagem) {
        Celula nova = new Celula(mensagem);
        if (inicio == null) {
            inicio = nova;
            fim = nova;
            fim.setProxima(inicio);
        } else {
            fim.setProxima(nova);
            fim = nova;
            fim.setProxima(inicio);
        }
        System.out.println("Numero inserido no fim da lista!!");
    }

    @Override
    public void removerAtual(String mensagem) {
    }

    @Override
    public void imprimirLista() {

    }

}
