package TemplateMethodTest;

import TemplateMethod.BolaBasquete;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BolaBasqueteTest {

    @Test
    void deveRetornarBolaComDefeito(){
        BolaBasquete bola = new BolaBasquete();
        bola.setPreco(5);
        assertEquals("bola com defeito",bola.verificaCondicaoComBaseNoPreco());

    }

    @Test
    void deveRetornarBolaEmPerfeitasCondicoes(){
        BolaBasquete bola = new BolaBasquete();
        bola.setPreco(20);
        assertEquals("bola em perfeitas condicoes",bola.verificaCondicaoComBaseNoPreco());

    }

    @Test
    void deveRetornarInfoBola(){
        BolaBasquete bola = new BolaBasquete();
        bola.setPreco(5);
        bola.setTamanho("grande");
        bola.setEsporte("Basquete");
        bola.setId(0);
        assertEquals("Bola{id=0, esporte='Basquete', preco=5.0, tamanho='grande'}",bola.getInfoBola());

    }
}
