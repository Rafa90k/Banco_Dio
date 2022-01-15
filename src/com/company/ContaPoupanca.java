package com.company;

public class ContaPoupanca extends Conta{

    @Override
    public void depositar(Double valor) {

    }

    @Override
    public void transferir(Conta contaDestino, Double valor) {

    }

    @Override
    public void imprimirEtrato() {

        System.out.println("+++Imprimir extrato Conta poupanca+++");
        super.imprimirInfosComun();
    }
}
