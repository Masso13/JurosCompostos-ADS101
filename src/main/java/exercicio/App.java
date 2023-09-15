package exercicio;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner teclado = new Scanner(System.in);
        Operacoes operacoes = new Operacoes();

        System.out.print("Digite o investimento inicial: ");
        double investimento = teclado.nextDouble();

        System.out.print("Digite a taxa anual (exemplo 5%): ");
        double taxa = teclado.nextDouble()/100;

        for (int ano = 1; ano <= 10; ano++) {
            double dinheiro_ano = operacoes.calculaJuros(investimento, taxa, ano);
            System.out.format("No %dº ano, a quantidade será %f\n", ano, dinheiro_ano);
        }

        teclado.close();
    }
}
