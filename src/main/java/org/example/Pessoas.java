package org.example;

import java.util.List;

public class Pessoas {
    private String nome;
    private int idade;
    private List<Enderecos> enderecos;

    public Pessoas(String nome, int idade, List<Enderecos> enderecos) {
        this.nome = nome;
        this.idade = idade;
        this.enderecos = enderecos;
    }

    public Pessoas(){

    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public List<Enderecos> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Enderecos> enderecos) {
        this.enderecos = enderecos;
    }

    public void visualizarDados() {
        System.out.println("Dados");
        System.out.println("Nome: " + nome + " Idade: " + idade);
        System.out.println("Endereços: ");
        for (Enderecos endereco : enderecos) {
            System.out.println("Rua: " + endereco.getRua() + " Número: " + endereco.getNumero());
            System.out.println("------------------------- ");
        }
    }


}
