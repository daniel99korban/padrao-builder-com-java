package objetos;
/**
 * @author Daniel_Korban
 * 
 * Classe que representa um texto de redação
 */
import objetos.strategy.EstruturaTexto;

public class Redacao {
    
    // private String texto;
    private String tema;
    private String palavras;
    private String estruturaTexto;
    private String descricao;
    private double nota;
    
    /**
     * @param texto texto motivador
     * @param tema tama a ser abordado
     * @param palavras palavras chave sobre o tema
     * @param estruturaTexto introdução desenvolvimento 1, 2 e/ou 3, conclusão
     * @param descricao um breve resumo que descrevao texto como um todo
     */
    public Redacao(/*String texto,*/String tema, String palavras, EstruturaTexto estruturaTexto, String descricao) {
        // this.texto = texto;
        this.tema = tema;
        this.palavras = palavras;
        this.estruturaTexto = estruturaTexto.obterEstrutura();
        this.descricao = descricao;
        this.nota = 1000;
    }

    /*public String getTexto() {
        return texto;
    }*/

    public String getTema() {
        return tema;
    }

    public String getPalavras() {
        return palavras;
    }

    public String getEstruturaTexto() {
        return estruturaTexto;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Redacao\n" + /*"texto = " + texto +*/ "tema = " + tema + ",\n palavras = " + palavras + ",\n estrutura Texto = " + estruturaTexto + ",\n descricao = " + descricao + ", \nnota = " + nota;
    }
}
