package com.company;

public abstract class Conta implements Iconta {

    private static final int AGENCIA_PADRAO = 1;

    private static int SEQUENCIAl = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;





    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAl++;
    }

    @Override
    public void sacar(Double valor) {
        saldo -= valor;

    }

    @Override
    public void depositar(double valor) {
        saldo += valor;

    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        sacar(valor);
        contaDestino.depositar(valor);

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComun() {
        System.out.println(String.format("Agenecia: %d", agencia));
        System.out.println(String.format("Numero: %d", numero));
        System.out.println (String.format("Saldo: %.2f", saldo));

    }

}