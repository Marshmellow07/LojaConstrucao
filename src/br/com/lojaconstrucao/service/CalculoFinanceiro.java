package br.com.lojaconstrucao.service;

public class CalculoFinanceiro {

    public double calcularLucro(double valorVenda, double valorCusto) {
        return valorVenda - valorCusto;
    }

    public double calcularDesconto(double valor, double percentual) {
        return valor - (valor * percentual / 100);
    }
}
