package es.iesmz.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {
    @Test
    public void prueba1() {
        float expected = 28.37f;

        Money m = new Money();
        assertEquals(expected, m.change(TipoMoneda.EUR, TipoMoneda.USD, 23.88f), 0.01);
    }

    @Test
    public void prueba2() {
        float expected = 1165.83f;

        Money m = new Money();
        assertEquals(expected, m.change(TipoMoneda.GBP, TipoMoneda.EUR, 1000.0f), 0.01);
    }

    @Test
    public void prueba3() {
        float expected = 201.21f;

        Money m = new Money();
        assertEquals(expected, m.change(TipoMoneda.EUR, TipoMoneda.GBP, 234.56f), 0.01);
    }

    @Test
    public void prueba4() {
        float expected = 37.51f;

        Money m = new Money();
        assertEquals(expected, m.change(TipoMoneda.USD, TipoMoneda.EUR, 44.56f), 0.01);
    }

    @Test
    public void prueba5() {
        float expected = 138.49f;

        Money m = new Money();
        assertEquals(expected, m.change(TipoMoneda.GBP, TipoMoneda.USD, 100.0f), 0.01);
    }

    @Test
    public void prueba6() {
        float expected = 722.14f;

        Money m = new Money();
        assertEquals(expected, m.change(TipoMoneda.USD, TipoMoneda.GBP, 1000.0f), 0.01);
    }
    @Test
    public void prueba7() {
        float expected = -1f;

        Money m = new Money();
        assertEquals(expected, m.change(TipoMoneda.PTS, TipoMoneda.EUR, 100.0f), 0.01);
    }
    @Test
    public void prueba8() {
        float expected = -1f;

        Money m = new Money();
        assertEquals(expected, m.change(TipoMoneda.EUR, TipoMoneda.PTS, 123.3f), 0.01);
    }
    @Test
    public void prueba9() {
        float expected = -1f;

        Money m = new Money();
        assertEquals(expected, m.change(TipoMoneda.USD, TipoMoneda.EUR, -167.34f), 0.01);
    }
}