package com.mycompany.aplicando_padrao_builder;

// para usar na construção do objeto
import objetos.Redacao;
import objetos.strategy.EstruturaTexto;
/**
 *
 * @author Daniel_Korban
 * 
 */
public class RedacaoBuilder implements Builder{
    private String texto;
    private String tema;
    private String palavras;
    // poder ser uma interface para estrategy(redação, musica, artigo ou poema);
    private EstruturaTexto estruturaTexto;
    private String descricao;
    
    public void textMotivador(String texto){
        this.texto = texto;
    }

    @Override
    public void inserirTema(String tema) {
        this.tema = tema;
    }

    @Override
    public void inserirPalavrasChave(String palavras) {
        this.palavras = palavras;
    }

    @Override
    public void montarComposicao(EstruturaTexto estruturaTexto) {
        this.estruturaTexto = estruturaTexto;
    }

    @Override
    public void descrever(String descricao) {
        this.descricao = descricao;
    }
    
    public Redacao getResutado(){
        return new Redacao(texto, tema, palavras, estruturaTexto, descricao);
    }
    
}
