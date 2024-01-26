package Desafio;

import java.util.Scanner;
public class desafioJava {
    public static void main(String[] args) {
        Scanner leitorDeEntradas = new Scanner(System.in);

        System.out.print("Digite o valor do salário: ");
        float valorSalario = leitorDeEntradas.nextFloat();

        System.out.print("Digite o valor do benefício: ");
        float valorBeneficios = leitorDeEntradas.nextFloat();

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100) {
            valorImposto = 0.05F * valorSalario;
        } else if (valorSalario >= 1100.01 && valorSalario <= 2500) {
            valorImposto = 0.10F * valorSalario;
        } else if (valorSalario > 2500) {
            valorImposto = 0.15F * valorSalario;
        }

        System.out.print("O valor líquido a receber é: ");
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", saida));

    }
}
