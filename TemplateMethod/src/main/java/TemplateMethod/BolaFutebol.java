package TemplateMethod;

public class BolaFutebol extends Bola {
    @Override
    public String fazerPonto() {
        return "Gol!";
    }

    @Override
    public String verificaCondicaoComBaseNoPreco() {
        if(this.getPreco()<5) return "bola com defeito";
        else return "bola em perfeitas condicoes";
    }
}
