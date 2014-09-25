package listacircular;

import java.util.ArrayList;

public class VetorMensagem implements ListaCircular{
    private ArrayList<Mensagem> lista = new ArrayList();

    @Override
    public void indiceAtual(Mensagem mensagem) {
        lista.add(0, mensagem);
    }

    @Override
    public void indicePosterior(Mensagem mensagem) {
        lista.add(0, mensagem);
    }

    @Override
    public void removerAtual(String mensagem) {
        for (int i = 0; i < lista.size(); i++) {
            Mensagem aux = lista.get(i);
            if (aux.getMensagem().equals(mensagem)) {
                lista.remove(i);
                break;
            }
        }
    }

    @Override
    public void imprimirLista() {
        for (Mensagem mensagem : lista) {
            System.out.println(mensagem);
        }
    }
    
}
