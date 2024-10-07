package model;

import java.util.Date;

public class EntradaSaida {
    private int id;
    private Date data;
    private TipoEntradaSaida tipo;

    // Construtor, getters e setters
    public EntradaSaida(int id, Date data, TipoEntradaSaida tipo) {
        this.id = id;
        this.data = data;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public TipoEntradaSaida getTipo() {
        return tipo;
    }

    public void setTipo(TipoEntradaSaida tipo) {
        this.tipo = tipo;
    }
}
