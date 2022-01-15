package TemplateMethod;

public class BolaBasquete extends Bola {

    @Override
    public String fazerPonto() {
        return "Ponto!";
    }

    @Override
    public String verificaCondicaoComBaseNoPreco() {
        if(this.getPreco()<10) return "bola com defeito";
        else return "bola em perfeitas condicoes";
    }
}
