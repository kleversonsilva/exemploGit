package br.ufpb.dcx.aps.atividades.decorator.sorvete;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SorveteDecoratorTest {


    @Test
    void testSorveteBasico() {

        ElementoSorvete sorvete = new Casquinha();

        assertEquals(0.5, sorvete.getPreco(),0.0001);
        assertEquals(0.5, sorvete.getPreco(),0.0001);

        ElementoSorvete sorveteComBola = new BolaSorvete("chocolate", new Casquinha());

        assertEquals(1.0,sorveteComBola.getPreco(),0.0001);
        assertEquals("chocolate, casquinha",sorveteComBola.getSabor());

        ElementoSorvete sorveteDuplo = new BolaSorvete("chocolate", new BolaSorvete("creme", new Casquinha()));

        assertEquals(1.5, sorveteDuplo.getPreco(),0.0001);
        assertEquals("chocolate, creme, casquinha", sorveteDuplo.getSabor());

        ElementoSorvete sorveteCopinho = new BolaSorvete("chocolate", new Copinho());
        assertEquals(1.0, sorveteCopinho.getPreco(),0.0001);
        assertEquals("chocolate, ",sorveteCopinho.getSabor());

        ElementoSorvete sorveteCalda = new Calda("chocolate", new BolaSorvete("morango", new Casquinha()));

        assertEquals(1.1, sorveteCalda.getPreco(),0.0001);
        assertEquals("calda(chocolate), morango, casquinha",sorveteCalda.getSabor());
    }

    @Test
    void testBananaSplit() {

        ElementoSorvete bananaSplit = new Calda("baunilha", new BolaSorvete("chocolate", new BolaSorvete("morango",new Banana(new Vasilha()))));
        double precoResult = bananaSplit.getPreco();

        //Verifiquem se o assert a seguir vai dar erro. Se sim, arredondem o double.
        assertEquals(1.40,precoResult,0.0001);
        assertEquals("calda(baunilha), chocolate, morango, banana, ",bananaSplit.getSabor());
    }
}
