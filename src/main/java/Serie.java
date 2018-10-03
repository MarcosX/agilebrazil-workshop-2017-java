public class Serie {

    private String nome;

    private int preco;

    private String moeda;

    public Serie(String nome) {
        this.nome = nome;
    }

    public void definirPreco(int preco, String moeda) {
        this.preco = preco;
        this.moeda = moeda;
    }

    public String precoBox(String moeda) {
        int preco = new CotacaoUtil().converter(this.preco, this.moeda, moeda);
        int precoMoeda = preco/100;
        int precoCentavos = preco%100;
        return String.format("%s %d.%d", moeda, precoMoeda, precoCentavos);
    }
}
