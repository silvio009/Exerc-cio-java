package br_alura_fiap_bean;

import java.util.Calendar;

public class ContaPoupanca extends Conta implements ContaInvestimento{

    public float taxa;

    public static final float rendimento = 10;


    public ContaPoupanca(int agencia, int numero, Calendar dataAbertura, double saldo) {
        super(agencia, numero, dataAbertura, saldo);
    }

    public ContaPoupanca(int agencia, int numero, Calendar dataAbertura, double saldo, float taxa) {
        super(agencia, numero, dataAbertura, saldo);
        this.taxa = taxa;
    }


    @Override

    public void depositar(double valor){
        saldo+= valor;
        System.out.println("Deposito feito com sucesso, seu saldo ficou: "+ saldo);
    }

    public void retirar(double valor){
        taxa = 100;
        if (saldo >= valor + taxa){
            saldo -= (valor + taxa);
            System.out.println("saque realizado com sucesso"+" || "+"SALDO: "+saldo+"||"+ valor + "||" +"taxa paga :"+ taxa );
        }else {
            System.out.println("seu saldo é insuficiente:" + saldo);
        }
    }

   public double calcularRetornoInvestimento() {
        return saldo * rendimento;
   }

    public String toString() {
        // Formatando a data de abertura no formato "dd/MM/yyyy"
        String dataFormatada = String.format("%1$td/%1$tm/%1$tY", dataAbertura);
        return dataFormatada;
    }

    public float getTaxa() {
        return taxa;
    }

    public void setTaxa(float taxa) {
        this.taxa = taxa;
    }
}
