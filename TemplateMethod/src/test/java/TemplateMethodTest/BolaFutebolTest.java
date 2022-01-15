package TemplateMethodTest;
import TemplateMethod.BolaFutebol;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BolaFutebolTest {
    @Test
    void deveRetornarBolaComDefeito(){
        BolaFutebol bola = new BolaFutebol();
        bola.setPreco(2);
        assertEquals("bola com defeito",bola.verificaCondicaoComBaseNoPreco());

    }

    @Test
    void deveRetornarBolaEmPerfeitasCondicoes(){
        BolaFutebol bola = new BolaFutebol();
        bola.setPreco(20);
        assertEquals("bola em perfeitas condicoes",bola.verificaCondicaoComBaseNoPreco());

    }

    @Test
    void deveRetornarInfoBola(){
        BolaFutebol bola = new BolaFutebol();
        bola.setPreco(5);
        bola.setTamanho("grande");
        bola.setEsporte("Futebol");
        bola.setId(0);
        assertEquals("Bola{id=0, esporte='Futebol', preco=5.0, tamanho='grande'}",bola.getInfoBola());

    }
}
