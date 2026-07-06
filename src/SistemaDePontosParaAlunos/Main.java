package SistemaDePontosParaAlunos;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Nicolas");

        aluno.ganharPontos(1000);
        aluno.exibirStatus();
    }
}
