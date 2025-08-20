package org.example;

public class Cliente {

    private String nome;
    private int id;

    public Cliente() {
        this.nome = null;
        this.id = 0;
    }
    public Cliente(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


}
