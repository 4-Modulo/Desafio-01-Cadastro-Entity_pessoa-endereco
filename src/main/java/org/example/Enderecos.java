package org.example;

public class Enderecos {
    private String rua;
    private int numero;

    public Enderecos(String rua, int numero) {
        this.rua = rua;
        this.numero = numero;
    }
    public Enderecos() {

    }
    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
