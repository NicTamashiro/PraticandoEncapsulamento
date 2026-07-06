package AvaliacaoDeFilmes;

import java.util.ArrayList;
import java.util.List;

public class Filme {
    public String titulo;
    public List<Integer> avalioacoes;

    public Filme(String titulo) {
        this.titulo = titulo;
        this.avalioacoes = new ArrayList<>();
    }

    public void adicionarAvaliacao(int avaliacao){
        avalioacoes.add(avaliacao);
    }

    public void exibeMediaAvaliacoes(){
        double soma = 0;
        for (Integer avaliacao : avalioacoes){
            soma += avaliacao;
        }

        double media = soma / avalioacoes.size();

        System.out.printf("Media de avaliacoes para %s: %.2f%n", titulo, media);
    }
}
