package ControleSaldoBancario;

public class Conta {
    private String titular;
    private double saldo;

    public Conta(String titular) {
        this.titular = titular;
    }

    public void depositar(double valor){
        if (valor > 0){
            this.saldo = valor;
        } else {
            System.out.println("Valor invalido");
        }
    }

    public void sacar(double valor){
        if (valor > saldo){
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= valor;
        }
    }

    public void exibirSaldo(){
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}
