package RegistroDeNotas;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private List<Double> notas;
    private int quantidadeNotasValidas;

    public Disciplina(String nome) {
        this.nome = nome;
        this.notas = new ArrayList<>();
    }

    public void adicionarNota(double nota){
        if(nota >= 0 && nota <= 10){
            notas.add(nota);
            quantidadeNotasValidas++;
        } else {
            System.out.println("Nota invalida ignorada: " + nota);
        }
    }

    public void exibeTotalNotasValidas(){
        System.out.println("Total de notas validas: " + quantidadeNotasValidas);
    }

    public void exibeMedia(){
        double soma = 0;
        for(Double nota : notas){
            soma += nota;
        }

        double media = soma / quantidadeNotasValidas;

        System.out.printf("Media em %s: %.2f%n", nome, media);
    }
}
