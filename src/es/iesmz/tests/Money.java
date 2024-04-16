package es.iesmz.tests;

public class Money {
    private TipoMoneda tipoMoneda;
    private float cantidad;

    public Money(TipoMoneda tipoMoneda, float cantidad) {
        this.tipoMoneda = tipoMoneda;
        this.cantidad = cantidad;
    }

    public float change(TipoMoneda origen, TipoMoneda destino, float money) {
        if (money > 0) {
            if (!origen.equals(TipoMoneda.PTS) || !destino.equals(TipoMoneda.PTS)) {
                if (origen.equals(TipoMoneda.EUR) && destino.equals(TipoMoneda.USD)) money = money * 1.18798f;
                else if (origen.equals(TipoMoneda.USD) && destino.equals(TipoMoneda.EUR)) money = money * 0.841815f;
                else if (origen.equals(TipoMoneda.EUR) && destino.equals(TipoMoneda.GBP)) money = money * 0.857839f;
                else if (origen.equals(TipoMoneda.GBP) && destino.equals(TipoMoneda.EUR)) money = money * 1.165826f;
                return money;
            }
        }
        return -1;
    }
}
