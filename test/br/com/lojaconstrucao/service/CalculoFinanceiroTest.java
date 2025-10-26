package br.com.lojaconstrucao.service;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CalculoFinanceiroTest {

    @Test
    public void testCalcularLucro() {
        CalculoFinanceiro calc = new CalculoFinanceiro();
        double resultado = calc.calcularLucro(100.0, 60.0);

        // Teste padrão JUnit 4
        assertEquals(40.0, resultado, 0.01);

        // Teste com Hamcrest
        assertThat(resultado, is(closeTo(40.0, 0.01)));
    }

    @Test
    public void testCalcularDesconto() {
        CalculoFinanceiro calc = new CalculoFinanceiro();
        double resultado = calc.calcularDesconto(200.0, 10.0);

        // Teste de desconto
        assertThat(resultado, equalTo(180.0));
    }
}
