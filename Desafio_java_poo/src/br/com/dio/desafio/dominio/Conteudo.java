package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    protected String titulo;
    protected String descricao;

    public static double XP_PADRAO = 10d;

    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double calcularXp() {

    }
}
