package objetos.strategy;
/**
 * @author Daniel_Korban
 */
public class TextoRedacao implements EstruturaTexto{
    private String introducao;
    private String desenvolvimento1;
    private String desenvolvimento2;
    private String conclusao;

    public TextoRedacao(String introducao, String desenvolvimento1, String desenvolvimento2, String conclusao) {
        this.introducao = introducao;
        this.desenvolvimento1 = desenvolvimento1;
        this.desenvolvimento2 = desenvolvimento2;
        this.conclusao = conclusao;
    }

    @Override
    public String obterEstrutura() {
        return "TextoRedacao{" + "introducao=" + introducao + ", desenvolvimento1=" + desenvolvimento1 + ", desenvolvimento2=" + desenvolvimento2 + ", conclusao=" + conclusao + '}';
    }

}
