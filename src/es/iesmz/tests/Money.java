package es.iesmz.tests;

public class Money {
    private final float EUR_USD = 1.18798f;
    private final float USD_EUR = 0.841815f;
    private final float EUR_GBP = 0.857839f;
    private final float GBP_EUR = 1.165826f;
    private final float GBP_USD = GBP_EUR * EUR_USD;
    private final float USD_GBP = USD_EUR * EUR_GBP;

    public Money() {
    }

    public float change(TipoMoneda origen, TipoMoneda destino, float money) {
        float cambio = -1f;
        if (money > 0) {
            if (!origen.equals(TipoMoneda.PTS) || !destino.equals(TipoMoneda.PTS)) {
                if (origen.equals(TipoMoneda.EUR) && destino.equals(TipoMoneda.USD)) cambio = money * EUR_USD;
                else if (origen.equals(TipoMoneda.USD) && destino.equals(TipoMoneda.EUR)) cambio = money * USD_EUR;
                else if (origen.equals(TipoMoneda.EUR) && destino.equals(TipoMoneda.GBP)) cambio = money * EUR_GBP;
                else if (origen.equals(TipoMoneda.GBP) && destino.equals(TipoMoneda.EUR)) cambio = money * GBP_EUR;
                else if (origen.equals(TipoMoneda.GBP) && destino.equals(TipoMoneda.USD)) cambio = money * GBP_USD;
                else if (origen.equals(TipoMoneda.USD) && destino.equals(TipoMoneda.GBP)) cambio = money * USD_GBP;
            }
        }
        return cambio;
    }
}
