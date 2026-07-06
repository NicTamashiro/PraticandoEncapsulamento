package ControleSaldoBancario;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta("Nicolas");
        conta.depositar(1000);
        conta.sacar(1200);
        conta.exibirSaldo();
    }
}
