package br_alura_fiap_bean;

import java.util.Calendar;

public class ContaCorrente extends Conta{

    public ContaCorrente(int agencia, int numero, Calendar dataAbertura, double saldo) {
        super(agencia, numero, dataAbertura, saldo);
    }
    public TipoConta tipo;

    public ContaCorrente(int agencia, int numero, Calendar dataAbertura, double saldo, TipoConta tipo) {
        super(agencia, numero, dataAbertura, saldo);
        this.tipo = tipo;
    }

    public void depositar(double valor){
        saldo+= valor;
        System.out.println("Deposito feito com sucesso, seu saldo ficou: "+ saldo);
    }
    public void retirar(double valor){
        try {
            if (tipo == TipoConta.comum|| saldo < valor){
                System.out.println("Seu saldo: "+saldo+ " é insuficiente para relizar o saque de: " + valor + " Reais");
            }else {
                System.out.println("Saque realizado com sucesso!");
            }
        }catch (Exception error){
            System.out.println("Error inesperado: " +  error);
        }

    }




}
