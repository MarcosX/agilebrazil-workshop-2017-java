import org.junit.Test;

import static org.junit.Assert.*;

public class CotacaoUtilTest {

    @Test
    public void converteMoedaValida() {
        assertEquals(309, new CotacaoUtil().converter(100, "USD", "BRL"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void lancaErroComMoedaInvalida() {
        new CotacaoUtil().converter(100, "USD", "USB");
    }

    @Test
    public void cotacaoBrlExiste() {
        assertTrue(new CotacaoUtil().moedaExiste("BRL"));
    }

    @Test
    public void cotacaoUsdExiste() {
        assertTrue(new CotacaoUtil().moedaExiste("USD"));
    }

    @Test
    public void cotacaoEurExiste() {
        assertTrue(new CotacaoUtil().moedaExiste("EUR"));
    }

    @Test
    public void cotacaoUsbNaoExiste() {
        assertFalse(new CotacaoUtil().moedaExiste("USB"));
    }
}