package listacircular;

import java.util.Scanner;

public class ListarRemover {
    public static void main(String[] args) {
        int op;
        String mensagem;
        
        VetorMensagem lista = new VetorMensagem();
        Scanner entrada = new Scanner(System.in);
        
        do {            
            System.out.println("1-Cadastrar mensagem.");
            System.out.println("2-Remover mensagem atual.");
            System.out.println("3-Mostrar mensagens cadastradas.");
            System.out.println("4-Sair.");
            
            op = entrada.nextInt();
            entrada.nextLine();
            
            switch (op) {
                case 1:
                    System.out.println("Informe a mensagem a ser cadastrada:");
                    mensagem = entrada.nextLine();
                    lista.indicePosterior(new Mensagem (mensagem));
                    break;                            
                case 2: 
                    System.out.println("Removendo a mensagem atual");
                    mensagem = entrada.nextLine();
                    lista.removerAtual(mensagem);
                    break;
                case 3:
                    lista.imprimirLista();
                    break;
                default:
                    System.out.println("Até logo.");
            }
        } while (op != 4);
    }
}
