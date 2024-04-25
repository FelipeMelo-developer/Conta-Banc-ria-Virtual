package Desafio1;

import java.util.Scanner;

public class ControleBancario {
    public static void main(String[] args) {
        //Informações do cliente
        String nome = "Scrooge McDuck 🦆 (Tio Patinhas)";
        String tipoconta = "Corrente";
        double saldo = 2500.00;
        int opcao = 0;

        //Concatenando Informações do cliente
        System.out.println("");
        System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoconta);
        System.out.println("Saldo inicial: R$" + saldo);
        System.out.println("\n◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
        System.out.println("\n");
        System.out.println("Operações");
        System.out.println("\n");

        //Menu de opções
        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2- Transferir valor
                3- Receber valor
                4- Sair
                """;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

        //Condicinal

            if (opcao == 1) {
                System.out.println("O saldo atualizado é R$ " + saldo);
            } else if (opcao == 2) {
                    System.out.println("qual o valor que deseja transferir?");
                    double valor = leitura.nextDouble();
                    if (valor > saldo) {
                        System.out.println("Não há saldo suficiente");
                    } else {
                        saldo = saldo - valor; //ou saldo -= valor
                        System.out.println("Novo Saldo R$ " + saldo);
                    }
                } else if (opcao == 3) {
                    System.out.println("Valor recebido");
                    double valor = leitura.nextDouble();
                    saldo += valor; // é o mesmo que saldo = saldo + valor;
                    System.out.println("Saldo atualizado R$ " + saldo);
                } else if (opcao == 4) {
                System.out.println("ATENÇÃO! Você saiu do sistema, " + nome + ".");
                } else if (opcao !=4) {
                System.out.println("Opção invalida");
            }
        }
    }
}
