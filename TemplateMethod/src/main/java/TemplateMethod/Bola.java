package TemplateMethod;

public abstract class Bola {
    private int id;
    protected String esporte;
    private float preco;
    private String tamanho;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEsporte() {
        return esporte;
    }

    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String testarBola() {
        return "Bola testada";
    }

    public abstract String fazerPonto();

    public abstract String verificaCondicaoComBaseNoPreco();

    public String getInfoBola() {
        return "Bola{" +
                "id=" + id +
                ", esporte='" + esporte + '\'' +
                ", preco=" + preco +
                ", tamanho='" + tamanho + '\'' +
                '}';
    }
}
