package AgendaDeContatos;

import java.util.List;

public class Contato {
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone) {
        this.telefone = telefone;
        this.nome = nome;
    }

    public static void exibirLista(List<Contato> contatos){
        int numeroInicial = 1;
        for (int i = 0; i < contatos.size(); i++){
            System.out.println(numeroInicial + ". " + contatos.get(i).nome + " - " + contatos.get(i).telefone);
            numeroInicial++;
        }
    }
}
