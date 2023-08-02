package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Pessoas> pessoas = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opc;

        do{
            exibirMenu();
            opc = scanner.nextInt();
            switch (opc) {
                case 1:
                    create(scanner);
                    break;
                case 2:
                    findAll();
                    break;
                case 3:
                    search(scanner);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            }while (opc != 0);



    }
    private static void exibirMenu() {
        System.out.println("============ Menu ===========");
        System.out.println("1 - Cadastrar uma nova pessoa");
        System.out.println("2 - Exibir lista pessoa cadastradas");
        System.out.println("3 - Pesquisar por pessoas pelo nome");
        System.out.println("0 - Sair");
        System.out.println("=============================");

        System.out.print("Escolha uma opção: ");
    }

    private static void findAll() {
        if (pessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa cadastrada.");
        } else {
            System.out.println("==== Pessoas Cadastradas ====");
            for (Pessoas pessoa : pessoas) {
                System.out.println("Nome: " + pessoa.getNome() + " Idade: " + pessoa.getIdade());
                System.out.println("--------------------------------- ");
            }
        }
    }

    private static void create(Scanner scanner) {
            System.out.println("Digite seu nome: ");
            String nome = scanner.next();
            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            List<Enderecos> enderecos = new ArrayList<>();

            System.out.println("Quantos endereços você irá cadastrar? ");
            int qtdEnderecos = scanner.nextInt();
            for (int j = 0; j < qtdEnderecos; j++) {
                System.out.println("Digite sua rua: ");
                String endereco = scanner.next();
                System.out.println("Digite o número da sua casa: ");
                int numero = scanner.nextInt();
                enderecos.add(new Enderecos(endereco, numero));


            pessoas.add(new Pessoas(nome, idade, enderecos));
        }
    }
    private static void search(Scanner scanner) {
        System.out.print("Digite o nome da pessoa que deseja pesquisar: ");
        String nomePesquisar = scanner.next();

        boolean pessoaEncontrada = false;

        for (Pessoas pessoa : pessoas) {
            if (pessoa.getNome().equalsIgnoreCase(nomePesquisar)) {
                System.out.println("==== Informações da pessoa encontrada ====");
                pessoa.visualizarDados();
                System.out.println("===========================================");
                pessoaEncontrada = true;
            }
        }

        if (!pessoaEncontrada) {
            System.out.println("Pessoa não encontrada.");
        }
    }


}