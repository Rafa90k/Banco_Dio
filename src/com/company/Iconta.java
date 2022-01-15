package com.company;

public interface Iconta {

    void sacar(Double valor);

    void depositar(Double valor);

    void transferir(Conta contaDestino, Double valor);

    void imprimirEtrato();

    void depositar(double valor);

    void transferir(Conta contaDestino, double valor);
}
