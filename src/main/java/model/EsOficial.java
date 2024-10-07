package model;

import java.util.Date;

public class EsOficial extends EntradaSaida {
    private int kmRegistrado;

    // Construtor, getters e setters
    public EsOficial(int id, Date data, TipoEntradaSaida tipo, int kmRegistrado) {
        super(id, data, tipo);
        this.kmRegistrado = kmRegistrado;
    }

    public int getKmRegistrado() {
        return kmRegistrado;
    }

    public void setKmRegistrado(int kmRegistrado) {
        this.kmRegistrado = kmRegistrado;
    }
}
