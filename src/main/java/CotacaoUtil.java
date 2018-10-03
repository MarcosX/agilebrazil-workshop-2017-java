import java.util.HashMap;

public class CotacaoUtil {

    private HashMap<String, HashMap<String, Integer>> cotacao = new HashMap<>();

    public CotacaoUtil() {
        HashMap<String, Integer> cotacaoBrl = new HashMap<>();
        cotacaoBrl.put("BRL", 100);
        cotacaoBrl.put("USD", 32);
        cotacaoBrl.put("EUR", 26);
        cotacao.put("BRL", cotacaoBrl);

        HashMap<String, Integer> cotacaoUsd = new HashMap<>();
        cotacaoUsd.put("USD", 100);
        cotacaoUsd.put("BRL", 309);
        cotacaoUsd.put("EUR", 83);
        cotacao.put("USD", cotacaoUsd);

        HashMap<String, Integer> cotacaoEur =  new HashMap<>();
        cotacaoEur.put("EUR", 100);
        cotacaoEur.put("BRL", 373);
        cotacaoEur.put("USD", 120);
        cotacao.put("EUR", cotacaoEur);
    }

    public int converter(int preco, String moedaBase, String moedaConversao) {
        if (moedaExiste(moedaBase) && moedaExiste(moedaConversao)) {
            int valorCotacao = this.cotacao.get(moedaBase).get(moedaConversao);
            return (preco * valorCotacao) / 100;
        }
        throw new IllegalArgumentException("Moeda invalida");
    }

    public boolean moedaExiste(String moeda) {
        return this.cotacao.containsKey(moeda);
    }
}
