package com.udemy;

import com.udemy.entities.Funcionario;
import com.udemy.entities.FuncionarioTerceirizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Funcionario> listaFuncionario = new ArrayList<>();

        System.out.print("Número de funcionários: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados do funcionário #" + i + ":");
            System.out.print("Ele é terceirizado (s/n)? ");
            char resposta = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Horas: ");
            int horas = sc.nextInt();
            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();

            if (resposta == 's') {
                System.out.print("Valor adicional: ");
                double valorAdicional = sc.nextDouble();
                listaFuncionario.add(new FuncionarioTerceirizado(nome, horas, valorPorHora, valorAdicional));
            }
            else {
                listaFuncionario.add(new Funcionario(nome, horas, valorPorHora));
            }
        }

        System.out.println();
        System.out.println("Pagamentos:");
        for (Funcionario func : listaFuncionario){
            System.out.println(func.getNome() + " - $ " + String.format("%.2f",func.pagamento()));
        }
        sc.close();
    }
}
