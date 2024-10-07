package model;

public class VeiculoOficial extends Veiculo {
    private String renavan;
    private String chassi;

    // Construtor, getters e setters
    public VeiculoOficial(String placa, String cor, int id, Modelo modelo, Marca marca, TipoVeiculo tipo, String renavan, String chassi) {
        super(placa, cor, id, modelo, marca, tipo);
        this.renavan = renavan;
        this.chassi = chassi;
    }

    public String getRenavan() {
        return renavan;
    }

    public void setRenavan(String renavan) {
        this.renavan = renavan;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
}
