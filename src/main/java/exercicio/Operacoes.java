package exercicio;

public class Operacoes {
    public double calculaJuros(double valor_inicial, double taxa, int periodo) {
        return valor_inicial * Math.pow(1 + taxa, periodo);
    }
}
