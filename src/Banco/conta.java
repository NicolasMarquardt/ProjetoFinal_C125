package Banco;
import Execesao.saldoinsuficiente;

//Classe abstrata
public abstract class conta {
    //Declaração de variaveis
    protected int numero;
    protected double saldo;
    protected cliente cliente;
    protected banco banco;

    //Construtor
    public conta(int numero, double saldo, cliente cliente, banco banco){
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
        this.banco = banco;

    }
    //Metodo sacar
    public void sacar(double valor) throws saldoinsuficiente {
        if (this.saldo >= valor){
            this.saldo -= valor;
        }
        else{
            throw new saldoinsuficiente("Saldo insuficiente");
        }
    }
    //Metodo depositar
    public void depositar(double valor){
        this.saldo += valor;
    }

    //Metodo abstrato para mostrar informações
    public abstract void extrato();

    //gets
    public double getSaldo() {
        return saldo;
    }
}
