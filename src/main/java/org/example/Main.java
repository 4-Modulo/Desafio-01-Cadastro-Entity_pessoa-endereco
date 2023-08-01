package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Pessoas> pessoas = new ArrayList<>();
        List<Enderecos> enderecos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i<2; i++){
            System.out.println("Digite seu nome: ");
            String nome = scanner.next();
            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();
            System.out.println("Quantos endereços você irá cadastrar? ");
            int qtdEnderecos = scanner.nextInt();
            for(int j =0; j<qtdEnderecos; j++){
                System.out.println("Digite sua rua: ");
                String endereco = scanner.next();
                System.out.println("Digite o numero da sua casa: ");
                int numero = scanner.nextInt();
                enderecos.add(new Enderecos(endereco,numero));
            }
            pessoas.add(new Pessoas(nome,idade, enderecos));
            enderecos.clear();
        }



    }
}