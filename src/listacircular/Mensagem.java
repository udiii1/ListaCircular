package listacircular;

import java.util.Objects;

public class Mensagem {
    String mensagem;

    public Mensagem(String mensagem) {
        this.mensagem = mensagem;
    }
       
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mensagem other = (Mensagem) obj;
        if (!Objects.equals(this.mensagem, other.mensagem)) {
            return false;
        }
        return true;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String toString() {
        return "Mensagem{" + "mensagem=" + mensagem + '}';
    }
}
