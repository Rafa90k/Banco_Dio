package com.company;

public class ContaCorrente extends Conta{


    @Override
    public void depositar(Double valor) {

    }

    @Override
    public void transferir(Conta contaDestino, Double valor) {

    }

    @Override
    public void imprimirEtrato() {

        System.out.println("+++Imprimir Extrato Conta Corrente+++");
        super.imprimirInfosComun();
    }



}
