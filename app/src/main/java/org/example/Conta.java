package org.example;

public abstract class Conta {

    private static final int NUMERO_AGENCIA = 1;
    private static int NUMERO_CONTA = 1;

    private int agencia;
    private int numero;
    private long saldo; // armazenado em centavos
    private Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.NUMERO_AGENCIA;
        this.numero = NUMERO_CONTA++;
        this.cliente = cliente;
    }

    public void sacar(long valor) {
        saldo -= valor;
    }

    public void depositar(long valor) {
        saldo += valor;
    }

    public void transferir(long valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }
    
    protected void setAgencia(int agencia) {
        this.agencia = agencia;
    }


    public int getNumero() {
        return numero;
    }    

    protected void setNumero(int numero) {
        this.numero = numero;
    }

    public long getSaldo() {
        return saldo;
    }

    protected void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    protected void imprimirInfos() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));   
    }
    
}
