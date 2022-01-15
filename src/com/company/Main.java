package com.company;

public class Main {

    public static void main(String[] args) {

        Conta cc = new ContaCorrente();

        cc.depositar(100.0);

        Conta cp = new ContaPoupanca();

        cc.transferir(cp, 100);

        cp.depositar(100);


        cc.imprimirEtrato();
        cp.imprimirEtrato();
    }
}
