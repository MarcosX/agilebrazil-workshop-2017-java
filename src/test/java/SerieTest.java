import org.junit.Test;

import static org.junit.Assert.*;

public class SerieTest {

    @Test
    public void mostraPrecoEmVariasMoedas() {
        Serie serie = new Serie("The Office");
        serie.definirPreco(49990, "BRL");

        assertEquals("BRL 499.90", serie.precoBox("BRL"));
        assertEquals("USD 159.96", serie.precoBox("USD"));
        assertEquals("EUR 129.97", serie.precoBox("EUR"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void lancaErroComMoedaInvalida() {
        Serie serie = new Serie("The Office");
        serie.definirPreco(49990, "BRL");

        assertEquals("BRL 499.90", serie.precoBox("USB"));
    }
}