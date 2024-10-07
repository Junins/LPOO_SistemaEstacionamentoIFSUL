package model;

public class Veiculo {
    private String placa;
    private String cor;
    private int id;
    private Modelo modelo;
    private Marca marca;
    private TipoVeiculo tipo;

    // Construtor, getters e setters
    public Veiculo(String placa, String cor, int id, Modelo modelo, Marca marca, TipoVeiculo tipo) {
        this.placa = placa;
        this.cor = cor;
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public TipoVeiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVeiculo tipo) {
        this.tipo = tipo;
    }
}
