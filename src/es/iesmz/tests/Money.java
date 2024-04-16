package es.iesmz.tests;

public class Money {
    public Money() {
    }

    public float change(TipoMoneda origen, TipoMoneda destino, float money) {
        float cambio = -1f;
        if (money > 0) {
            if (!origen.equals(TipoMoneda.PTS) || !destino.equals(TipoMoneda.PTS)) {
                if (origen.equals(TipoMoneda.EUR) && destino.equals(TipoMoneda.USD)) cambio = money * 1.18798f;
                else if (origen.equals(TipoMoneda.USD) && destino.equals(TipoMoneda.EUR)) cambio = money * 0.841815f;
                else if (origen.equals(TipoMoneda.EUR) && destino.equals(TipoMoneda.GBP)) cambio = money * 0.857839f;
                else if (origen.equals(TipoMoneda.GBP) && destino.equals(TipoMoneda.EUR)) cambio = money * 1.165826f;
                else if (origen.equals(TipoMoneda.GBP) && origen.equals(TipoMoneda.USD)) cambio = (money * 1.165826f) * 1.18798f;
            }
        }
        return cambio;
    }
}
