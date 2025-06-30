package br.com.sistematizacaovvs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SistematizacaoVvsApplicationTests {

    private CalculadoraDiferente calc;

    @Test
    void contextLoads() {
    }

    @BeforeEach
    public void setUp() {
        calc = new CalculadoraDiferente();
    }
    @Test
    public void TPGTAHC_inverteNumero_DeveInverterNumeroSimples() {
        int resultado = calc.inverteNumero(123);
        assertEquals(321, resultado, "123 invertido deve ser 321");
    }

    @Test
    public void TPGTAHC_inverteNumero_DeveInverterNumeroComZeroNoFinal() {
        int resultado = calc.inverteNumero(1200);
        assertEquals(21, resultado, "1200 invertido deve ser 21");
    }

    @Test
    public void TPGTAHC_inverteNumero_DeveInverterNumeroComUmDigito() {
        int resultado = calc.inverteNumero(7);
        assertEquals(7, resultado, "7 invertido deve ser 7");
    }

    @Test
    public void TPGTAHC_inverteNumero_DeveInverterZero() {
        int resultado = calc.inverteNumero(0);
        assertEquals(0, resultado, "0 invertido deve ser 0");
    }

    @Test
    public void TPGTAHC_fatorial_DeveCalcularFatorialDe5() {
        int resultado = calc.fatorial(5);
        assertEquals(120, resultado, "Fatorial de 5 deve ser 120");
    }

    @Test
    public void TPGTAHC_fatorial_DeveCalcularFatorialDe3() {
        int resultado = calc.fatorial(3);
        assertEquals(6, resultado, "Fatorial de 3 deve ser 6");
    }

    @Test
    public void TPGTAHC_fatorial_DeveCalcularFatorialDe1() {
        int resultado = calc.fatorial(1);
        assertEquals(1, resultado, "Fatorial de 1 deve ser 1");
    }

    @Test
    public void TPGTAHC_fatorial_DeveCalcularFatorialDe2() {
        int resultado = calc.fatorial(2);
        assertEquals(2, resultado, "Fatorial de 2 deve ser 2");
    }

    @Test
    public void TPGTAHC_somaDobro_DeveCalcularSomaDobroPositivo() {
        int resultado = calc.somaDobro(2, 3);
        assertEquals(8, resultado, "2 + 3*2 deve ser 8");
    }

    @Test
    public void TPGTAHC_somaDobro_DeveCalcularSomaDobroComZero() {
        int resultado = calc.somaDobro(5, 0);
        assertEquals(5, resultado, "5 + 0*2 deve ser 5");
    }

    @Test
    public void TPGTAHC_somaDobro_DeveCalcularSomaDobroComNegativo() {
        int resultado = calc.somaDobro(4, -2);
        assertEquals(0, resultado, "4 + (-2)*2 deve ser 0");
    }

    @Test
    public void TPGTAHC_somaDobro_DeveCalcularSomaDobroComValoresGrandes() {
        int resultado = calc.somaDobro(1000, 2000);
        assertEquals(5000, resultado, "1000 + 2000*2 deve ser 5000");
    }

}
