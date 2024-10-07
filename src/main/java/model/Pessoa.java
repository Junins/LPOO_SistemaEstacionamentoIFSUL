package model;

public class Pessoa {
    private int id;
    private String nome;
    private String fone;
    private String email;
    private VinculoPessoa vinculo;

    // Construtor, getters e setters
    public Pessoa(int id, String nome, String fone, String email, VinculoPessoa vinculo) {
        this.id = id;
        this.nome = nome;
        this.fone = fone;
        this.email = email;
        this.vinculo = vinculo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public VinculoPessoa getVinculo() {
        return vinculo;
    }

    public void setVinculo(VinculoPessoa vinculo) {
        this.vinculo = vinculo;
    }
}
