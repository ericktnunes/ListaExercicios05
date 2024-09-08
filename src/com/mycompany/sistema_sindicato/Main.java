package com.mycompany.sistema_sindicato;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sindicato sindicato = new Sindicato();
        String continuar = "sim";

        while (continuar.equalsIgnoreCase("sim")) {
            System.out.print("Nome do Professor: ");
            String nome = scanner.nextLine();

            System.out.print("CPF do Professor: ");
            String cpf = scanner.nextLine();

            System.out.print("Titulacao (Doutor, Mestre, Especialista): ");
            String titulacao = scanner.nextLine();

            System.out.print("Salario do Professor: ");
            double salario = scanner.nextDouble();

            //Linha para debug do nextDouble
            scanner.nextLine();

            Professor professor = new Professor(nome, cpf, titulacao, salario);
            sindicato.adicionarProfessor(professor);

            System.out.print("Deseja adicionar outro professor? (sim/nao): ");
            continuar = scanner.nextLine();
        }

        System.out.println("Total arrecadado pelo sindicato: R$ " + sindicato.getTotalArrecadado());
        System.out.println("Número de professores Mestres: " + sindicato.getTotalMestres());

    }
}
