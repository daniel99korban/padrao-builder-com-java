package objetos;

import objetos.strategy.EstruturaTexto;

/**
 *
 * @author Daniel_Korban
 */
public class Musica {
    private String tema;
    private String palavras;
    private String estruturaMusica;
    private String descricao;
    
    /**
     * @param tema assunto a ser explorado pela musica
     * @param palavras palavras relacionadas a musica
     * @param estruturaMusica composição básica da musica
     * @param descricao um resumo geral sobre do que se trata a musica
     */

    public Musica(String tema, String palavras, EstruturaTexto estruturaMusica, String descricao) {
        this.tema = tema;
        this.palavras = palavras;
        this.estruturaMusica = estruturaMusica.obterEstrutura();
        this.descricao = descricao;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getPalavras() {
        return palavras;
    }

    public void setPalavras(String palavras) {
        this.palavras = palavras;
    }

    public String getEstruturaMusica() {
        return estruturaMusica;
    }

    public void setEstruturaMusica(String estruturaMusica) {
        this.estruturaMusica = estruturaMusica;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
