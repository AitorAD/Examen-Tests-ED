package es.iesmz.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {
    @Test
    public void pruebaEUR_USD() {
        float expected = 28.37f;

        Money m = new Money();
        assertEquals(expected, m.change(TipoMoneda.EUR, TipoMoneda.USD, 23.88f), 0.01);
    }

    @Test
    public void pruebaGBP_EUR() {
        float expected = 1165.83f;

        Money m = new Money();
        assertEquals(expected, m.change(TipoMoneda.GBP, TipoMoneda.EUR, 1000.0f), 0.01);
    }

    @Test
    public void pruebaEUR_GBP() {
        float expected = 201.21f;

        Money m = new Money();
        assertEquals(expected, m.change(TipoMoneda.EUR, TipoMoneda.GBP, 234.56f), 0.01);
    }

    @Test
    public void pruebaUSD_EUR() {
        float expected = 37.51f;

        Money m = new Money();
        assertEquals(expected, m.change(TipoMoneda.USD, TipoMoneda.EUR, 44.56f), 0.01);
    }

    @Test
    public void pruebaGBP_USD() {
        float expected = 138.49f;

        Money m = new Money();
        assertEquals(expected, m.change(TipoMoneda.GBP, TipoMoneda.USD, 100.0f), 0.01);
    }

    @Test
    public void pruebaUSD_GBP() {
        float expected = 722.14f;

        Money m = new Money();
        assertEquals(expected, m.change(TipoMoneda.USD, TipoMoneda.GBP, 1000.0f), 0.01);
    }
    @Test
    public void pruebaPTS_EUR() {
        float expected = -1f;

        Money m = new Money();
        assertEquals(expected, m.change(TipoMoneda.PTS, TipoMoneda.EUR, 100.0f), 0.01);
    }
    @Test
    public void pruebaEUR_PTS() {
        float expected = -1f;

        Money m = new Money();
        assertEquals(expected, m.change(TipoMoneda.EUR, TipoMoneda.PTS, 123.3f), 0.01);
    }
    @Test
    public void pruebaCantidadNegativa() {
        float expected = -1f;

        Money m = new Money();
        assertEquals(expected, m.change(TipoMoneda.USD, TipoMoneda.EUR, -167.34f), 0.01);
    }
}